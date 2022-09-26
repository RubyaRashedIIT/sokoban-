package sokoban1;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Baggage extends Element {

	    public Baggage(int x, int y) {
	        super(x, y);
	        
	        initBaggage();
	    }
	    
	    private void initBaggage() {
	        
	        ImageIcon iicon = new ImageIcon(getClass().getResource("baggage.png"));
	        Image image = iicon.getImage();
	        setImage(image);
	    }

	    public void move(int x, int y) {
	        
	        int dx = getX() + x;
	        int dy = getY() + y;
	        
	        setX(dx);
	        setY(dy);
	    }
	}



