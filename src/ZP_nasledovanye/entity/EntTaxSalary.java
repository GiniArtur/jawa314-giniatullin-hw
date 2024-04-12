package ZP_nasledovanye.entity;

public class EntTaxSalary extends EntSalary{        //сущность налог
    private double salary;
    private double totalSalary;
    private double tax = 0;// величина налога
    /**
     * Возвращает величину налога в процентах
     * @return величина налога
     */
    public double getTax() {
        return tax;
    }

    /**
     * Задаёт величину налога в процентах
     * @param tax величина налога
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalSalary() {
        return totalSalary;
    }      // Возвращает Максимальную зарплату

    public EntTaxSalary(SalaryType salaryType) {
        super(salaryType);
    }

    /**
     * Выполняет расчёт заработной платы за выполненные работы
     */
    @Override
    public void toComputeSalary() {
        super.toComputeSalary();
        salary = super.getSalary();
        totalSalary = salary * (100 - tax) / 100;                 //итоговая зарплата
    }

    @Override
    public String toString() {
        return super.toString() + "tax=" + tax + "%" + "; summa=" +
                salary + "; total=" + totalSalary;
    }
}
