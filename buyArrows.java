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
    public void act() 
    {
       if (Greenfoot.mouseClicked(this) && jack.money >= 10)
        {
            jack.ammo = jack.ammo + 5;
            jack.money = jack.money - 10;
        }
    }    
}
