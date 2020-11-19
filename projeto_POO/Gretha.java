import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gretha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gretha extends Jogadores
{
    
    private GreenfootImage img = getImage();
    
    
    public void act() 
    {
        
        reScale();
        clickShoot();
        hittingEnemies();
        
    } 
    public void reScale()
    {
        img.scale(75,90);
        setImage(img);
    }
    
    public void clickShoot()
    {
         GreenfootSound bala = new GreenfootSound("9mm glock - sound effect.mp3");
        if(Greenfoot.mouseClicked(null))
        {
            shoot();
            bala.setVolume(50);
            bala.play();
            
        }
        
        }
    public void shoot()
     {
        MouseInfo mouse = Greenfoot.getMouseInfo(); // cria um objeto da classe mouse e obtem a informação do mesmo
        if(mouse == null)// se for nulo sai da funçao
            return;
        int x = mouse.getX();// obtem a posição atual do rato
        int y= mouse.getY();
        Bullet bala = new Bullet();// fazendo com que adicione um objeto da classe Bullet
        getWorld().addObject(bala,getX(),getY());
        bala.turnTowards(x,y);
        
        
    }
    public void hittingEnemies()
    {
        
         if (isTouching(Enemies.class ))
         {
            removeTouching(Enemies.class);          
            getWorldOfType(Level2.class).removeVidaGretha (); 
        }
       
         
    }
    
}

