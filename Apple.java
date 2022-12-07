import greenfoot.*;

public class Apple extends Actor
{
    public void act() {
        setLocation(getX(), getY() + 2);
        
        if(getY() >= getWorld().getHeight())
        {
            MyWorld world = (MyWorld)getWorld();
            world.removeObject(this);
            world.gameOver();
            
        }
    }
}
