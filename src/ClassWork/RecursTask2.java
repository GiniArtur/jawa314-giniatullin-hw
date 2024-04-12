package ClassWork;

public class RecursTask2 {                     // JAVA314 Giniyatullin   Самостоятельная работа
    public static void main(String[] args) {   // TODO Нахождение максимального элемента рекурсия
        int[] arr = {1, 2, 3, 5, -4, 100};
        int max = findMax(arr, arr.length - 1);
        System.out.println("Max = " + max);
    }
    public static int findMax(int[] arr, int index) {
        if (index > 0) {
            return  Math.max(arr[index],findMax(arr, index-1));
        } else return arr[0];
    }
}



