import java.awt.*;

public class Paddle {
    private int x;
    private int y;
    private final int width = 200;
    private final int height = 15;

    public Paddle(){
        x = Window.getWimdow_sizeWidth() / 2 - 30;
        y = Window.getWimdow_sizeHeight() - 40;
    }

    public void paintPaddle(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    public int getX() {
        return x;
    }


    public void setX(int x){
        this.x = x;
    }

}
