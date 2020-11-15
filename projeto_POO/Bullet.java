import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Gretha
{
    
    private GreenfootImage img = getImage();
    public void act() 
    {
       reScale();
       move(2);
       removeBullets();
    }    
    public void reScale()
    {
        img.scale(35,15);
        setImage(img);
        
    }
    public void removeBullets()
    {
        if(isAtEdge()==true)
            getWorld().removeObject(this);
    }
    
}


