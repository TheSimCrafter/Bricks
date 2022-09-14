import sas.*;
import java.awt.Color;
/**
 * Beschreiben Sie hier die Klasse Ball.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ball
{
    Picture ball;
    
    public Ball(int pPosX,int pPosY)
    {
        int ballX = 64;
        int ballY = 64;
        ball = new Picture(pPosX-ballX/2,pPosY-ballY/2,64,64,"fire_charge.png");
    }
    
    public void start(Shapes pPlatform)
    {
        ball.setDirection(180);
        while(ball.intersects(pPlatform))
        {
            ball.move(-1);
        }
    }
}
