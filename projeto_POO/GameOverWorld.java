import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{
     
    
    public GameOverWorld()
    {    
        super(1200, 650, 1); 
        prepare();
    }
    // *** Spawn do botão do restart ***
    private void prepare()
    {
        addObject(new Restart(), getWidth()-100, getHeight()-100);
        Greenfoot.playSound("Game OverSound Effect.mp3");
        
    }
    
    
}
