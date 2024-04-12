package NewClass;

public class SimpleClass {   //Java314_Giniyatullin
    public static void main(String[] args) {   //TODO 4 метода - сложение, вычитание, умножение и деление полей с возвращаемым значением
        Calculator task1 = new Calculator();
        task1.add(4.2,5);
        task1.multiplication(4.2, 5.0);
        task1.subtraction(4.2, 5.0);
        task1.division(4.2, 5.0);
    }
}