import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FumoEcologico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NeonEcologico extends Jogadores
{
    // Ncessario comentar ver resolução ficha pratica 2!
    private GreenfootImage image;
    public void act() 
    {
        dissipa();
        
    }  
    public void dissipa()
    {
        image =getImage();
        int tranparenciaAtual= image.getTransparency();
        if( tranparenciaAtual <10)
            getWorld().removeObject(this); // para chamar um obejto da mesma classe this
        else 
            image.setTransparency(tranparenciaAtual-10);
    }
}
        

