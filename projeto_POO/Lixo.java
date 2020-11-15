import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lixo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lixo extends Enemies
{
    private GreenfootImage img = getImage();
    public void act() 
    {
        reScale();
        giradiscos();
        giradiscos(1);//chamada do overloading
        movimentoVertical();
        remove();
        
    }  

    public void reScale()
    {
        img.scale(50,45);
        setImage(img);
    }
}
