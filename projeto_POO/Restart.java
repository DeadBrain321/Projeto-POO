import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends ObjectsMenu
{
    private GreenfootImage img= getImage();
    
    public void act() 
    {
        reScale();
        checkMouse();
        goBackToLevel1();
    } 
    
    public void reScale()
    {
        img.scale(100,100);
        setImage(img);
        
    }
    
    //*** Não passou o nível, volta para o início ***
    private void goBackToLevel1() 
    {
        if(Greenfoot.mouseClicked(this)==true || "r".equals(Greenfoot.getKey()) || "R".equals(Greenfoot.getKey()))
        {
            Greenfoot.setWorld(new Level1());
           
        }
    }
}
