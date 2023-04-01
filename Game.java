import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements ActionListener {
    private int score = 0;
    private Ball ball = new Ball();
    private Paddle paddle = new Paddle();

    private int totalBricks = 21;

    private Timer time;
    private final int delay = 5;

    public Game() {
        setBackground(Color.black);
        setFocusTraversalKeysEnabled(false);
        setFocusable(true);
        addKeyListener(new KeyBoardListener());

        time = new Timer(20, this);
        time.start();
    }

    public void paint(Graphics g){
        super.paint(g);
       /* g.setColor(Color.BLACK);
        g.fillRect(0,0, Window.getWimdow_sizeWidth(), Window.getWimdow_sizeHeight());*/

        g.setColor(Color.YELLOW);
        g.fillRect(0,0, 5, Window.getWimdow_sizeHeight());
        g.fillRect(0, 0, Window.getWimdow_sizeWidth(), 7);
        g.fillRect(Window.getWimdow_sizeWidth() ,0, 5, Window.getWimdow_sizeHeight());
        g.setColor(Color.RED);
        g.fillRect(0 ,Window.getWimdow_sizeHeight() - 10, Window.getWimdow_sizeWidth() +5, 7);


        paddle.paintPaddle(g);
        ball.paintBall(g);
       g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}