import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends WorldObjects
{
     Font myFont = new Font ("Gigi", true, false, 30);
    
    Color fontColor = Color.BLACK ;
    
    private String text;
    public void act() 
    {
        
    }
    
    public Text(String txt)
    {
        this.text = txt;
        //GreenFoot Image
        setImage(new GreenfootImage (200,80));
        
        GreenfootImage barImage = getImage();
        //System.out.println(barImage.toString());
        //Mudanca de fonte da minha imagem
        barImage.setFont(myFont);
        //Mudanca de cor da imagem
        barImage.setColor(fontColor);
        //"Desenha" uma imagem dentro de uma imagem 
        barImage.drawString(text, 10, 50);
    }
    }    

