import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemiesLvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemiesLvl2 extends Actor
{
    

    public void act() 
        {

        }
    //** Overloading **
    protected void giradiscosLvl2() 
    {
            turn(2);
    }
    protected void giradiscosLvl2(int num)
    {
        turn(num);
        //System.out.println("kappa"); just to verify the overloading
    }
    //** Movimento Vertical dos objetos
    protected void movimentoVerticalLvl2()
    {   

        setLocation(getX(),getY() +4);

    }
    //** remove os objetos quando chegam ao fim do mundo **
    protected void remove()
    {
        if (isAtEdge()==true)
        {
            getWorldOfType(Level2.class).removeVidaGretha ();
            getWorld().removeObject(this);
            
        }
    }
} 

