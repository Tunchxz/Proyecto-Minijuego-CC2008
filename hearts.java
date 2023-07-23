import greenfoot.*;

/**
 * Write a description of class hearts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hearts extends Actor
{
    /**
     * Act - do whatever the hearts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (jack.lives == 1)
        {
            setImage("hearts_1.png");
        }
        if (jack.lives == 2)
        {
            setImage("hearts_2.png");
        }
        if (jack.lives == 3)
        {
            setImage("hearts_3.png");
        }
        if (jack.lives == 4)
        {
            setImage("hearts_4.png");
        }
        if (jack.lives == 5)
        {
            setImage("hearts_5.png");
        }
        if (jack.lives == 0)
        {
            setImage("nothing.png");
        }
    }    
}
