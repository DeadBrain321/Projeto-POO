import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QKey extends ObjectsMenu
{
    private GreenfootImage img = getImage();
    
    public void act() 
    {
        img.scale(225,100);
        setImage(img);
    }    
}
