// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class FProjectile extends Actor
{

    /**
     * Act - do whatever the FProjectile wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        projectileMove();
        removeFromWorld();
    }

    /**
     * 
     */
    public void projectileMove()
    {
        setLocation(getX(), getY() - 5);
    }

    /**
     * 
     */
    public void removeFromWorld()
    {
        if (getY() == 0) {
            getWorld().removeObject(this);
        }
    }
}
