import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VidaMinus2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VidaMinus2 extends Vida
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
