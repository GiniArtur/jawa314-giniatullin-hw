package Company_Lesson_Task;

import java.util.List;
import java.util.Random;                             //Java314 Giniyatullin_AF

    public class Main {
        public static void main(String[] args) {
            Company surgetNefteGas = new Company();
            for (int i = 0; i < 180; i++) {
                surgetNefteGas.hire(new Operator());
            }
            for (int i = 0; i < 80; i++) {
                surgetNefteGas.hire(new Manager());
            }
            for (int i = 0; i < 10; i++) {
                surgetNefteGas.hire(new TopManager());
            }

            List<Employee> top = surgetNefteGas.getTopSalaryStaff(10);
            List<Employee> low = surgetNefteGas.getLowestSalaryStaff(15);

            System.out.println("Лучшие работники: ");
            for (Employee employee : top) {
                System.out.println(employee.getMonthSalary());
            }
            System.out.println("\nХудшие работники: ");
            for (Employee employee : low) {
                System.out.println(employee.getMonthSalary());
            }
            System.out.println("\n");

            System.out.println("Увольнение: ");
            while (surgetNefteGas.getPeople() > 250) {
                var random = new Random();
                int rnd = random.nextInt(3);
                if (rnd == 0) {
                    surgetNefteGas.fire("Operator");
                    System.out.println("Operator уволен");
                }
                if (rnd == 1) {
                    surgetNefteGas.fire("Manager");
                    System.out.println("Manager уволен");
                }
                if (rnd == 2) {
                    surgetNefteGas.fire("TopManager");
                    System.out.println("TopManager уволен");
                }
            }
            System.out.println("\n");

            List<Employee> newtop = surgetNefteGas.getTopSalaryStaff(15);
            List<Employee> newlow = surgetNefteGas.getLowestSalaryStaff(35);

            System.out.println("Лучшие работники: ");
            for (Employee employee : newtop) {
                System.out.println(employee.getMonthSalary());
            }
            System.out.println("\nХудшие работники: ");
            for (Employee employee : newlow) {
                System.out.println(employee.getMonthSalary());
            }

            System.out.println("\n ppl: " + surgetNefteGas.getPeople());

        }
    }

