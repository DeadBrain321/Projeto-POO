import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    public int scoreTotal = 0 ;
    private int grethaLife = 100; 
    private GreenfootSound backgroundMusic = new GreenfootSound( "9d28afa7-a548-46b4-ac6b-a02b2c973e17.mp3");
    public Level2() //STAND BY
    {    
        
        super(1200, 650, 1); 
        addObject(new Gretha(), getWidth()/2,getHeight()-35);
        //showText("Gretha Life: "+grethaLife, getWidth()/2, getHeight()-15);
        scoreTotal = 0;
        showText("Score Total :" + scoreTotal, 600,90);
    }
    
    public void act()
    {
        addMobs();
        showText("Gretha Life: "+grethaLife, getWidth()/2, getHeight()-15);
        backgroundMusic.playLoop();
    }

    public void addMobs()
    {
        if(Greenfoot.getRandomNumber(2000)<20) // faz com que adicione inimigos com uma percentagem de 0,5% (10*100)/2000 = 0,5 *100
        {
            addObject( new Oil(),Greenfoot.getRandomNumber(getWidth()) ,10);
        }
        if(Greenfoot.getRandomNumber(2000)<20)
        {
            addObject( new Plastic(), Greenfoot.getRandomNumber(getWidth()) ,10);
        }

    }
    public void removeVidaGretha()
    {
        grethaLife--;
        if (grethaLife == 0 )
        {
            backgroundMusic.stop();
            Greenfoot.setWorld(new GameOverWorldLvl2());
        }
    }
    public void addScore(int num)
    {
        scoreTotal = scoreTotal +num;
        showText("Score Total : " + scoreTotal, 600,90);
        if( scoreTotal == 700   ){
            backgroundMusic.stop();
            Greenfoot.setWorld(new YouWonWorldLvl2());
        }
    }
}

