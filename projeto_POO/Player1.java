import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends ObjectsMenu
{
     private GreenfootImage img = getImage();
     
    public void act() 
    {
        img.scale(300,300);
        setImage(img);
    }    
}
