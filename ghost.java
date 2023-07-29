import greenfoot.*;

/**
 * Write a description of class jack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ghost extends Actor
{
    private int vSpeed = 0;
    private int acc = 1;
    private int speed = 2;
    private int spriteHeight = getImage().getHeight();
    private int spriteWidth = getImage().getWidth();
    private int lookForEdge = (int)spriteWidth/2;
    private int lookForGroundDistance = (int)spriteHeight/2;
    private int lives = 2;
    /**
     * Act - do whatever the jack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("ghost.png");
        checkEdge();
        walk();
        checkFall();
        if (isTouching(shot.class))
        {
            
            removeTouching(shot.class);
            lives=lives-1;
        }
        if(speed<0)
        {
            
            setImage("ghost_2.png");
        }
        else
        {
            setImage("ghost.png");
        }
        if (lives == 1)
        {
                if(speed<0)
            {
                
                setImage("gosthHurt_2.png");
            }
            else
            {
                setImage("gosthHurt.png");
            }
        }
        if (lives == 0)
        {
            die();
        }
    }   
    public boolean onGround()
    {
       
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, brick.class);  
        return under != null;  
        
    }
    public boolean onPlatform()
    {
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, platform.class);  
        return under != null; 
    }
    public void fall()
    {
        setLocation(getX(),getY()+vSpeed);
        vSpeed = vSpeed + acc;
    }
    public void checkFall()
    {
        if (onGround())
        {
            vSpeed = 0;
        }
        else if (onPlatform())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
   
    public void walk()
    {
        Actor ground = getOneObjectAtOffset(lookForEdge, lookForGroundDistance, platform.class);
        if(ground == null)
        {
            speed *= -1; // Reverses direction
            setImage("ghost_2.png");
            lookForEdge *= -1; // Looks for a negative number
        }
        else
        {
            move(speed);
        }
        
    }
    public void checkEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
        {
            speed *= -1;
        }
    } 
    public void die()
    {
        Greenfoot.playSound("kill.mp3"); 
        coin coin = new coin();
        getWorld().addObject(coin,getX(),getY());
        getWorld().removeObject(this);
    }
}
