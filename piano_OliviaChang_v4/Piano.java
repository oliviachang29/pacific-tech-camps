import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 */
public class Piano extends World
{
    private String[] whiteKeys =
        { "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "\\" };
    private  String[] whiteNotes =
        { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };
        
    private String[] blackKeys =
        { "W", "E", "", "T", "Y", "U", "", "O", "P", "", "]" }; 
    private String[] blackNotes =
        { "3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#" }; 
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        makeKeys();
    }
    public void makeKeys()
    {
        for(int i=0; i< whiteKeys.length; i++)
        {
            addObject(new Key(whiteKeys[i], whiteNotes[i] + ".wav"), (i * 63) + 54, 140);
        }
        // make the black keys
        for(int i = 0; i < blackKeys.length; i++) {
            if( ! blackKeys[i].equals("") )
            {
                addObject(new BlackKey(blackKeys[i], blackNotes[i] + ".wav"), (i * 63) + 85, 86);
            }
        }
    }
}