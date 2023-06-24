import java.util.ArrayList;
import java.util.List;

public class bilfibonacci {
        public static void main(String[] args) {
            int start = 10;
            int end = 4500;

            List<Integer> fibonacciNumbers = new ArrayList<>();
            List<Integer> evenFibonacciNumbers = new ArrayList<>();

            // Membangun deret Fibonacci hingga mencapai batas atas
            int a = 0;
            int b = 1;

            while (b <= end) {
                if (b >= start) {
                    fibonacciNumbers.add(b);
                    if (b % 2 == 0) {
                        evenFibonacciNumbers.add(b);
                    }
                }

                int temp = b;
                b = a + b;
                a = temp;
            }

            // Menampilkan deret bilangan Fibonacci genap
            System.out.println("Deret Fibonacci Genap:");
            for (int num : evenFibonacciNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Menampilkan jumlah bilangan dalam deret Fibonacci genap
            System.out.println("Total bilangan dalam deret Fibonacci Genap: " + evenFibonacciNumbers.size());

            // Menghitung dan menampilkan jumlah bilangan dalam deret Fibonacci genap
            int sum = 0;
            for (int num : evenFibonacciNumbers) {
                sum += num;
            }
            System.out.println("Jumlah bilangan dalam deret Fibonacci Genap: " + sum);
        }
    }


