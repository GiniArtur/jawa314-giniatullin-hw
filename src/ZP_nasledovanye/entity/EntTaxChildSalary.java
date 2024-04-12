package ZP_nasledovanye.entity;

public class EntTaxChildSalary extends EntTaxSalary{
    private double salary;
    private double totalSalary;
    private boolean child = true;                                         // по умолчанию у сотрудников есть дети

    public EntTaxChildSalary(SalaryType salaryType) {
        super(salaryType);
    }

    /**
     * Выполняет расчёт заработной платы за выполненные работы
     */
    @Override
    public void toComputeSalary() {
        if (!child) {
                                              // если бездетный, налог увеличиваем на 5 процентов от заданного
            super.setTax(super.getTax() + 5);
        }
        super.toComputeSalary();// вычисляем зарплату
        salary = super.getSalary();

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getTotalSalary() {
        return totalSalary;
    }

    public boolean isChild() {
        return child;
    }

    public void setChild(boolean child) {
        this.child = child;
    }
}
