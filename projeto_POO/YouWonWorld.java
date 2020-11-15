import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenYouWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWonWorld extends World
{

    /**
     * Constructor for objects of class ScreenYouWon.
     * 
     */
    public YouWonWorld()
    {    
        
        super(1200, 650, 1); 
        prepare();
    }
    // *** Spawn do botão do next level ***
    public void prepare()
    {
        addObject(new NextLevel(), getWidth()-100, getHeight()-100);
        Greenfoot.playSound("You Win (Voice) - Sound Effect [HD].mp3");
    }
}
