import greenfoot.*;

/**
 * Write a description of class level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4 extends World
{

    /**
     * Constructor for objects of class level4.
     * 
     */
    public level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 550, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        lava lava = new lava();
        addObject(lava, 250, 520);
        
        lava lava2 = new lava();
        addObject(lava2, 750, 520);
   
        lava lava3 = new lava();
        addObject(lava3, 1015, 520);
        
        platform1 platform1 = new platform1();
        addObject(platform1, 530, 100);
        
        platform1 platform12 = new platform1();
        addObject(platform12, 240, 220);
        
        platform1 platform13 = new platform1();
        addObject(platform13, 830, 230);
        
        movingPlat movingplat = new movingPlat();
        addObject(movingplat, 550, 370);
        
        platform1 platform14 = new platform1();
        addObject(platform14, 200, 450);
        
        platform1 platform15 = new platform1();
        addObject(platform15, 900, 450);

        platform1 platform16 = new platform1();
        addObject(platform16, 1050, 110);
        
        locked_portal locked_portal = new locked_portal();
        addObject(locked_portal, 1015, 50);
        
        lavaEnemy lavaenemy = new lavaEnemy();
        addObject(lavaenemy, 550, 300);
        
        ghost ghost = new ghost();
        addObject(ghost, 850, 160);
        
        ghost ghost2 = new ghost();
        addObject(ghost, 890, 400);
        
        ghost ghost3 = new ghost();
        addObject(ghost, 200, 400);
        
        ghost ghost4 = new ghost();
        addObject(ghost, 240, 150);
        
        key key = new key();
        addObject(key, 100, 400);
        
        jack jack = new jack();
        addObject(jack, 540, 50);

        jack.spawnX = 540;
        jack.spawnY = 50;
        
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
