// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy extends Actor
{

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }

    /**
     * 
     */
    public void moveEnemy()
    {
        setLocation(getX(), getY() + 3);
    }

    /**
     * 
     */
    public void Bigger()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(120, 120);
    }
    
    /**
     * 
     */
    public void PlayerDamage()
    {
        World world = getWorld();
        if (getWorld() instanceof MyWorld) {
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            }
        else if (getWorld() instanceof MyWorld2) {
            MyWorld2 myWorld2 = (MyWorld2)world;
            HealthBar2 healthbar = myWorld2.getHealthBar2();
            healthbar.loseHealth();
            }
        else if (getWorld() instanceof MyWorld3) {
            MyWorld3 myWorld3 = (MyWorld3)world;
            HealthBar3 healthbar = myWorld3.getHealthBar3();
            healthbar.loseHealth();
            }
    }
    
    /**
     * 
     */
    public void BPlayerDamage()
    {
        World world = getWorld();
        if (getWorld() instanceof MyWorld) {
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            healthbar.loseHealth();
            }
        else if (getWorld() instanceof MyWorld2) {
            MyWorld2 myWorld2 = (MyWorld2)world;
            HealthBar2 healthbar = myWorld2.getHealthBar2();
            healthbar.loseHealth();
            healthbar.loseHealth();
            }
        else if (getWorld() instanceof MyWorld3) {
            MyWorld3 myWorld3 = (MyWorld3)world;
            HealthBar3 healthbar = myWorld3.getHealthBar3();
            healthbar.loseHealth();
            healthbar.loseHealth();
            }
    }
    
    /**
     * 
     */
    public void ScoreIncrease()
    {
        World world = getWorld();
        if (getWorld() instanceof MyWorld) {
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            }
        else if (getWorld() instanceof MyWorld2) {
            MyWorld2 myWorld2 = (MyWorld2)world;
            Counter2 counter = myWorld2.getCounter2();
            counter.addScore();
            }
        else if (getWorld() instanceof MyWorld3) {
            MyWorld3 myWorld3 = (MyWorld3)world;
            Counter3 counter = myWorld3.getCounter3();
            counter.addScore();
            }
    }
    
    public void ScoreDecrease()
    {
        World world = getWorld();
        if (getWorld() instanceof MyWorld) {
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.deductScore();
            }
        else if (getWorld() instanceof MyWorld2) {
            MyWorld2 myWorld2 = (MyWorld2)world;
            Counter2 counter = myWorld2.getCounter2();
            counter.deductScore();
            }
        else if (getWorld() instanceof MyWorld3) {
            MyWorld3 myWorld3 = (MyWorld3)world;
            Counter3 counter = myWorld3.getCounter3();
            counter.deductScore();
            }
    }
}
