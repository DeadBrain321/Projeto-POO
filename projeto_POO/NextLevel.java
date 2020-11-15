import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends ObjectsMenu
{
    private GreenfootImage img = getImage();
    
    public void act() 
    {
       reScale();
       checkMouse();
       level2Spawn();
       
    }  
    public void reScale() // rescale da imagem again...
    {
        img.scale(100,100);
        setImage(img);
        
    }
    
    //*** Passou de nível, go to level 2 ***
    private void level2Spawn() 
    {
        if(Greenfoot.mouseClicked(this))
            Greenfoot.setWorld(new Level2());
    }
        
        
}
