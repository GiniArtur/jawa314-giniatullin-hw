package StringsMethods;

public class RangeInt {
    public static void main(String[] args) {
        int l;

        RangeInt.rangeInt(5);
    }
    public static void rangeInt(int l) {        // Принимает длину массива l
        System.out.println("Задан массив чисел = ");
        int[] array;
        array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = (int) (Math.random() * 100 + 100);
            System.out.print(array[i] + " ");
        }
    }
}
