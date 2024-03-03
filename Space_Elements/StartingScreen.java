// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartingScreen extends World
{
    private GreenfootSound backgroundMusic =  new  GreenfootSound("bgm_sound.mp3");
    private boolean isMuted;

    /**
     * Constructor for objects of class StartingScreen.
     */
    public StartingScreen()
    {
        super(1000, 700, 1);
        prepare();
        backgroundMusic.playLoop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MainText mainText =  new  MainText();
        addObject(mainText, 500, 360);
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld( new  Difficulty());
        }
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld( new  Tutorial());
        }
        if (Greenfoot.isKeyDown("m")) {
            isMuted =  ! isMuted;
            updateState();
        }
    }

    /**
     * 
     */
    private void updateState()
    {
        if (isMuted) {
            backgroundMusic.stop();
        }
        else {
            backgroundMusic.play();
        }
    }
}
