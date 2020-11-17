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
       move(6);
       //removeBullets();
       removeEnemieLvl2();
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
    public void removeEnemieLvl2()
    {
        if(isTouching(EnemiesLvl2.class))   
            {
                Greenfoot.playSound("Emotional Greta Thunberg attacks world leaders How dare you (mp3cut.net).mp3");
                getWorldOfType(Level2.class).addScore(10);
                removeTouching(EnemiesLvl2.class);
                setLocation(getX(), 0);
            }
       if(isAtEdge()==true)  
            getWorld().removeObject(this);
    }
}


