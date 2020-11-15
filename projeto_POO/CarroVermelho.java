import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarroVermelho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroVermelho extends Jogadores
{
    private GreenfootImage redCar= getImage();
    
    
    
    private boolean space;
    
    private int turn = 2;
    private int speed = 2;
    
    Level1 score;
    public void act() 
    {
        scale();
        move();

        limites();
        hittingEnemies();
        rasto();

        shootFire();
        hitCoins();

    }    

    public void scale()// scale da imagem do carro vermelho
    {
        redCar.scale(100,70);
        setImage(redCar);
    }

    public void move() /** Overrding, redefinição do comportamento da superclasse Jogadores**/ 

    {
        if(Greenfoot.isKeyDown("up"))
        {
            move(speed);//move(2)
            
         }
        // move(enter any number to move forward);
         if(Greenfoot.isKeyDown("down"))
         {
            move(-speed);//move(-2)     
        }
        // move(enter any number to move backward);
         if(Greenfoot.isKeyDown("left"))
        turn(-turn);//turn(-2)
        // turn(enter any number to rotate left hand side);
         if(Greenfoot.isKeyDown("right"))
        turn(turn);//turn(2)
        // turn(enter any number to rotate right hand side);
        
        }
    

    public void limites(){ //limites para que não de tal ponto de modo a que ambos os carros tenham a sua pista
        if( getX()>=862)
        {
            setLocation(getX()-4,getY());
        }
        if( getX()<=631)
        {
            setLocation(getX()+4,getY());
        }
    }

    

    public void hittingEnemies()
    {
        if (isTouching(Enemies.class ))
        {
            
            removeTouching(Enemies.class);
            getWorldOfType(Level1.class).removeVidaJogador2 ();
            
        }

    }

    public void shootFire()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(space==false)
            {
                getWorld().addObject(new FirePower(),getX(),getY());
                Greenfoot.playSound("foom_0.wav");
            }
            space=true;
        }
        else 
            space = false;
    }

    public void hitCoins()
    {
        if (isTouching(Coins.class))
        {
            getWorldOfType(Level1.class).addScore(10);
            removeTouching(Coins.class);
            Greenfoot.playSound( "Super Mario Bros.-Coin Sound Effect.mp3") ;
        }
    }
}
