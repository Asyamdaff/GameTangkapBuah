import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pisang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pisang extends benda
{
    /**
     * Act - do whatever the pisang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+7); //posisi objek pisang, kecepatan banana = +6
        pisangjatuh(); //lakukan method pisangjatuh
    } 
    
    public void  pisangjatuh() //method pisangjatuh
     {
         if (atWorldEdge()) //jika objek pisang berada di bawah world
         {
             getWorld().removeObject(this); // remove objek pisang
         }
     }
}
