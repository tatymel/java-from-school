import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardListener implements KeyListener {
    Paddle paddle = new Paddle();
    private boolean isGameOver = false;




    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() ==  KeyEvent.VK_RIGHT){
            if(paddle.getX() >= Window.getWimdow_sizeWidth() - 5)
                paddle.setX(Window.getWimdow_sizeWidth() - 5);
            else
            System.out.println("fggg");
                moveRight();

        }
        if(e.getKeyCode() ==  KeyEvent.VK_LEFT){
            if(paddle.getX() <= 5)
                paddle.setX(5);
            else
                moveLeft();

        }
    }

    public void moveRight(){
        isGameOver = true;
        paddle.setX(paddle.getX() + 30);
        System.out.println(paddle.getX() + "  ");
    }

    public void moveLeft(){
        isGameOver = true;
        paddle.setX(paddle.getX() - 30);
    }
}
