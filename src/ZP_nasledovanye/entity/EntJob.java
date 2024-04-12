/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZP_nasledovanye.entity;

/**
 * @author Sergii.Tushinskyi
 */
public class EntJob {                                         //
    private double rate;                           // ставка
    private int count;                             // количество часов

    public int getCount() {                     // вытащить счетчик
        return count;
    }

    public void setCount(int count) {           // устанавливаем счетчик
        this.count = count;
    }

    public EntJob() {                  //Конструктор по умолчанию
    }

    public EntJob(double rate, int count) {     // конструктор устанавливаем ставку и количество часов
        this.rate = rate;
        this.count = count;
    }

    public double getRate() {
        return rate;
    }     //вызов ставки

    public void setRate(double rate) {
        this.rate = rate;
    }  // уставнавливаем ставку

    @Override
    public String toString() {
        return "EntJob{" +
                "rate=" + rate +
                ", count=" + count +
                '}';
    }
}
