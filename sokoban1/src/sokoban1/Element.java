package sokoban1;
import java.awt.Image;


public class Element {
	
	    private final int SPACE = 20;

	    private int x;
	    private int y;

	    private Image image;

	    public Element(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public Image getImage() {
	        return image;
	    }

	    public void setImage(Image img) {
	        image = img;
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public boolean isLeftCollision(Element element) {
	        return getX() - SPACE == element.getX() && getY() == element.getY();
	    }

	    public boolean isRightCollision(Element element) {
	        return getX() + SPACE == element.getX() && getY() == element.getY();
	    }

	    public boolean isTopCollision(Element element) {
	        return getY() - SPACE == element.getY() && getX() == element.getX();
	    }

	    public boolean isBottomCollision(Element element) {
	        return getY() + SPACE == element.getY() && getX() == element.getX();
	    }
	}



