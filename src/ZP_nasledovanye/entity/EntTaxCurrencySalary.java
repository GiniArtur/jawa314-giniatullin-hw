package ZP_nasledovanye.entity;

public class EntTaxCurrencySalary extends EntTaxChildSalary{                       //Валюта
    private String currency;                       // наименование валюты
    private double cource;                         // курс валюты в цифрах
    private String courceName = "1/1";             // курс валюты в текстовом представлении
    private double salary;                         // зарплата с вычетом налогов
    public EntTaxCurrencySalary(SalaryType salaryType) {
        super(salaryType);
    }   //   конструктор

    /**
     * Возвращает наименование валюты
     * @return наименование валюты
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Устанавливает наименование валюты
     * @param currency наименование валюты
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Возвращает наименование курса валют
     * @return наименование курса валют
     */
    public String getCourceName() {
        return courceName;
    }

    /**
     * Задаёт текстовое представление курса валют (рубль/валюта)
     * @param courceName текстовое представление курса валют (рубль/валюта)
     */
    public void setCourceName(String courceName) {
        this.courceName = courceName;
    }

    /**
     * Выполняет расчёт заработной платы за выполненные работы
     *
     * @return расчитанная заработная плата за выполненные работы
     */
    @Override
    public void toComputeSalary() {
        super.toComputeSalary();               // подсчитали зарплату
        salary = super.getSalary();

    }

    @Override
    public String toString() {
        StringBuilder retval = new StringBuilder(super.toString());
                         // проверяем тип начисляемой зарплаты
        if (super.getSalaryType() == SalaryType.HOURLY) {
                         // если оплата почасовая, половину зарплаты расcчитываем в валюте
            retval.append("; cource ").append(currency).append("=").append(courceName).append("; subtotal=").append(String.valueOf(salary / 2));
            retval.append("/");
            retval.append(String.valueOf(currencySalary()));
        }

        return retval.toString();
    }

    /**
     * Возвращает часть вычисленной зарплаты в валюте
     * @return курс валют в цифровом представлении
     */
    private double currencySalary() {
        return salary * calcCource() / 2;
    }

    /**
     * Возвращает вычисленный курс валют в цифровом представлении
     * @return курс валют в цифровом представлении
     */
    private double calcCource() {                                      //Вычисляем курс
                 // ищем позицию символа / в наименовании курса валют
        int pos = courceName.indexOf("/");
        if (pos == -1) {
                              // если символ не найден возвращаем 1
            return 1;
        } else {
            double part1 = Double.parseDouble(courceName.substring(0, pos));
            double part2 = Double.parseDouble(courceName.substring(pos +1));
            return part1 / part2;
        }
    }
}
