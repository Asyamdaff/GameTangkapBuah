import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class emas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class emas extends benda
{
    /**
     * Act - do whatever the emas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+7); //posisi objek emas, kecepatan emas = +7
        emasjatuh(); //lakukan method emasjatuh
    } 
    
    public void  emasjatuh() //method emasjatuh
     {
         if (atWorldEdge()) //jika objek emas berada di bawah world
         {
             getWorld().removeObject(this); // remove objek emas
         }
     }
}
