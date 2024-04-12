/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZP_nasledovanye.entity;

import java.util.ArrayList;
import java.util.List;


public class EntSalary {                                                //Зарплата
    public enum SalaryType {BET, HOURLY, PIECEWORK}

    ;                    // ПЕРНЧИСЛЕНИЕ --- ставка, почасовая, сдельщина
    private final String[] type = new String[]{"ставка", "почасовая", "сдельная"};   // массив- "ставка", "почасовая", "сдельная"
    private List<EntJob> jobList = new ArrayList<>();       // Рабочий лист
    private double salary;                                  //зарплата

    public SalaryType getSalaryType() {
        return salaryType;
    }               // Выводим тип зарплаты из перечислений ENUM

    private final SalaryType salaryType;      // Сссылка на объект ENUM

    public EntSalary(SalaryType salaryType) {
        this.salaryType = salaryType;
    }   //Конструктор устанавливаем тип зарплаты

    public EntJob getJob(int index) {
        return jobList.get(index);
    }              // По номеру индекса выводим работу

    public List<EntJob> getJobList() {
        return jobList;
    }

    public int getJobCount() {
        return jobList.size();
    }

    public boolean addJob(EntJob job) {
        return jobList.add(job);
    }              // Добавилась работа или нет

    public void toComputeSalary() {                                //Подсчет зарплаты
        salary = jobList.stream().mapToDouble(job -> (double) (job.getCount() * job.getRate())).sum();  // Создаем стрим
                                                                                   // производим умножение количества часов на ставку - это суммирум
                                                                                   // сумму элементов приводим в к типу  double

    }

    @Override
    public String toString() {
        String typeName = "";
        switch (salaryType) {
            case BET:
                typeName = type[0];                  // присваиваем "Ставка"
                break;
            case HOURLY:
                typeName = type[1];                    // присваиваем "Почасовая"
                break;
            case PIECEWORK:
                typeName = type[2];                    // присваиваем "Сдельная"
                break;
        }
        return "EntSalary{" + "type=" + typeName + "; salary=" + salary + '}';
    }

    public int getCountJobTime() {                                         //Возвращает Общее количество времени за всю работу
        int count = jobList.stream().mapToInt(EntJob::getCount).sum();     // предназначен для трансформации элементов потока в int.
        return count;                                                       // суммирует результаты возвращаемого из метода getCount
    }

    public double getSalary() {
        return salary;
    }
}
