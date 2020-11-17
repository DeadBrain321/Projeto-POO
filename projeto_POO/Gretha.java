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
    private GreenfootSound bala = new GreenfootSound("9mm glock - sound effect.mp3");
    
    public void act() 
    {
        //move();
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
        if(Greenfoot.mouseClicked(null))
        {
            shoot();
            
            Greenfoot.playSound("9mm glock - sound effect.mp3");
        }
        
        }
    public void shoot()
     {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse == null)return;
        int x = mouse.getX();
        int y= mouse.getY();
        Bullet bala = new Bullet();
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

