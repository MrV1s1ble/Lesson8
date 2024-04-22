import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.

        int nums[] = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(100);
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        int index = 0;
        int reverseNums[] = new int[10];
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
            reverseNums[index] = nums[i];
            index++;
        }
        System.out.println();
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        for (int i = 0; i < reverseNums.length; i++) {
            System.out.print(reverseNums[i] + " ");
        }
    }
}
