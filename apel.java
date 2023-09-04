import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apel extends benda
{
    /**
     * Act - do whatever the apel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+5); //posisi objek apel, kecepatan banana = +5
        apeljatuh(); //lakukan method apeljatuh
    } 
    
    public void  apeljatuh() //method apeljatuh
     {
         if (atWorldEdge()) //jika objek apel berada di bawah world
         {
             getWorld().removeObject(this); // remove objek apel
         }
     }
}
