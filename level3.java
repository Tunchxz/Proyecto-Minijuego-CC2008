import greenfoot.*;

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 550, 1); 

        prepare();
    }
    

    public void prepare()
    {

        brick brick = new brick();
        addObject(brick, 55, 520);

        lava lava = new lava();
        addObject(lava, 855, 520);

        movingPlat movingPlat = new movingPlat();
        addObject(movingPlat, 930, 380);

        movingPlat movingPlat2 = new movingPlat();
        addObject(movingPlat2, 670, 260);

        movingPlat movingPlat3 = new movingPlat();
        addObject(movingPlat3, 400, 140);

        portal3 portal3 = new portal3();
        addObject(portal3, 1055, 55);

        jack jack = new jack();
        addObject(jack, 50, 420);
        
        jack.spawnX = 50;
        jack.spawnY = 390;
        
        lavaEnemy lavaenemy = new lavaEnemy();
        addObject(lavaenemy, 950, 320);
        
        lavaEnemy lavaenemy2 = new lavaEnemy();
        addObject(lavaenemy2, 670, 200);
        
        lavaEnemy lavaenemy3 = new lavaEnemy();
        addObject(lavaenemy3, 380, 80);

        hearts hearts = new hearts();
        addObject(hearts, 100, 50);

        arrowUI arrowui = new arrowUI();
        addObject(arrowui, 50, 100);

        jack.lives = 5;
        jack.ammo = jack.ammo + 10;
        
         buyArrows buyarrows = new buyArrows();
        addObject(buyarrows, 90, 140);
        
 
    }
    public void act()
    {
        showText("= "+jack.ammo,80,100);
        showText("Money: "+jack.money,550,50);
    }
}
