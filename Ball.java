import java.awt.*;


public class Ball {
    private final int x;
    private final int y;
    private final int r = 30;


    public Ball(){
        x = 45;
        y = 350;
    }

    public void paintBall(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x,y,r,r);
    }
}
