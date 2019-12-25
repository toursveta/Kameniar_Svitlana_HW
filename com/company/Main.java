package com.company;

public class Main {

        public static void main (String[] args) {
            int res =5;
            res = -32 % 6;

            System.out.printf("Result %d",res);

                                    }
        /*static int factorial(int n)
        {
            // Факториал отрицательного числа не считается
             (n >= 0);

            // Если n превысит 10, то это может привести либо к целочисленному
            // переполнению результата, либо к переполнению стэка.
            assert(n <= 4);
            System.out.printf("n= %d",n);
            if (n < 2) {
                return 1;
                       }
            return factorial(n - 1) * n;

        }*/
}
