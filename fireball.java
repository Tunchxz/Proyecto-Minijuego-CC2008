import greenfoot.*;

/**
 * Write a description of class fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireball extends Actor
{
    private int speed = 4;
    /**
     * Act - do whatever the fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed * -1);
        if (speed / 1 == speed * -1)
        {
            setImage("fireball2.png");
        }
        if (isTouching(player.class) && Greenfoot.isKeyDown("down"))
        {
            speed = speed * -1;
        }
        else if (isTouching(player.class) && !Greenfoot.isKeyDown("down"))
        {
            getWorld().removeObject(this);
            player.lives--;
        }
        else if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }    
}
