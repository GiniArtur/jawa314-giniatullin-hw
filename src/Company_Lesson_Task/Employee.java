package Company_Lesson_Task;

        //// Java314 Giniyatullin_A_F

/*
Каждый класс сотрудника должен имплементировать интерфейс Employee.
В интерфейсе Employee должен быть объявлен метод,
возвращающий зарплату сотрудника, — getMonthSalary().
 */


    public interface Employee {
        public double getMonthSalary();
        public String getWorkerType();
    }


