package Lyambda;




//Java314 Giniyatullin _AF
/*
Задание 1. Реализовать класс Robot
Direction, направление взгляда робота — это перечисление:
public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
Дополнительный метод к Роботу. Статический.
Принимает на вход 3 аргумента int toX, int toY, Robot robot
Пример:
В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward();
 */


public class Test {

        public static void main(String[] args) {
            Robot robot = new Robot(-1, 0, Direction.UP);
            Robot.moveTo(3, 0, robot);
            System.out.println("Другое направление **********:");
            Robot.moveTo(10, 0, robot);
            System.out.println("Другое направление ***********:");
            Robot.moveTo(-5, -9, robot);
        }
    }

