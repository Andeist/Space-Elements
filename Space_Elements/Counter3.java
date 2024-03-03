// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Counter3 extends Actor
{
    private int score = 0;

    /**
     * Act - do whatever the Counter3 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage( new  GreenfootImage("Score: " + score, 50, Color.WHITE, Color.BLACK));
        youWin();
    }

    /**
     * Act - do whatever the Counter3 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Counter3()
    {
        setImage( new  GreenfootImage("Score: " + score, 50, Color.WHITE, Color.BLACK));
    }

    /**
     * 
     */
    public void addScore()
    {
        score = score + 1;
    }

    /**
     * 
     */
    public void deductScore()
    {
        score = score - 1;
    }

    /**
     * 
     */
    public void youWin()
    {
        if (score == 75 || score > 75) {
            Greenfoot.playSound("win_sound.mp3");
            Greenfoot.setWorld( new Win());
        }
    }
}
