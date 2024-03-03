// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class HealthBar extends Actor
{
    private int health = 20;
    private int healthBarWidth = 180;
    private int healthBarHeight = 30;
    private int pixelsPerHealthPoint = (int)healthBarWidth / health;

    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        update();
        youLose();
    }

    /**
     * 
     */
    public void HealthBar()
    {
        update();
    }

    /**
     * 
     */
    public void update()
    {
        setImage( new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, health * pixelsPerHealthPoint, healthBarHeight);
    }

    /**
     * 
     */
    public void loseHealth()
    {
        health = health - 1;
    }

    /**
     * 
     */
    public void youLose()
    {
        if (health == 0 || health < 0) {
            Greenfoot.playSound("lose_sound.mp3");
            Greenfoot.setWorld( new Lose());
        }
    }
}
