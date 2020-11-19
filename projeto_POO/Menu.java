import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        
        super(1200, 650, 1); 
        prepare();
    }
    
    public void prepare()
    {
        addObject(new Logo(), getWidth()/2,getHeight()-525);
        addObject(new StartButton(),getWidth()/2,getHeight()-350);
        addObject(new Instructions(), getWidth()/2, getHeight()-190);
    }
}
