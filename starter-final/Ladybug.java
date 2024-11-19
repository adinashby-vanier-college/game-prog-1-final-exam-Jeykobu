// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
    }

    /**
     * Check whether we are colliding with an CannonBall
     */
    private void checkCollision()
    {
        Actor Ladybug = (Ladybug)getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            World world = getWorld();
            world.removeObject(Ladybug);
        }
    }

    /**
     * Move Around
     */
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("W")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("S")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("A")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("D")) {
            turn(-3);
        }
    }
}
