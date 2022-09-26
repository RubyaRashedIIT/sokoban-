package sokoban1;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Player extends Element {

    public Player(int x, int y) {
        super(x, y);

        initPlayer();
    }

    private void initPlayer() {

        ImageIcon iicon = new ImageIcon(getClass().getResource("sokoban.png"));
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



