import greenfoot.*;

/**
 * Write a description of class lavaEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lavaEnemy extends Actor
{
    private int speed = 3;
    /**
     * Act - do whatever the lavaEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+speed,getY());
        if(isAtEdge())
        {
            speed = speed * -1;
        }
        else if (isTouching(barrier.class))
        {
            speed = speed * -1;
        }
        if (isTouching(shot.class))
        {
            removeTouching(shot.class);
            die();
        }
    }    
    public void die()
    {
        coin coin = new coin();
        getWorld().addObject(coin,getX(),getY());
        getWorld().removeObject(this);
    }
}
