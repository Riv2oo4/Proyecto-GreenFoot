import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    String mensaje;
    public GameOver()
    {

        Greenfoot.stop();
        getWorld().showText("GAME OVER!", getWorld().getWidth()/2, getWorld().getHeight()/2);
    }
    public void act()
    {
        // Add your action code here.
    }
}
