import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ceri extends benda
{
    /**
     * Act - do whatever the lemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+4); //posisi objek ceri, kecepatan ceri = +4
        cerijatuh(); //lakukan method cerijatuh
    } 
    
    public void  cerijatuh() //method cerijatuh
     {
         if (atWorldEdge()) //jika objek ceri berada di bawah world
         {
             getWorld().removeObject(this); // remove objek ceri
         }
     }
}
