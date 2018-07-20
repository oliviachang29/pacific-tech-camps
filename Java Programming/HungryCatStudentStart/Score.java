import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public int points = 0;

    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = new GreenfootImage("Score: " + points, 30, Color.BLUE, null);
        setImage(image);
    } 
    /**
     * Add a certain number of points (newPoints) to the existing number of points.
     */
    public void addScore(int newPoints) 
    {
        points = points + newPoints;
    } 
}
