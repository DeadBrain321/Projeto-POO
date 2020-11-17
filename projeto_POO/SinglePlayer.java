import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SinglePlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SinglePlayer extends ObjectsMenu
{
    private GreenfootImage img = getImage();
    public void act() 
    {
       reScale();
    }  
          
    public void reScale()
    {
        img.scale(200,225);
        setImage(img);
    }
}
