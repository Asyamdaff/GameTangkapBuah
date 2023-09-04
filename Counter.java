import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color; //untuk pengaturan warna

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int totalCount = 0; // Counter default awal = 0
    public void act() 
    {
       gameOver(); //method gameOver
    }
    
    public Counter() //kelas Counter
     {
         setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLACK)); //membuat tampilan counter dengan ukuran awal 30, tulisan warna putih, background hitam
     }
    public void Counting (int hitung) // method Counting
     {
         totalCount += hitung;
         setImage(new GreenfootImage("" + totalCount, 30, Color.WHITE, Color.BLACK)); //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna putih, background hitam
    }
    
    public void gameOver() //method gameOver
     {
         if (totalCount >= 100) //bila totalCount >= 100
         {
             Greenfoot.stop();  // permainan berhenti
             Greenfoot.playSound("menang.wav"); //memainkan sound menang.wav
             getWorld().addObject(new menang(),360,200);//tampilkan gambar ini
             getWorld().addObject(new reset(),360,300);//tampilkan gambar ini
         }
         else if(totalCount <0)
         {
             Greenfoot.stop();// permainan berhenti
             Greenfoot.playSound("kalah.wav");//memainkan sound menang.wav
             getWorld().addObject(new kalah(),350,200);//tampilkan gambar ini
         }
     }
 }
