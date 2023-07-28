import greenfoot.*;

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    GreenfootSound sound = new GreenfootSound("play.mp3");
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
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
        addObject(brick,550,490);

        platform1 platform1 = new platform1();
        addObject(platform1, 500, 400);

        platform1 platform12 = new platform1();
        addObject(platform12, 800, 300);

        platform1 platform13 = new platform1();
        addObject(platform13, 1100, 200);

        portal portal = new portal();
        addObject(portal, 1064, 121);

        ghost ghost = new ghost();
        addObject(ghost, 500, 340);

        ghost ghost2 = new ghost();
        addObject(ghost2, 800, 245);

        player player = new player();
        addObject(player,50,390);

        player.spawnX = 50;
        player.spawnY = 390;

        hearts hearts = new hearts();
        addObject(hearts, 100, 50);

        arrowUI arrowui = new arrowUI();
        addObject(arrowui, 50, 100);

        player.lives = 5;
        player.ammo = 10;
        player.money = 0;
        
        buyArrows buyarrows = new buyArrows();
        addObject(buyarrows,90,140);
        
        sound.play();
       
    }
    public void act()
    {
        showText("= "+player.ammo,80,100);
        showText("Almas: "+player.money,550,50);
    }
    
}
