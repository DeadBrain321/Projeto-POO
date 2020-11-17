import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectsMenu extends Actor
{
    private boolean mouseOver= false;
    private static int MAX_TRANSPARENCIA = 255;

    public void act() 
    {

    } 
    
    
    // Faz animação dos botoẽs 
    
    
    protected void checkMouse() 
    {
        if(Greenfoot.mouseMoved(null))
            mouseOver= Greenfoot.mouseMoved(this);

        if(mouseOver)
            ajustaTransparencia(MAX_TRANSPARENCIA/2);
        else 
            ajustaTransparencia(MAX_TRANSPARENCIA);

   
    }

    protected void ajustaTransparencia(int ajuste)
    {
        GreenfootImage imagemTemp= getImage();
        imagemTemp.setTransparency(ajuste);
        setImage(imagemTemp);

    }
}
