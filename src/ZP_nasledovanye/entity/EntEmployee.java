/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZP_nasledovanye.entity;

import java.util.ArrayList;
import java.util.List;

public class EntEmployee {                                 //Entity - сущность Работники
    private final String name;                              // Имя сотрудника
    private EntSalary salary;                               //Зарплата
    public EntEmployee(String name) {                       //Конструктор с именем

        this.name = name;
    }

    public EntEmployee(String name, EntSalary salary) {      //Конструктор с именем и зарплатой
        this.name = name;
        this.salary = salary;
    }

    public EntSalary getSalary() {
        return salary;
    }          //Возвращает зарплату

    public void setSalary(EntSalary salary) {
        this.salary = salary;
    }    //Устанавливаем зарплату

    @Override
    public String toString() {
        return "EntEmployee{" + "name=" + name +
                ", salary=" + salary.toString() + '}';
    }
    
}
