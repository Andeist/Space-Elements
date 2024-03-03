// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player extends Actor
{
    private boolean canShoot = true;
    private boolean canFire = true;

    /**
     * Act - do whatever the Player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        fireProjectile();
        IceProjectile();
    }

    /**
     * This method will let the player move around
     */
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 5, getY());
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
        }
    }

    /**
     * 
     */
    public void fireProjectile()
    {
        if (Greenfoot.isKeyDown("z") && canFire == true) {
            getWorld().addObject( new FProjectile(), getX(), getY() - 30);
            Greenfoot.playSound("shoot_sound.mp3");
            canFire = false;
        }
        else if ( ! Greenfoot.isKeyDown("z")) {
            canFire = true;
        }
    }

    /**
     * 
     */
    public void IceProjectile()
    {
        if (Greenfoot.isKeyDown("x") && canShoot == true) {
            getWorld().addObject( new IProjectile(), getX(), getY() - 30);
            Greenfoot.playSound("shoot_sound.mp3");
            canShoot = false;
        }
        else if ( ! Greenfoot.isKeyDown("x")) {
            canShoot = true;
        }
    }
}
