import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectScreen extends World
{

    /**
     * Constructor for objects of class SelectScreen.
     * 
     */
    public SelectScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 645, 1); 
        addObject(new TurnBack(), getWidth()-getWidth()/10, getHeight()-getHeight()/10);
        addObject(new Player2(), getWidth()-325,150);
        addObject(new Player1(), 325,150);
    }
}
