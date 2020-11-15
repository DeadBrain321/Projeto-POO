import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    public boolean existe= true;
    public void act() 
    {
       
    }
    //** Overloading **
    protected void giradiscos() 
    {
        turn(2);
    }
    protected void giradiscos(int num)
    {
        turn(num);
        //System.out.println("kappa"); just to verify the overloading
    }
    //** Movimento Vertical dos objetos, depois tentar fazer IA
    protected void movimentoVertical()
    {   
       
         setLocation(getX(),getY() +1);
         
    }
    //** remove os objetos quando chegam ao fim do mundo **
    protected void remove()
    {
        if (isAtEdge()==true)
            getWorld().removeObject(this);
    }
}
