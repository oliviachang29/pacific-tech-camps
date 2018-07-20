import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{   
    private GreenfootImage cat_sit = new GreenfootImage("cat-sit.png");
    //define walking images
    private GreenfootImage walk_left = new GreenfootImage("cat-walk-left.png");
    private GreenfootImage walk_left2 = new GreenfootImage("cat-walk-left2.png");

    private GreenfootImage walk_right = new GreenfootImage("cat-walk-right.png");
    private GreenfootImage walk_right2 = new GreenfootImage("cat-walk-right2.png");
    //define eating images
    private GreenfootImage eat_pizza = new GreenfootImage("cat-eat.png");
    private GreenfootImage eat_pizza2 = new GreenfootImage("cat-eat2.png");

    public void act() 
    {
        move();
        eat();
    }    

    /**
     * 
     **/
    public void move()
    {
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            if (this.getImage() == walk_left) {
                setImage(walk_left2);
            } else {
                setImage(walk_left);
            }
            setLocation(getX()-3, getY());
        }
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            if (this.getImage() == walk_right) {
                setImage(walk_right2);
            } else {
                setImage(walk_right);
            }
            setLocation(getX()+ 3, getY());
        }
        if (Greenfoot.isKeyDown("right") == false && (Greenfoot.isKeyDown("left") == false)&& (Greenfoot.isKeyDown("space") == false) && Greenfoot.isKeyDown("a") == false && (Greenfoot.isKeyDown("d") == false)&& (Greenfoot.isKeyDown("w") == false)) {
            setImage(cat_sit);
        }

        if (Greenfoot.isKeyDown("space")|| Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-75);
            Greenfoot.delay(15);
            setLocation(getX(), getY()+75);
        }

    }

    /**
     * Try to eat an object of class 'Pizza'. This is only successful if there
     * is such an object where we currently are. Otherwise this method does
     * nothing.
     */
    public void eat()
    {
        Actor pizzatoeat = getOneObjectAtOffset(10, 10, Pizza.class);
        if(pizzatoeat != null) {
            getWorld().removeObject(pizzatoeat);
            setImage(eat_pizza);
            Greenfoot.delay(6);
            setImage(eat_pizza2);
            Greenfoot.delay(4);
            setImage(cat_sit);
            
            CatWorld world = (CatWorld)getWorld();
            world.getScore().addScore(10);
        }
    }

}
