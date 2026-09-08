public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        System.out.println("Числа");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Сумма: " +sum);
    }

}
