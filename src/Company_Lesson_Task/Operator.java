package Company_Lesson_Task;

        //Java314 Giniyatullin_A_F
/*
•	Operator — зарплата складывается только из фиксированной части
 */

public class Operator implements Employee{

    private String workerType = "Operator";   // Вид рабочего
    @Override
    public String getWorkerType() {
        return workerType;
    }
    private int fixedPart = 30_000;     // Фиксированная часть З.П.
    public double getMonthSalary() {
        return fixedPart;
    }

}

