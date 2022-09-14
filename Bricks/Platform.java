import sas.*;
import java.awt.Color;
/**
 * Beschreiben Sie hier die Klasse Platform.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Platform
{
    Picture platform;
    
    public Platform(int pPosX,int pPosY)
    {
        int platformX = 150;
        int platformY = 10;
        platform = new Picture(pPosX-platformX/2,pPosY-platformY/2,platformX,platformY,"grass_bar.png");
    }

}
