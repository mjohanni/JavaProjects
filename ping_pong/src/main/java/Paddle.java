import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle{

    int playerId;
    int yVelocity;
    int speed = 10;
    public Paddle(int x,int y,int PADDLE_WIDTH,int PADDLE_HEIGHT,int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.playerId = id;
    }

    public void KeyPressed(KeyEvent key){
        switch(playerId){
            case 1:
                if( key.getKeyCode() == KeyEvent.VK_W){
                    setYDirection(-speed);
                    move();
                }
                if( key.getKeyCode() == KeyEvent.VK_S){
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                if( key.getKeyCode() == KeyEvent.VK_UP){
                    setYDirection(-speed);
                    move();
                }
                if( key.getKeyCode() == KeyEvent.VK_DOWN){
                    setYDirection(speed);
                    move();
                }
                break;
        }
    }

    public void KeyReleased(KeyEvent key){
        switch(playerId){
            case 1:
                if(key.getKeyCode() == KeyEvent.VK_W){
                    setYDirection(0);
                    move();
                }
                if(key.getKeyCode() == KeyEvent.VK_S){
                    setYDirection(0);
                    move();
                }
                break;
            case 2:
                if(key.getKeyCode() == KeyEvent.VK_UP){
                    setYDirection(0);
                    move();
                }
                if(key.getKeyCode() == KeyEvent.VK_DOWN){
                    setYDirection(0);
                    move();
                }
                break;
        }
        if(key.getKeyCode() == KeyEvent.VK_ESCAPE){

            System.exit(0);
        }
    }

    public void setYDirection(int yDirection){
        yVelocity = yDirection;
    }

    public void move(){
        y += yVelocity;
    }

    public void draw(Graphics graph){
        if (playerId==1){
            graph.setColor(Color.ORANGE);
        }else{
            graph.setColor(Color.GREEN);
        }
        graph.fillRect(x,y,width,height);
    }
}
