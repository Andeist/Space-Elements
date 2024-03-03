// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     */
    public Tutorial()
    {
        super(900, 700, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TutorialText tutorialText =  new TutorialText();
        addObject(tutorialText, 450, 350);
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
