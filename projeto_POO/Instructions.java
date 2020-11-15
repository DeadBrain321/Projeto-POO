import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends ObjectsMenu
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         checkMouse();
         mouseClick();
    }  
    public void mouseClick()
    {
        if(Greenfoot.mouseClicked(this)==true || "enter".equals(Greenfoot.getKey()))
            Greenfoot.setWorld(new InstructionsWorld());
    }
}
