import greenfoot.*;

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
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
        addObject(brick,550,525);

        platform1 platform1 = new platform1();
        addObject(platform1, 150, 300);

        platform1 platform12 = new platform1();
        addObject(platform12, 450, 300);

        platform1 platform13 = new platform1();
        addObject(platform13, 750, 300);

        platform1 platform14 = new platform1();
        addObject(platform14, 1100, 435);

        platform1 platform15 = new platform1();
        addObject(platform15,150,175);

        platform1 platform16 = new platform1();
        addObject(platform16,1050,140);

        player player = new player();
        addObject(player, 40, 430);

        ghost ghost = new ghost();
        addObject(ghost, 1050, 373);

        ghost ghost2 = new ghost();
        addObject(ghost2, 120, 240);

        ghost ghost3 = new ghost();
        addObject(ghost3, 460, 235);

        ghost ghost4 = new ghost();
        addObject(ghost4, 740, 240);

        ghost ghost5 = new ghost();
        addObject(ghost5, 120, 110);

        ghost ghost6 = new ghost();
        addObject(ghost6, 1020, 80);
        
        platform14.setLocation(946, 435);
        platform16.setLocation(946, 140);

        hearts hearts = new hearts();
        addObject(hearts, 100, 50);

        arrowUI arrowui = new arrowUI();
        addObject(arrowui, 50, 100);

        player.lives = 5;
        player.ammo = player.ammo + 10;
        player.spawnX = 50;
        player.spawnY = 390;
        
        portal2 portal2 = new portal2();
        addObject(portal2, 1050, 60);
        
        buyArrows buyarrows = new buyArrows();
        addObject(buyarrows,90,140);
    }
    public void act()
    {
        showText("= "+player.ammo,80,100);
        showText("Almas: "+player.money,550,50);
    }
}
