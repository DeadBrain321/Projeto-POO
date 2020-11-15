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
        move();
        reScale();
        clickShoot();
    } 
    public void reScale()
    {
        img.scale(75,90);
        setImage(img);
    }
    
    public static int norm180(int rotation)
    {
        if(rotation >180)
            rotation = -180+(rotation-180);
        return rotation;
    }
    public static int norm360(int rotation)
    {
        if(rotation <0)
            rotation = 360+rotation;
        return rotation;
    }
    
    public int direction(int angle1,int angle2)
    {
        int a = norm180(angle2)- norm180(angle1);
        int b = norm360(angle2)- norm180(angle1);
        int c = norm180(angle2)- norm360(angle1);
        int d = norm360(angle2)- norm360(angle1);
        a= (Math.abs(a)<Math.abs(b))? a:b;
        c= (Math.abs(a)<Math.abs(c))?a:c;
        return (Math.abs(a)<Math.abs(c))? a:c;
        
    }
    public void move()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null)
        {
          int angle1= getRotation();  
          
          double rx= mouse.getX()-getX();
          double ry= mouse.getY()-getY();
          double r= Math.sqrt(rx*rx+ry*ry);
          if(r<20)return;
          
          int angle2 =(int)Math.round(Math.atan2(ry,rx)*180.0/Math.PI);
          int delta= direction(angle1,angle2);
          
          int btsrot= 20;
          if(Math.abs(delta)> btsrot)
          {
           if(delta<0)delta=-btsrot;   
           else delta= btsrot;
           
          }
          int angle= getRotation()+delta;
          
          int step = 5;
          int posx= getX()+(int)Math.round(step*Math.cos(angle*Math.PI/180));
          int posy= getY()+(int)Math.round(step*Math.sin(angle*Math.PI/180));
          setLocation(posx,posy);
          setRotation(angle);
       }
        
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
}

