import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends ObjectsMenu
{
    private GreenfootImage img = getImage();
    public void act() 
    {
        img.scale(300,300);
        setImage(img);
    }    
}
