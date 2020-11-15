import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1Pavilon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1Pavilon extends WorldObjects
{
    private GreenfootImage pavilhao = getImage();
    
    
    
    public void act() 
    {
        resizePavilhao();
        verticalMovement();
        remove();
        
    }   
    
    public void resizePavilhao()
    {
        pavilhao.scale(150,300);
        setImage(pavilhao);
    }
    
    
    
       
    }
    
