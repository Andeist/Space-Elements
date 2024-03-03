// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BFireEnemy extends Enemy
{

    /**
     * Act - do whatever the BFireEnemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy();
        Bigger();
        BFireEnemyCode();
    }

    /**
     * 
     */
    public void BFireEnemyCode()
    {
        Actor IProjectile = getOneIntersectingObject(IProjectile.class);
        Actor FProjectile = getOneIntersectingObject(FProjectile.class);
        if (IProjectile != null) {
            getWorld().removeObject(IProjectile);
            Greenfoot.playSound("power_down_sound.mp3");
            getWorld().addObject( new FireEnemy(), getX(), getY() - 30);
            getWorld().removeObject(this);
            return;
        }
        if (FProjectile != null) {
            getWorld().removeObject(FProjectile);
            Greenfoot.playSound("power_up_sound.mp3");
            ScoreDecrease();
            return;
        }
        if (getY() == 599) {
            Greenfoot.playSound("hurt_sound.mp3");
            BPlayerDamage();
            getWorld().removeObject(this);
            return;
        }
    }
}
