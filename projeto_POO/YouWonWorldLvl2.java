import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWonWorldLvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWonWorldLvl2 extends World
{

    /**
     * Constructor for objects of class YouWonWorldLvl2.
     * 
     */
    public YouWonWorldLvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 640, 1); 
        addObject( new YouWon(), getWidth()/2, 200);
        Greenfoot.playSound("YouWon.mp3");
        addObject(new TurnBack(), getWidth()-getWidth()/10, getHeight()-getHeight()/10);
    }
}
