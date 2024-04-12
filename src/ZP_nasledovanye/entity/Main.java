package ZP_nasledovanye.entity;

import ZP_nasledovanye.daoimpl.DaoEmployeeImpl;
import ZP_nasledovanye.entity.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {                                       //Java314_Giniyatullin_Домашка_по-Заработной_Плате
    public static void main(String[] args) {
        // все сотрудники не платят налоги
        System.out.println("Сотрудники не платят налоги");
        DaoEmployeeImpl daoEmployee = new DaoEmployeeImpl();// объект доступа к данным сотрудников  Создается новый Array_List сотрудников
        // добавляем сотрудников
        EntEmployee employee1 = new EntEmployee("Bob", new EntSalary(EntSalary.SalaryType.BET));// ставка
        EntEmployee employee2 = new EntEmployee("Robert", new EntSalary(EntSalary.SalaryType.HOURLY));// почасовая
        EntEmployee employee3 = new EntEmployee("Sergey", new EntSalary(EntSalary.SalaryType.PIECEWORK));// сдельная
        daoEmployee.addEmployee(employee1);
        daoEmployee.addEmployee(employee2);
        daoEmployee.addEmployee(employee3);
        employee1.getSalary().addJob(new EntJob(150, 10));
        employee1.getSalary().addJob(new EntJob(100, 10));
        employee2.getSalary().addJob(new EntJob(100, 15));
        employee3.getSalary().addJob(new EntJob(1000, 5));
        daoEmployee.getAllEmployee().forEach((employee) -> {
            employee.getSalary().toComputeSalary();
            System.out.println(employee);
        });

        // все сотрудники платят налоги в зависимости от вида начисляемой зарплаты
        System.out.println("Сотрудники платят налоги в зависимости от вида начисляемой зарплаты");

        EntTaxSalary taxSalary1 = new EntTaxSalary(EntSalary.SalaryType.BET);
        taxSalary1.setTax(20);
        EntTaxSalary taxSalary2 = new EntTaxSalary(EntSalary.SalaryType.HOURLY);
        taxSalary2.setTax(20);
        EntTaxSalary taxSalary3 = new EntTaxSalary(EntSalary.SalaryType.PIECEWORK);
        taxSalary3.setTax(15);
        taxSalary1.addJob(new EntJob(150, 10));
        taxSalary1.addJob(new EntJob(100, 10));
        taxSalary2.addJob(new EntJob(100, 10));
        taxSalary3.addJob(new EntJob(1000, 5));
        employee1.setSalary(taxSalary1);
        employee2.setSalary(taxSalary2);
        employee3.setSalary(taxSalary3);
        daoEmployee.getAllEmployee().forEach((employee) -> {
            employee.getSalary().toComputeSalary();
            System.out.println("\n" + employee);
        });
//        daoEmployee.getAllEmployee().clear();// очищаем весь список

        // теперь у сотрудников установлен признак бездетности
        System.out.println("У сотрудников установлен признак бездетности");
        EntTaxChildSalary taxChildSalary1 = new EntTaxChildSalary(EntSalary.SalaryType.BET);
        taxChildSalary1.setTax(20);
        taxChildSalary1.setChild(false);
        EntTaxChildSalary taxChildSalary2 = new EntTaxChildSalary(EntSalary.SalaryType.HOURLY);
        taxChildSalary2.setTax(20);
        EntTaxChildSalary taxChildSalary3 = new EntTaxChildSalary(EntSalary.SalaryType.PIECEWORK);
        taxChildSalary3.setTax(15);
        taxChildSalary1.addJob(new EntJob(150, 10));
        taxChildSalary1.addJob(new EntJob(100, 10));
        taxChildSalary2.addJob(new EntJob(100, 10));
        taxChildSalary3.addJob(new EntJob(1000, 5));
        employee1.setSalary(taxChildSalary1);
        employee2.setSalary(taxChildSalary2);
        employee3.setSalary(taxChildSalary3);
        daoEmployee.getAllEmployee().forEach((employee) -> {
            employee.getSalary().toComputeSalary();
            System.out.println("\n" + employee);
        });


        // теперь сотрудники с почасовой оплатой половину зарплаты получают в валюте
        System.out.println("Currency salary");
        EntTaxCurrencySalary taxCurrencySalary = new EntTaxCurrencySalary(EntSalary.SalaryType.HOURLY);
        taxCurrencySalary.addJob(new EntJob(100, 40));
        taxCurrencySalary.setCurrency("USD");// наименование валюты
        taxCurrencySalary.setCourceName("1/20");// курс валют
        taxCurrencySalary.setTax(20);
        employee2.setSalary(taxCurrencySalary);
        daoEmployee.getAllEmployee().forEach((employee) -> {
            employee.getSalary().toComputeSalary();
            System.out.println("\n" + employee);
        });

        System.out.println("Offshore Employee");
        // теперь часть сотрудников переведены в офшор, налогов не платят
        EntOffshoreSalary offshoreSalary = new EntOffshoreSalary(EntSalary.SalaryType.HOURLY);
        offshoreSalary.setOffshore(true);
        offshoreSalary.setCurrency("USD");
        offshoreSalary.setCourceName("1/20");
        offshoreSalary.addJob(new EntJob(1000, 5));
        employee3.setSalary(offshoreSalary);
        daoEmployee.getAllEmployee().forEach((employee) -> {
            employee.getSalary().toComputeSalary();
            System.out.println("\n" + employee);
        });

        // теперь сотрудники, проработавшие больше 200 часов и не находящиеся в офшоре,
        // получают премии
        System.out.println("Prize Employee");
        EntPrizeSalary entPrizeSalary = new EntPrizeSalary(EntSalary.SalaryType.HOURLY);
        entPrizeSalary.setOffshore(false);// не находится в офшоре
        entPrizeSalary.setTax(13);// налог 13%
        entPrizeSalary.setCurrency("EU");//
        entPrizeSalary.setCourceName("1/35");
        entPrizeSalary.addJob(new EntJob(150, 210));
        entPrizeSalary.setPrize(2000);
        System.out.println(entPrizeSalary.getJob(0).toString());
        EntEmployee prizeEmployee = new EntEmployee("Biden", entPrizeSalary);
        daoEmployee.addEmployee(prizeEmployee);
        daoEmployee.getAllEmployee().forEach((employee) -> {
            employee.getSalary().toComputeSalary();
            System.out.println("\n" + employee);
        });
    }
}