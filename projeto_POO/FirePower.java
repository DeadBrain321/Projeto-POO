import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirePower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirePower extends CarroVermelho
{
    
    private GreenfootImage [] imagens ;
    private int contador;
    private int i;
    
    //Level1 score; 
    
    public void act() 
    {
        animation();
        movement();
        removeEnemies();
    }    
    public FirePower()
    {
        imagens=new GreenfootImage [4];
        imagens[0] = new GreenfootImage("Bolafogo.png");
        imagens[1] = new GreenfootImage("Bolafogo2.png");
        imagens[2] = new GreenfootImage("Bolafogo3.png");
        imagens[3] = new GreenfootImage("Bolafogo4.png");
       
        setImage(imagens[0]);
        
    }
    
     //*** Animação ***    
    public void animation()
    {
        if(contador == 5)
        {
            i=i+1;
            if(i>= imagens.length)  
                {
                    i=0;
                    
                }
            setImage(imagens[i]);
            contador =  0;
        }
        else
        {
            contador++;
        }
    }
    
    //*** Movimentação ***
    public void movement()
    {
        setLocation(getX(), getY()-1);
    }
    
    //*** Remover os inimigos e dar o score ***   
    public void removeEnemies()
    {
        if(isTouching(Enemies.class))   
            {
                getWorldOfType(Level1.class).addScore(10);
                //score.score2= score.score2 +5 ;
                removeTouching(Enemies.class);
                setLocation(getX(), 0);
            }
        if(isAtEdge()==true)  
            getWorld().removeObject(this);
    }
}
