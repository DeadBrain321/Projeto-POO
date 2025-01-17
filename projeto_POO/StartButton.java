import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends ObjectsMenu
{
    private GreenfootImage botao= getImage();
    
    public void act() 
    {
       checkMouse();
       mouseClick();
    }   

    public void mouseClick()
    {
        if(Greenfoot.mouseClicked(this)==true || "enter".equals(Greenfoot.getKey()))
        {
            Greenfoot.playSound("Mouse Click - Sound Effect (HD) (mp3cut.net).mp3");
            Greenfoot.setWorld(new SelectScreen());
            
        }
    }
    
}
