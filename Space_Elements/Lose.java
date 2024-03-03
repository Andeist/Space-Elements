import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose extends World
{

    /**
     * Constructor for objects of class Lose.
     * 
     */
    public Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        YouLose youLose =  new YouLose();
        addObject(youLose, 300, 300);
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("backspace")) {
            Greenfoot.setWorld( new StartingScreen());
        }
    }
}
