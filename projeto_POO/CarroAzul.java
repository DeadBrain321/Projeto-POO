import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarroAzul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroAzul extends Jogadores
{
    private GreenfootImage carro=getImage();
    
    
     
    
    private int i ;
    private boolean q;
    
    private int turn=2;
    private int speed=2;
    
    
    Level1 score;
    
    
    public CarroAzul()
    {
        
        
    }
    public void act() 
    {
        scale();
        limites();
        hittingEnemies();
        rasto();
        shootWater();
        move();
        hitCoins();
        
        
    } 
    //*** Scale da imagem do carro ***
    public void scale() 
    {
        carro.scale(100,100);
        setImage(carro);
    }

    //*** Movimentação do carroAzul ***
    public void move() /** Overrding, redefinição do comportamento da superclasse Jogadores**/
    {
        
        if(Greenfoot.isKeyDown("w"))
         {
            move(speed); // anda 2
            
         }
        
        if(Greenfoot.isKeyDown("s"))
         {
            move(-speed);// faz com que anda para trás 
         }
        
        if(Greenfoot.isKeyDown("a"))
         {
            turn(-turn);// vira para o lado esquerdo
         }
        
        if(Greenfoot.isKeyDown("d"))
         {
            turn(turn);//vira para o lado direito 
         }
    }
    

    //*** Limite do carro Azul ***
    public void limites(){ 
        if( getX()>=574)
        {
            setLocation(getX()-4,getY());
        }
        if( getX()<=344)
        {
            setLocation(getX()+4,getY());
        }

    }

     
    //*** Atinge Inimigos ***
    public void hittingEnemies()
    {
        
         if (isTouching(Enemies.class ))
         {
            removeTouching(Enemies.class);          
            getWorldOfType(Level1.class).removeVidaJogador1 (); 
        }
       
         
    }
    //*** Disparo de aágua não continuo

    public void shootWater()
    {
        if(Greenfoot.isKeyDown("q")) // q é false é"inicialmente falso" pois função é sempre chamada no act(else é realizado), ou seja verifica a condição
        {
            if(q==false)
            {
                getWorld().addObject(new WaterPower(),getX(),getY());
                Greenfoot.playSound("PEW PEW SOUND EFFECT.mp3");
            }
            q=true;
        }
        else 
            q = false;
        
    }
    
    //*** Carro toca nas moedas ***
    public void hitCoins()
    {
        if (isTouching(Coins.class)== true)
            {
                getWorldOfType(Level1.class).addScore(10);
                removeTouching(Coins.class);
                Greenfoot.playSound( "Super Mario Bros.-Coin Sound Effect.mp3") ;
                
            }
    }
}

