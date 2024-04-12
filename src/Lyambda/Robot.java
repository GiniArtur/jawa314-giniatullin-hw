package Lyambda;


/*  Пояснение к работе:
public class Robot {
    public Direction getDirection() {
    текущее направление взгляда
    }
    public int getX() {
    текущая координата X
    }
    public int getY() {
    текущая координата Y
    }
    public void turnLeft() {
    повернуться на 90 градусов против часовой стрелки
    }
    public void turnRight() {
    повернуться на 90 градусов по часовой стрелке
    }
    public void stepForward() {
    шаг в направлении взгляда
    за один шаг робот изменяет одну свою координату на единицу
 */

public class Robot {
    private Direction direction = Direction.UP;
    private int currentX = 0;
    private int currentY = 0;

    public Robot(int x, int y, Direction direction) {
        this.currentX = x;
        this.currentY = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return currentX;
    }

    public int getY() {
        return currentY;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        direction = direction.turnRight();
        System.out.println("Поворот направо");
    }

    public void stepForward() {                 //шаг вперед
        switch (direction) {
            case UP -> currentY++;
            case DOWN -> currentY--;
            case LEFT -> currentX--;
            case RIGHT -> currentX++;
        }
        System.out.println("Следующий шаг вперед");
    }

    public static void moveTo(int X, int Y, Robot robot) {         //переместить
        System.out.println("Движение выбрано");
        while (robot.getX() != X || robot.getY() != Y) {
            if (robot.getX() < X && robot.getDirection() != Direction.RIGHT) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        break;
                    case DOWN:
                        robot.turnLeft();
                        break;
                    case LEFT:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                }
            }
            if (robot.getX() > X && robot.getDirection() != Direction.LEFT) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnRight();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                }
            }
            if (robot.getY() < Y && robot.getDirection() != Direction.UP) {
                switch (robot.getDirection()) {
                    case LEFT:
                        robot.turnRight();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                }
            }
            if (robot.getY() > Y && robot.getDirection() != Direction.DOWN) {
                switch (robot.getDirection()) {
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        break;
                    case UP:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                }
            }
            robot.stepForward();
        }
    }
}

