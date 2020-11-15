import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsWorld extends World
{

    /**
     * Constructor for objects of class InstructionsWorld.
     * 
     */
    public InstructionsWorld()
    {    
        
        super(1200, 650, 1); 
        addObject( new Instructions(), getWidth()/2 +20, 50);
        addObject(new TurnBack(), getWidth()-getWidth()/10, getHeight()-getHeight()/10);
        addObject(new Arrow(), getWidth()-200, getHeight()-400);
        addObject(new Spacebar(), getWidth()-200, getHeight()-250);
        addObject( new WASDkeys(), 200, getHeight()-400);
        addObject(new QKey (), 200 , getHeight()-270);
        addObject( new Player1(), 200, getHeight()-480);
        addObject( new Player2(), 1000, getHeight()-490);
        
        
    }
}
