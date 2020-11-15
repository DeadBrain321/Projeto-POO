import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class worldObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldObjects extends Actor
{
    
    public void act() 
    {

    }   
// Utilização da classe protected, pois é acessível tanto na class como nas subclasses mas não ao mundo. 

protected void remove()// Em vez de remover os objetos do mundo, apenas faz com que estes dêm um tp para para y=0, dando um noção de movimento
    {
        if(isAtEdge()==true)
        setLocation(getX(),0);
    }

protected void verticalMovement()// Faz com que haja a sensção de movimento, objetos das laterais movem-se
{
       
    setLocation(getX(),getY() +1);
    
}
}
