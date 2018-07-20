import greenfoot.*;
/**
 * Write a description of class Hamburger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food  extends Animal
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Food
     */
    public Food()
    {
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(100)<= 1)
        {
            turn(Greenfoot.getRandomNumber(91)-45);
        }
        if (atWorldEdge())
        {
            turn(180);
        }
        move();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    /*
        for(int i=0; i<10; i = i + 0){
            if (Greenfoot.getRandomNumber(100)<= 5)
            {
                addObject(new Food(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
            }
        }
        */
}
