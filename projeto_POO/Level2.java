import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2() //STAND BY
    {    
        
        super(1200, 650, 1); 
        addObject(new Gretha(), getWidth()/2,getHeight()-35);
        
    }
    
}
