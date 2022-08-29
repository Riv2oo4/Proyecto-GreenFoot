import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        World m = getWorld();
        if (getX () >=m .getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
            turn(Greenfoot.getRandomNumber(90-45));
        }
        }
        if(getY()>=m.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
            turn(Greenfoot.getRandomNumber(90-45));
        }
        }
        Actor Pepe = getOneObjectAtOffset(0,0,Pepe.class);
        if(Pepe!=null){
            MyWorld myw = (MyWorld)getWorld();
            getWorld().removeObject(Pepe);
            myw.objLife.Reducir();
            getWorld().addObject(new Pepe(),50,300);
            if(myw.vidas.ObtenerValor()==0){
                GameOver n = new GameOver();
                getWorld().addObject(n,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
            
            
        }
    }
}
