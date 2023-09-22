import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket_Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket_Plane extends Actor
{
    /**
     * Act - do whatever the Rocket_Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
    }

    public void moveAndTurn()
    {
        move(2);
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }

    }

    public void eat()
    {
        Actor Bomb;
        Bomb = getOneObjectAtOffset(0, 0, Bomb.class);
        if(Bomb != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Bomb);
            addScore();
        }

    }

    public void addScore()
    {
        if(!getWorld().getObjects(counter.class).isEmpty())
        {   
            ((counter)getWorld().getObjects(counter.class).get(0)).add(1);

        }

   
    }
}       