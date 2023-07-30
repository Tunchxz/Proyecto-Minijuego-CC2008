import greenfoot.*;  
public class Menu extends World
{
    Flecha flecha = new Flecha();
    private int opcion = 0; // 0 = Jugar 1 = Salir
    //instead of:
    GreenfootSound sound = new GreenfootSound("menu.mp3");
public Menu()
{
    // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    super(1100, 550, 1); 
    prepararMundo();
    
}
/**
 
Prepare the world for the start of the program.
That is: create the initial objects and add them to the world.
*/
private void prepararMundo()
{
    //Greenfoot.playSound("menu.mp3");
    BotonJugar botonJugar = new BotonJugar();
    BotonSalir botonSalir = new BotonSalir();
    addObject(botonJugar,525,290);
    addObject(botonSalir,525,380);
    addObject(flecha, 350,290);
    sound.play();
}

public void act(){
    if (Greenfoot.isKeyDown("up") && opcion != 0) {
            Greenfoot.playSound("select.mp3");
            opcion++;
        }
        if (Greenfoot.isKeyDown("down") && opcion != 1){
            Greenfoot.playSound("select.mp3");
            opcion--;
        }

    if(opcion>=2) opcion = 0;
    if(opcion<0) opcion = 1;

    flecha.setLocation(350, 290 + (opcion*85));

    if(Greenfoot.isKeyDown("ENTER") || Greenfoot.isKeyDown("SPACE")) {
        switch(opcion){
            case 0: // jugar
                Greenfoot.start();
                sound.stop();
                break;
            case 1: // salir
                Greenfoot.stop();
                break;}}}
}