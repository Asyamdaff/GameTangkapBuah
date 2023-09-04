import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class langit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class langit extends World
{

    /**
     * Constructor for objects of class langit.
     * 
     */
    public langit()
    {    
        super(720, 480, 1);
        lemonjatuh();
        cerijatuh();
        pisangjatuh();
        apeljatuh();
        emasjatuh();
        siap(); 
        daun1jatuh();
        daun2jatuh();
        daun3jatuh();
        daun4jatuh();
        bomjatuh();
        prepare();
    }

    public void act() //method act
    {
        if (getObjects(lemon.class).isEmpty()) lemonjatuh();
        if (getObjects(ceri.class).isEmpty()) cerijatuh();
        if (getObjects(pisang.class).isEmpty()) pisangjatuh();
        if (getObjects(apel.class).isEmpty()) apeljatuh();
        if (getObjects(emas.class).isEmpty()) emasjatuh();
        if (getObjects(daun1.class).isEmpty()) daun1jatuh();
        if (getObjects(daun2.class).isEmpty()) daun2jatuh();
        if (getObjects(daun3.class).isEmpty()) daun3jatuh();
        if (getObjects(daun4.class).isEmpty()) daun4jatuh();
        if (getObjects(bom.class).isEmpty()) bomjatuh();
    }

    private void siap() //method prepare untuk menentukan posisi dari kelas objek masing-masing
    {
        ember ember = new ember();
        addObject(ember, 648, 403);
        Counter Counter = new Counter();
        addObject(Counter, 368, 45);
        nilai nilai = new nilai();
        addObject(nilai, 64, 44);
        nilai.setLocation(370, 20);
        ember.setLocation(370, 430);
    }

    public void lemonjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new lemon(), Greenfoot.getRandomNumber(6000),20);
        }
    }
    
    public void emasjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new emas(), Greenfoot.getRandomNumber(300000),20);
        }
    }
    
    public void cerijatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new ceri(), Greenfoot.getRandomNumber(1000),20);
        }
    }
    
    public void pisangjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new pisang(), Greenfoot.getRandomNumber(8000),20);
        }
    }
    
    public void apeljatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new apel(), Greenfoot.getRandomNumber(3000),20);
        }
    }

    public void  daun1jatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new daun1(), Greenfoot.getRandomNumber(600),21);
        }
    }
    
    public void  bomjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new bom(), Greenfoot.getRandomNumber(600),21);
        }
    }

    public void  daun2jatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new daun2(), Greenfoot.getRandomNumber(600),21);
        }
    }

    public void  daun3jatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new daun3(), Greenfoot.getRandomNumber(600),21);
        }
    }
   
    public void  daun4jatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new daun4(), Greenfoot.getRandomNumber(600),21);
        }
    }    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}

