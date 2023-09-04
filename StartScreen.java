import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    public static halamanawal Halamanawal = new halamanawal();
    
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        prepare();
    }
    public void prepare(){
        addObject(Halamanawal, 280, 280);
    }
    public void act(){
        if (Greenfoot.mouseClicked(Halamanawal)){ // jika klik pada mouse
            int x = Greenfoot.getMouseInfo().getX();
            int y = Greenfoot.getMouseInfo().getY();
            if ((x >= 230 && x <= 330) && (y >= 250 && y <= 300)){ // di titik koordinat ini
                Greenfoot.setWorld(new SecondStartScreen()); // mengeset dunia SecondStartScreen
                Greenfoot.playSound("tombol.mp3"); // mainkan suara tombol.mp3
            }
        }
    }
}
