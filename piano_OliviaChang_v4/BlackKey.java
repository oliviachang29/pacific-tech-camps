import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class BlackKey extends Actor //(Class declaration)
{
    private boolean isDown;
    private String key;
    private String sound;
    
    /**
     * Create a new key linked to a given keyboard key, and with a given sound.
     **/
    public BlackKey(String keyName, String soundFile)
    {
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        blackCheckKeyDown();
    }

    /**
     * Change image if the key is down.
     */
    private void blackCheckKeyDown()
    {
        if ((!isDown && Greenfoot.isKeyDown(key))|| (!isDown && Greenfoot.mouseClicked(this)))
        {
            setImage("black-key-down.png");
            isDown = true;
            play();
        } 
        else if (isDown && !Greenfoot.isKeyDown(key)|| (isDown && Greenfoot.mouseClicked(this)))
        {
            setImage("black-key.png");
            isDown = false;
        } 
    }

    /**
     * Play a sound.
     **/
    private void play()
    {
        Greenfoot.playSound(sound);
    }
    
    
}