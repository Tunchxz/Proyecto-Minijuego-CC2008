import greenfoot.*;

/**
 * Write a description of class buyArrows here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buyArrows extends Actor
{
    /**
     * Act - do whatever the buyArrows wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound sound = new GreenfootSound("buy.mp3");

    public void act() 
    {
       if (Greenfoot.isKeyDown("x") && player.money >= 10)
        {
            player.ammo = player.ammo + 5;
            player.money = player.money - 10;
            sound.play();
        }
    }    
}
