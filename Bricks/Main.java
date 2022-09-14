import sas.*;
import java.awt.Color;
/**
 * Beschreiben Sie hier die Klasse main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    View spielfenster;
    Ball ball;
    Platform platform;

    public Main(int pWindowX,int pWindowY)
    {
        spielfenster = new View(pWindowX,pWindowY);
        ball = new Ball(pWindowX/2,pWindowY/6*5);

        platform = new Platform(pWindowX/2,pWindowY/6*5);
        ball.start(platform);
    }
    
}
