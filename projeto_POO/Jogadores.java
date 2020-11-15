import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogadores extends Actor
{
    
    private int contador;
    
    public void act() 
    {
        
    } 
    
    public void move() /** Overriding **/
    {   
        move(12); 
    }
    protected void rasto(){ 
        
        if (++contador % 6==0) // o contador é sempre incrementado até a condição se verificar
        {
            getWorld().addObject(new NeonEcologico(),getX(), getY()+50);
            contador=0;
        }
    }
    
    
}
