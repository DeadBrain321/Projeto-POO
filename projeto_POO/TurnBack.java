import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TurnBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TurnBack extends ObjectsMenu
{
    private GreenfootImage imagem= getImage();
   
    public void act() 
    {
         checkMouse();
         reScale();
         mouseclick();
    }
    public void reScale()
    {
        imagem.scale(100,100);
        setImage(imagem);
    }
     public void mouseclick()
     {
         if(Greenfoot.mouseClicked(this)==true || "esc".equals(Greenfoot.getKey()))
         {
            Greenfoot.playSound("Mouse Click - Sound Effect (HD) (mp3cut.net).mp3");
            Greenfoot.setWorld(new Menu());
        }
    }
}
