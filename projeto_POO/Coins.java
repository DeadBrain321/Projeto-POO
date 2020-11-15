import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coins extends Jogadores
{
    private GreenfootImage [] images;
    private int contador;
    private int i;
    private GreenfootSound coinCatch = new GreenfootSound( "Super Mario Bros.-Coin Sound Effect.mp3") ;
    Level1 score;
    
    public void act() 
    {
        animation();
        movement();
        deleteCoin();
        
        
    }  
    public Coins()
    {
        images= new GreenfootImage[6];
        images[0]=new GreenfootImage("1Moedas.png");
        images[1]=new GreenfootImage("2Moedas.png");
        images[2]=new GreenfootImage("3Moedas.png");
        images[3]=new GreenfootImage("4Moedas.png");
        images[4]=new GreenfootImage("5Moedas.png");
        images[5]=new GreenfootImage("6Moedas.png");
        setImage(images[0]);
    }
    public void animation()
    {
        {
        if(contador == 10)
        {
            i+=1;
            if(i>= images.length)  
                {
                    i=0;
                    
                }
            setImage(images[i]);
            contador =  0;
        }
        else
            {
            contador++;
            }   
        }
    }
      public void movement()
    {
        setLocation(getX(), getY()+1);
    }
    
    public void deleteCoin()
    {
        if (isAtEdge()==true)  
        {
             
            getWorld().removeObject(this);
                 
        }
    }
}

