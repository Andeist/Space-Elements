import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld3 extends World
{
    private static final String bgImageName = "background.jpg";
    private static final int scrollSpeed = 5;
    private static final int picWidth = ( new GreenfootImage(bgImageName).getWidth());
    
    private int scrollPosition = 0;
    private HealthBar3 healthbar =  new HealthBar3();
    private Counter3 counter =  new Counter3();
    private GreenfootImage bgImage;
    private GreenfootImage bgBase;

    /**
     * Constructor for objects of class Myworld3.
     */
    public MyWorld3()
    {
        super(600, 600, 1);
        setBackground(bgImageName);
        bgImage =  new GreenfootImage(getBackground());
        bgBase =  new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(110) < 1) {
            addEnemy1();
        }
        if (Greenfoot.getRandomNumber(110) < 1) {
            addEnemy2();
        }
        scrollPosition = scrollPosition - scrollSpeed;
        while (scrollSpeed > 0 && scrollPosition < - picWidth) {
            scrollPosition = scrollPosition + picWidth;
        }
        while (scrollSpeed < 0 && scrollPosition > 0) {
            scrollPosition = scrollPosition - picWidth;
        }
        paint(scrollPosition);
    }

    /**
     * 
     */
    public Counter3 getCounter3()
    {
        return counter;
    }

    /**
     * 
     */
    public HealthBar3 getHealthBar3()
    {
        return healthbar;
    }

    /**
     * 
     */
    public void addEnemy1()
    {
        addObject( new IceEnemy(), Greenfoot.getRandomNumber(600), 0);
    }

    /**
     * 
     */
    public void addEnemy2()
    {
        addObject( new FireEnemy(), Greenfoot.getRandomNumber(600), 0);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 100, 50);
        addObject(healthbar, 480, 50);
        Player player =  new Player();
        addObject(player, 250, 510);
        player.setLocation(300, 490);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }
}
