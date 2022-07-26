public class Main {
    public static void main(String[] args) {
        task();
        task2();
    }

    public static void task() {
        int[] arr = new int[30];
        int sum = 0;
        int max = 0;
        int min = 100_000;
        double mean = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100_00) + 100_00;
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        for (int j : arr) {

            mean += j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (int) Math.abs(mean / 30) + " рублей");

    }

    public static void task2() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(reverseFullName[i]);
            } else System.out.print(reverseFullName[i]);
        }


    }

}
