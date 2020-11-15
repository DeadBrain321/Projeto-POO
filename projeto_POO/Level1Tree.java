import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1Tree extends WorldObjects
{
    private GreenfootImage tree= getImage();
    
    public void act() 
    {
      resizeTree();
      verticalMovement();
      remove();
    }   
    
    public void resizeTree()
    {
       tree.scale(150,100);
       setImage(tree); 
     }   
    }


