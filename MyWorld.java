import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 40, 200);
        spawnApple();

    }
    public void spawnApple()
    {
        Apple apple = new Apple();

        addObject(apple, Greenfoot.getRandomNumber(getWidth()), 0);
    }
}
