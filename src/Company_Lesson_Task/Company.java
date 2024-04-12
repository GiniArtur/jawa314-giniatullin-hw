package Company_Lesson_Task;

import java.util.*;
                                    //Java314  Giniyatullin_A_F
                                    // Todo Создайте класс компании Company, содержащей сотрудников и реализующей методы:
                                    //•	найм одного сотрудника — hire(Employee employee),
                                    //•	найм списка сотрудников – hireAll(Collection<Employee> employes),
                                    //•	увольнение сотрудника – fire(Employee employee),
                                    //•	получение значения дохода компании – getIncome().
public class Company {
    private List<Employee> employees = new ArrayList<>();  // Создаем список работников

    public List<Employee> getTopSalaryStaff(int count) {  //возвращаем  список сотрудников указанной длины (count),
                                                          // отсортированных по возрастанию заработной платы
        List<Employee> sortedEmployees = new ArrayList<>(employees);
        sortedEmployees.sort((emp1, emp2) -> Double.compare(emp2.getMonthSalary(), emp1.getMonthSalary())); // Вызываем метод sort из   Collections
        return sortedEmployees.subList(0, Math.min(count, sortedEmployees.size()));
    }

    public List<Employee> getLowestSalaryStaff(int count) {  //возвращаем  список сотрудников указанной длины (count),
                                                            // отсортированных по убыванию  заработной платы
        List<Employee> sortedEmployees = new ArrayList<>(employees);
        sortedEmployees.sort((emp1, emp2) -> Double.compare(emp1.getMonthSalary(), emp2.getMonthSalary()));  //лямбда функция - сравнение зарплат помесячно
        return sortedEmployees.subList(0, Math.min(count, sortedEmployees.size())); //возвращает список от первого элемента, (сравнивает
                                                                                    // минимальное значение между размером всего листа и введенным count
    }
    public int getPeople() {           // Количество работника
        return employees.size();
    }
    public void hire(Employee employee) {  //Найм работника
        employees.add(employee);
    }
    public void hireAll(Collection<Employee> employeeList) {   // Найм сразу всех
        employees.addAll(employeeList);
    }

    public void fire(String workerType) {                   //Увольнение сотрудника
        for (int i = 0; i < employees.size(); i++) {
            if (workerType == employees.get(i).getWorkerType()) { // Если вид рабочего совпадает с введенным параметром то удаляем сотрудника
                employees.remove(i);
                return;                                           // Когда выполнится условие- будет сразу выход из цикла
            }
        }
    }
    public double getIncome() {
        var random = new Random();
        return random.nextInt(9_000_000, 11_000_000);

    }
}


