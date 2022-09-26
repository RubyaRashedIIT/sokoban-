package sokoban1;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Wall extends Element{

	    private Image image;

	    public Wall(int x, int y) {
	        super(x, y);
	        
	        initWall();
	    }
	    
	    private void initWall() {
	        
	        ImageIcon iicon = new ImageIcon(getClass().getResource("wall.png"));
	        image = iicon.getImage();
	        setImage(image);
	    }
	}



