import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonSalir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonSalir extends Actor
{
    /**
     * Act - do whatever the BotonSalir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.stop();
        }// Add your action code here.
    }
}
