public class fibonacci {
    public static void main (String args){
        int start = 10;
        int end = 4500;
        int sum = 0;

        System.out.println("deret fibonacci genap dari" + start + "sampai" + end +":");

        int[] fibonacciArray = generatefibonacci(start, end);
        for (int num : fibonacciArray){
            if(num % 2 == 0){
                System.out.print(num+ "");
                sum += num;
            }
        }
        System.out.println("\nTotal bilangan fibonacci genap:"+ fibonacciArray.length);
        System.out.println("jumlah bilangan fibonacci genap:"+ sum);
    }

    public static int[] generatefibonacci(int start, int end) {
        int[] fibonacciArray = new int [50]; //batasi panjang array fibonacci jika diperlukan
        int i = 0;
        int prev = 0;
        int current = 1;
        int next = 1;

        while (current <= end){
            if (current >= start){
                fibonacciArray[i] = current;
                i++;
            }
            prev = current;
            current = next;
            next = prev + current;
        }
        return fibonacciArray;
    }
}
