// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class IceEnemy extends Enemy
{

    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy();
        IceEnemyCode();
    }

    /**
     * 
     */
    public void IceEnemyCode()
    {
        Actor FProjectile = getOneIntersectingObject(FProjectile.class);
        Actor IProjectile = getOneIntersectingObject(IProjectile.class);
        if (FProjectile != null) {
            getWorld().removeObject(FProjectile);
            Greenfoot.playSound("explosion_sound.mp3");
            ScoreIncrease();
            getWorld().removeObject(this);
            return;
        }
        if (IProjectile != null) {
            getWorld().removeObject(IProjectile);
            Greenfoot.playSound("power_up_sound.mp3");
            ScoreDecrease();
            getWorld().addObject( new  BIceEnemy(), getX(), getY() - 30);
            getWorld().removeObject(this);
            return;
        }
        if (getY() == 599) {
            Greenfoot.playSound("hurt_sound.mp3");
            PlayerDamage();
            getWorld().removeObject(this);
            return;
        }
    }
}
