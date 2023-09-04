import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondStartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondStartScreen extends World
{
    public static aturan Aturan = new aturan();
    
    /**
     * Constructor for objects of class SecondStartScreen.
     * 
     */
    public SecondStartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        prepare();
    }
    public void prepare(){
        addObject(Aturan, 280, 280);
    }
    public void act(){
        if (Greenfoot.mouseClicked(Aturan)){ // jika klik pada mouse
            int x = Greenfoot.getMouseInfo().getX();
            int y = Greenfoot.getMouseInfo().getY();
            if ((x >= 230 && x <= 330) && (y >= 250 && y <= 300)){ // pada titik koordinat ini
                Greenfoot.setWorld(new langit()); // mengeset dunia langit
                Greenfoot.playSound("tombol.mp3"); // mainkan suara tombol.mp3
                Greenfoot.delay(40); //untuk menunda permainan 
            }
        }
    }
}
