import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida2Minus3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida2Minus3 extends Vida2
{
    private GreenfootImage img = getImage();
    public void act() 
    {
       reScale();
    }    
    public void reScale()
    {
        img.scale(250,80);
        setImage(img);
    }
}
