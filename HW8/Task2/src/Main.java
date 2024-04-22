import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int sumOfWeights = 0;
        int specialCondition = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(40, 100);
            System.out.print(nums[i] + " ");
            sumOfWeights += nums[i];
            if (nums[i] >= 60 && nums[i] <= 80) {
                specialCondition++;
            }
        }
        double middleWeight = sumOfWeights / 10.0;
        System.out.println();
        System.out.println("Средний вес: " + middleWeight);
        System.out.printf("У %d людей вес находится в промежутке от 60 до 80 кг включительно.", specialCondition);
    }
}
