import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * "La clase Pepe se refiere al protagonista del juego que es el que tiene que evitar los obstáculos"
 * Universidad del Valle de Guatemala
 * Hugo Rivas
 * Proyecto GreenFoot
 */
public class Pepe extends Actor
{
    public static final int Arriba=0;
    public static final int Abajo=1;
    public static final int Izquierda=2;
    public static final int Derecha=3;

    public void Pepe(){
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setDireccion(Arriba);
        
        }
        if(Greenfoot.isKeyDown("down")){
            setDireccion(Abajo);
      
        }
        if (Greenfoot.isKeyDown("left")){
            setDireccion(Izquierda);
           
        }
        
        if (Greenfoot.isKeyDown("right")){
            setDireccion(Derecha);
           
        }
       
    }
    

    public void setDireccion(int direccion){
        switch (direccion) {
            case Arriba:
            setRotation(270);
            if (Greenfoot.isKeyDown("space")){
            setLocation(getX(),getY()-10);
    }
    else{
        setLocation(getX(),getY()-1);
    }
        break;
        case Abajo:
        setRotation(90);
        if(Greenfoot.isKeyDown("space")){
        setLocation(getX(),getY()+10);
    }else{
        setLocation(getX(),getY()+1);
    }
        break;
        case Izquierda:
        setRotation(180);
        if (Greenfoot.isKeyDown("space")){
        setLocation(getX()-10, getY());
        }else{
            setLocation(getX()-1,getY());
        }
            break;
            case Derecha:
            setRotation (0);
            if(Greenfoot.isKeyDown("space")){
            setLocation(getX()+10,getY());
        }else{
            setLocation(getX()+1,getY());
        }
            break;
        }
    }
}

