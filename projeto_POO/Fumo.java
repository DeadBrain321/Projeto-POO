import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fumo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fumo extends Enemies
{
    private GreenfootImage img= getImage();
    
    public void act() 
    {
        reScale();
        movimentoVertical();
        giradiscos(1);// chamada do overloading
        giradiscos();
        remove();
        
    }   
    public void reScale()
    {
        img.scale(50,50);
        setImage(img);
    }
    
    
}
