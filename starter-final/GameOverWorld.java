// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(800, 600, 1);
        showTextWithBigBlackFont("Game over, You Lose", 150, 200);
    }

    /**
     * 
     */
    public void showTextWithBigBlackFont(String messageInt, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        String message = "Game Over, You Lose";
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
