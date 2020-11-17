import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plastic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plastic extends EnemiesLvl2
{
    private GreenfootImage img = getImage();
    
    public void act() 
    {
        reScale();
        giradiscosLvl2();
        giradiscosLvl2(2);
        movimentoVerticalLvl2();
        remove();
    }
    public void reScale()
    {
        img.scale(40,40);
        setImage(img);
    }  
}
