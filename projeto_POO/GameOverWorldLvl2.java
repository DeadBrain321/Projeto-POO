import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorldLvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorldLvl2 extends World
{

    public GameOverWorldLvl2()
    {    
        super(1200, 640, 1); 
        prepare();
    }
    // *** Spawn do botão do restart ***
    private void prepare()
    {
        addObject(new GameOver(), getWidth()/2, 200);
        addObject(new RestartLvl2(), getWidth()-100, getHeight()-100);
        Greenfoot.playSound("GameOver.mp3");
        
    }
}
