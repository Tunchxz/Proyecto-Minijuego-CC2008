import greenfoot.*;

/**
 * Write a description of class level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level5 extends World
{

    /**
     * Constructor for objects of class level5.
     * 
     */
    public level5()
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
        brick brick = new brick();
        addObject(brick, 550, 520);

        boss boss = new boss();
        addObject(boss, 1025, 385);

        player.spawnX = 50;
        player.spawnY = 390;

        hearts hearts = new hearts();
        addObject(hearts, 100, 50);

        arrowUI arrowui = new arrowUI();
        addObject(arrowui, 50, 100);

        player.lives = 5;
        player.ammo = player.ammo + 10;

        barrier barrier = new barrier();
        addObject(barrier, 970, 225);

        ladder ladder = new ladder();
        addObject(ladder, 115, 255);

        platform1 platform1 = new platform1();
        addObject(platform1, 295, 385);

        platform1 platform12 = new platform1();
        addObject(platform12, 295, 255);

        platform1 platform13 = new platform1();
        addObject(platform13, 295, 120);

        movingPlat movingplat = new movingPlat();
        addObject(movingplat, 630, 385);

        movingPlat movingplat2 = new movingPlat();
        addObject(movingplat2, 650, 255);

        movingPlat movingplat3 = new movingPlat();
        addObject(movingplat3, 670, 120);

        player player = new player();
        addObject(player, 50, 390);
        
    }
    public void act()
    {
        showText("= "+player.ammo,80,100);
        showText("Almas: "+player.money,550,50);
    }
}
