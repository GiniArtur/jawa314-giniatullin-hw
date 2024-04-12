package ZP_nasledovanye.entity;

public class EntOffshoreSalary extends EntTaxCurrencySalary{

    private boolean offshore = false;                           // флаг нахождения в офшоре
    private double salary;
    public EntOffshoreSalary(SalaryType salaryType) {
        super(salaryType);
    }

    public boolean isOffshore() {
        return offshore;
    }

    public void setOffshore(boolean offshore) {
        this.offshore = offshore;
    }

    /**
     * Выполняет расчёт заработной платы за выполненные работы
     *
     * @return расчитанная заработная плата за выполненные работы
     */
    @Override
    public void toComputeSalary() {
        if (offshore) {
            // если усрановлен признак нахождения в офшоре
            super.setTax(0);// снимаем налоги
        }
        super.toComputeSalary();
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
}
