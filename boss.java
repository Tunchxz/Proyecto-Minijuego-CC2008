import greenfoot.*;

/**
 * Write a description of class boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss extends Actor
{
    private int timer = 0;
    private int speed = 1;
    private int y = 0;
    private int lives = 10;
    /**
     * Act - do whatever the boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().showText("Enemy Lives: "+lives,1000,100);
        setLocation(getX(),getY()+speed);
        setImage("boss.png");
        if (isTouching(fireball.class))
        {
            lives--;
            removeTouching(fireball.class);
            setImage("explosion_red.png");
            Greenfoot.delay(10);
        }
        if (isTouching(shot.class))
        {
            lives--;
            removeTouching(shot.class);
        }
        if (isAtEdge())
        {
            speed = speed * -1;
        }
        if (isTouching(brick.class))
        {
            speed = speed * -1;
        }
        y = getY();
        if (y == 320 || y == 180 || y == 50)
        {
            fireball fireball = new fireball();
            getWorld().addObject(fireball,getX()-80,getY());
        }
        if (lives == 0)
        {
            Greenfoot.setWorld(new gameOver());
        }
    }    
}
