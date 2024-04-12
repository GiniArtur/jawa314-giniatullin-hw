package Company_Lesson_Task;

import java.util.Random;
                                                    // Java314 Giniyatullin_A_F
/*
Создайте классы сотрудников с информацией о зарплатах и условиями начисления зарплаты:
•	Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для
компании денег. Количество заработанных денег для компании генерируйте
случайным образом от 115 000 до 140 000 рублей.
  */

public class Manager implements Employee{

    double bonus = 0.05;        // Процент*бонус* к З.П.

    int fixedPart = 50_000;    // Фиксированная часть З.П.

    private String workerType = "Manager";        // Вид рабочего
    @Override
    public String getWorkerType() {
        return workerType;
    }

    @Override
    public double getMonthSalary() {
        var random = new Random();
        int lowerBound = 10_000;                     // нижняя граница
        int upperBound = 40_000;                    // верхняя граница
        int moneyMade = random.nextInt(upperBound - lowerBound) + lowerBound; // Тарифная часть заработной платы
        return fixedPart * 1.5 + moneyMade * bonus;
    }

}

