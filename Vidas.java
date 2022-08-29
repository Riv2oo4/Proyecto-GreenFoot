import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vidas extends Actor
{
    /**
     * Act - do whatever the Vidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int v = 4;
    public Vidas (){
        
    }
        public void Reducir(){
    v--;
    if (v == 0) 
    
    {
        Greenfoot.stop();
    }
}
}
