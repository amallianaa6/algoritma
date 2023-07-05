public class Calculating {
        private int number1;
        private int number2;

        public void setNumber1(int num) {
            this.number1 = num;
        }

        public void setNumber2(int num) {
            this.number2 = num;
        }

        public void addAllNumber() {
            int sum = number1 + number2;
            System.out.println("Sum: " + sum);
        }

        public void multiplyNumber(int num1, int num2) {
            int product = num1 * num2;
            System.out.println("Product: " + product);
        }

        public int getNumber1() {
            return number1;
        }

        public int getNumber2() {
            return number2;
        }

        public static void main(String[] args) {
            Calculating z = new Calculating();

            z.setNumber1(6);
            z.setNumber2(90);

            z.addAllNumber();
            z.multiplyNumber(z.getNumber1(), z.getNumber2());
        }
    }




