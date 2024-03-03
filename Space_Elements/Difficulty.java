// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Difficulty extends World
{

    /**
     * Constructor for objects of class Difficulty.
     */
    public Difficulty()
    {
        super(1000, 700, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        DifficultyText difficultyText =  new  DifficultyText();
        addObject(difficultyText, 500, 360);
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("1")) {
            Greenfoot.setWorld( new  MyWorld());
        }
        if (Greenfoot.isKeyDown("2")) {
            Greenfoot.setWorld( new  MyWorld2());
        }
        if (Greenfoot.isKeyDown("3")) {
            Greenfoot.setWorld( new  MyWorld3());
        }
        if (Greenfoot.isKeyDown("backspace")) {
            Greenfoot.setWorld( new  StartingScreen());
        }
    }
}
