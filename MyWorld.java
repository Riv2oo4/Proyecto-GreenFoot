import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * Universidad del Valle de Guatemala
 * Hugo Rivas 
 * Prototipo programado 1
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Contador vidas;
    public Vidas objLife;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(GameOver.class,Contador.class,Enemigo.class, Pepe.class);
        Pepe p1= new Pepe();
        addObject(p1,50,300);
        crearEnemigos(6);
        objLife = new Vidas ();
        vidas= new Contador(4,"Vidas");
        addObject(vidas,300,85);

    }
    
    public void crearEnemigos(int numero) {
        for (int i = 0; i<numero;i++) {
            Enemigo e=new Enemigo();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject (e,x,y);
        }
    }
    
}
