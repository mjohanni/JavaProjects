import java.awt.*;
import java.util.Random;

public class BounceBall extends Rectangle{

    Random random;
    int xVelocity;
    int yVelocity;
    int startSpeed = 2;

    public BounceBall(int x,int y, int width,int height){
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection*startSpeed);

        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection*startSpeed);
    }

    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }

    public void move(){
        x+= xVelocity;
        y+= yVelocity;
    }

    public void draw(Graphics graph){
        graph.setColor(Color.WHITE);
        graph.fillOval(x,y,height,width);
    }
}
