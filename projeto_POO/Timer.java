import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends WorldObjects
{
    private GreenfootImage img = getImage();
    
    public void act() 
    {
        reScale();
    }  
    
    
    public void reScale()
    {
       img.scale(50,50);
       setImage(img);
    }
}
