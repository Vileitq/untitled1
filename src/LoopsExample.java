public class LoopsExample {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Числа от 10 до 1");
        int j = 10;
        while (j >= 1) {

            System.out.println(j);
            j--;
        }
    }
}
