package Company_Lesson_Task;
//Java314 Giniyatullin_A_F
/*
•	TopManager — зарплата складывается из фиксированной части и бонуса
в виде 150% от заработной платы, если доход компании более 10 млн рублей.
 */

import java.util.Random;

public class TopManager implements  Employee {
    double bonusRatio = 1.5;   // Процент*бонус* к З.П.
    int fixedPart = 100_000;    // Фиксированная часть З.П.

    private String workerType = "TopManager";
    @Override
    public String getWorkerType() {
        return workerType;
    }
    @Override
    public double getMonthSalary() {
        double bonus = 0;

        var random = new Random();
        int lowerBound = 9_000_000;
        int upperBound = 12_000_000;
        int companyIncome = random.nextInt(upperBound - lowerBound) + lowerBound;
        if (companyIncome > 10_000_000) {
            bonus = fixedPart * 2 * bonusRatio;
        }

        return fixedPart * 2 + bonus;
    }

}
