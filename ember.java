import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kereta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ember extends benda
{
    /**
     * Act - do whatever the kereta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
         moveEmber(); //method moveEmber
         objectDisappear(); //method objectDisappear
        }
    }    
       
    public void objectDisappear() //method objectDisappear
    {
         if (canSee(lemon.class)) //bila melihat kelas objek lemon
         {
             eat(lemon.class); //eat kelas objek banana
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(6); // kelas counter ditambah sebanyak 6 poin
             Greenfoot.playSound("buahmasuk.mp3"); // mainkan suara buahmasuk.mp3
         }
         
         if (canSee(pisang.class)) //bila melihat kelas objek pisang
         {
             eat(pisang.class); //eat kelas objek pisang
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(8); // kelas counter ditambah sebanyak 8 poin
             Greenfoot.playSound("buahmasuk.mp3"); // mainkan suara buahmasuk.mp3
         }
         
         if (canSee(apel.class)) //bila melihat kelas objek apel
         {
             eat(apel.class); //eat kelas objek banana
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(4); // kelas counter ditambah sebanyak 4 poin
             Greenfoot.playSound("buahmasuk.mp3"); // mainkan suara buahmasuk.mp3
         }
         
         if (canSee(ceri.class)) //bila melihat kelas objek ceri
         {
             eat(ceri.class); //eat kelas objek ceri
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(2); // kelas counter ditambah sebanyak 2 poin
             Greenfoot.playSound("buahmasuk.mp3"); // mainkan suara buahmasuk.mp3
         }
         
         if (canSee(emas.class)) //bila melihat kelas objek emas
         {
             eat(emas.class); //eat kelas objek emas
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(15); // kelas counter ditambah sebanyak 15 poin
             Greenfoot.playSound("emas.mp3"); // mainkan suara buahmasuk.mp3
         }
    }
       
    public void moveEmber() //method moveMonkey
     {
         if (Greenfoot.isKeyDown("left")) //bila arah panah ke kiri ditekan
         {
             move(-8); //bergerak ke -8
         }
         if (Greenfoot.isKeyDown("right")) //bila arah panah ke kanan ditekan
         {
             move(8); //bergerak ke 8
         }
     }
}

