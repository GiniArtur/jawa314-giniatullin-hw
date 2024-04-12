package ZP_nasledovanye.entity;

public class EntPrizeSalary extends EntOffshoreSalary{
    private double prize;// размер премии для работников с почасовой зарплатой, не находящихся в офшоре
    private double totalSalary;// общий размер зарплаты с учётом премии

    @Override
    public double getTotalSalary() {
        return totalSalary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    private double salary;
    public EntPrizeSalary(SalaryType salaryType) {
        super(salaryType);
    }

    @Override
    public String toString() {
        return super.toString() + ";\n prize=" + prize + "; totalsalary=" + totalSalary + ';';
    }

    /**
     * Выполняет расчёт заработной платы за выполненные работы
     *
     * @return расчитанная заработная плата за выполненные работы
     */
    @Override
    public void toComputeSalary() {
        // размер зарплаты
        super.toComputeSalary();
        double salary = super.getSalary();
        // назначаем премию
        if (super.getSalaryType() == SalaryType.HOURLY) {
            // если оплата труда почасовая
            if (!super.isOffshore() && super.getCountJobTime() > 200) {
                // если сотрудник не в офшоре и отработал больше 200 часов
                totalSalary = salary + prize;
            }
        }
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
}
