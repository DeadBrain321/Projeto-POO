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
       reScale();
       checkMouse();
       mouseClick();
    }  
    public void reScale()
    {
        img.scale(300,300);
        setImage(img);
    }
    public void mouseClick()
    {
        if(Greenfoot.mouseClicked(this)==true || "enter".equals(Greenfoot.getKey()))
        {
            Greenfoot.playSound("Mouse Click - Sound Effect (HD) (mp3cut.net).mp3");
            Greenfoot.setWorld(new Level1());
            
        }
    }
}
