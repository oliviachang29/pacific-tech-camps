import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Life here.
 */
public class Lives extends Actor
{
    public int lives = 3;

    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = new GreenfootImage("Lives: " + lives, 30, Color.BLACK, null);
        setImage(image);
        stopGame();
    } 
    /**
     * Remove numLife life. numLife can be positive or negative, so lives can go up or down.
     */
    public void changeLife(int numLife) 
    {
        lives = lives - numLife;
    } 
    /**
     * If lives == 0, then stop game.
     */
    public void stopGame() 
    {
        if (lives <= 0)
        {
            lives = 0;
            Greenfoot.stop();
        }
    } 
}
