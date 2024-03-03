// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BIceEnemy extends Enemy
{

    /**
     * Act - do whatever the BIceEnemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy();
        Bigger();
        BIceEnemyCode();
    }

    /**
     * 
     */
    public void BIceEnemyCode()
    {
        Actor IProjectile = getOneIntersectingObject(IProjectile.class);
        Actor FProjectile = getOneIntersectingObject(FProjectile.class);
        if (FProjectile != null) {
            getWorld().removeObject(FProjectile);
            Greenfoot.playSound("power_down_sound.mp3");
            getWorld().addObject( new IceEnemy(), getX(), getY() - 30);
            getWorld().removeObject(this);
            return;
        }
        if (IProjectile != null) {
            getWorld().removeObject(IProjectile);
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
