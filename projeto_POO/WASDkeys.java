import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WASDkeys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WASDkeys extends ObjectsMenu
{
    private GreenfootImage img = getImage();
    public void act() 
    {
       img.scale(225,150);
       setImage(img);
    }    
}
