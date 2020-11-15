import greenfoot.*;  

/**
 * Write a description of class WaterPower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterPower extends CarroAzul
{
    private GreenfootImage [] imagens ;
    private int i ; //Percorre o array
    private int contador; // para saber quando vai trocar as imagens
    //Level1 score;
    
    public WaterPower()
    {
        imagens=new GreenfootImage [6];
        imagens[0] = new GreenfootImage("agua.png");
        imagens[1] = new GreenfootImage("agua2.png");
        imagens[2] = new GreenfootImage("agua3.png");
        imagens[3] = new GreenfootImage("agua4.png");
        imagens[4] = new GreenfootImage("agua5.png");
        imagens[5] = new GreenfootImage("agua6.png");
        
        setImage(imagens[0]);
        
    }
    public void act() 
    {
        movement();
        animation();
        removeEnemies();
    }    
     //*** Animação ***    
    public void animation()
    {
        if(contador == 10)
        {
            i+=1;
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
        setLocation(getX(), getY()-3);
    }
    
    //*** Remover os inimigos e dar o score ***
    
    public void removeEnemies()
    {
        if(isTouching(Enemies.class))   
            {
                //score.score1= score.score1 +5 ;
                getWorldOfType(Level1.class).addScore(10);
                removeTouching(Enemies.class);
                setLocation(getX(), 0);
            }
        if(isAtEdge()==true)  
            getWorld().removeObject(this);
    }
}
