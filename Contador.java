import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font; 

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Contador extends Actor
{
    /**
     * Act - do whatever the Contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage  imagen;
    int cont;
    
    String mensaje;
    public Contador(int b, String msj)
    {
        cont = b;
        mensaje = msj;
        imagen = new GreenfootImage(250,150);

        dibuja();
    }
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString (mensaje+cont, 20, 20);
        setImage(imagen);
    }
    public int ObtenerValor()
    {
        return cont;
    }
    public void act()
    {
        // ajdfjkal
    }
}
