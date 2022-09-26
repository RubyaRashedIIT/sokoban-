package sokoban1;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Area extends Element {

    public Area(int x, int y) {
        super(x, y);
        
        initArea();
    }
    
    private void initArea() {

        ImageIcon iicon = new ImageIcon(getClass().getResource("area.png"));
        Image image = iicon.getImage();
        setImage(image);
    }
}




