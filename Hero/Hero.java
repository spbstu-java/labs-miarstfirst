package Hero;
import MovingType.*;

public class Hero {
    MovingType movingType;

    public void setMoving(MovingType movingType) {
        this.movingType = movingType;
    }

    public void move() {
        movingType.move();
    }
}
