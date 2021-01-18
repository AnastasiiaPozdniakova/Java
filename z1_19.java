package com.company;

import java.util.Scanner;

public class Main {

    public static int readInt()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args)

    {
        z1_19();
    }

    // 12345
    // 1+2
    // -
    // 4+5
    // -6
    // 123321
    //78087
    // 23132

    public  static void z1_19()
    {

        int number = readInt();
        // 12345
        int units =     number / 1 % 10; // units 5
        int tens =      number / 10 % 10;  // tens 4
        int hundred =   number / 100 % 10; // 3
        int thousands = number / 1000 % 10 ; // 2
        int ten_k =     number / 10000 % 10; // 1

        if (ten_k < thousands && thousands < hundred && hundred < tens && tens < units )
        {
            System.out.print("Ascending");
        }
        else
        {
            System.out.print("nit");
        }


    }

    public  static void z1_18()
    {
        // 12345
        // 1^2 + 2^2 + 3^2 + 4^2 + 5^2 = 1 + 4 + 9 + 16 + 25
        // різніть квадратів
        int number = readInt();
        int units =     number / 1 % 10; // units 5
        int tens =      number / 10 % 10;  // tens 4
        int hundred =   number / 100 % 10; // 3
        int thousands = number / 1000 % 10 ; // 2
        int ten_k =     number / 10000 % 10; // 1


        int s_units = units * units;
        int s_tens = tens * tens;
        int s_hundred = hundred * hundred;
        int s_thousands = thousands * thousands;
        int s_ten_k = ten_k * ten_k;

        int sum = s_ten_k + s_thousands +  s_hundred + s_tens + s_units;
        System.out.print(sum);

    }

    public  static void z1_17()
    {
        int number = readInt();
        // 23132
        int units =     number / 1 % 10; // units 5
        int tens =      number / 10 % 10;  // tens 4
        int hundred =   number / 100 % 10; //
        int thousands = number / 1000 % 10 ; // 2
        int ten_k =     number / 10000 % 10; // 1

        int zadom_na_pered = units * 10000 + tens * 1000 + hundred * 100 + thousands * 10 + ten_k;

        if (zadom_na_pered == number)
        {
            System.out.print("uspih");
        }
        else
        {
            System.out.print("nit");
        }

    }

    public static void z1_16()
    {
        int number = readInt();
        int units =     number / 1 % 10; // units 5
        int tens =      number / 10 % 10;  // tens 4
        int thousands = number / 1000 % 10 ; // 2
        int ten_k =     number / 10000 % 10; // 1

        int first_sum = ten_k + thousands;
        int last_sum = units + tens;

        int differnce = first_sum - last_sum;

        System.out.println(differnce);

    }

    public static void z1_15()
    {
        int number = readInt();
        // 1234  -> 4321
        int units =     number / 1 % 10; // units 6
        int tens =      number / 10 % 10;  // tens 5
        int hundreds =  number / 100 % 10; // hundredss 4
        int thousands = number / 1000 % 10 ; // 3

        int number2 = units*1000 + tens * 100 + hundreds * 10 + thousands;

        if (number == number2)
        {
            System.out.print("Vse dobre");
        }
        else
        {
            System.out.print("nit");
        }
    }








    public static void z1_14()
    {
        int number = readInt();
        // 123456  -> 456123
        int units =     number / 1 % 10; // units 6
        int tens =      number / 10 % 10;  // tens 5
        int hundreds =  number / 100 % 10; // hundredss 4
        int thousands = number / 1000 % 10 ; // 3
        int ten_k =     number / 10000 % 10; // 2
        int hundred_k = number / 100000 % 10; // 1


        System.out.print( hundreds * 100000 + tens * 10000 + units * 1000 + hundred_k * 100 + ten_k * 10 + thousands);
    }


    public static void z1_13()
    {
        int number = readInt();
        // 678  -> 36783
        int units = number % 10; // units
        int hundreds = number / 100; // hundredss
        int tens = number / 10 % 10;  // tens

        System.out.print(30000 + hundreds * 1000 + tens * 100 + units * 10 + 3 );
    }

    public static void z1_12()
    {
        int number = readInt();
        // 123  - > 132
        int a = number % 10; // units
        int b = number / 100; // hundredss
        int c = number / 10 % 10;  // tens

        System.out.print(a * 10 + b * 100 + c);
    }

    public static void z1_11()
    {
        int number = readInt();
        // 123
        int a = number % 10; // units
        int b = number / 100; // hundredss
        int c = number / 10 % 10;  // tens

        System.out.print(b * 10 + c * 100 + a);
    }








    public static void greet()
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String today = "15/01/2021";
        System.out.printf("Welcome to our program. Hello %s Today is %s, \n", name, today);
    }

    public static void loop()
    {
        Scanner sc = new Scanner(System.in);
        int i = 0; // iterator - лічільник
        while (i < 3)
        {
            String s1 = sc.next(); // java
            int x = sc.nextInt(); //  100
            System.out.printf("%s %03d", s1, x);  // java 100
            i++;
        }
    }

    public static void ww1_1()
    {
        int number = readInt();
        // 9071 / 10 = 567
        // 907 / 10 = 56
        // 90 / 10 = 5
        // 9 / 10 = 0
        // 0

        int i = 0; // number of digits
        for (;number > 0; )
        {
            number = number / 10;
            i++;
        }
        System.out.print(i);

    }

    public static void infinite()
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int i = 1; // iterator
        while (i <= 10)
        {
            int result = 2 * i;
            System.out.printf("2 x %d = %d\n", i, result);
            i++;
        }
        scanner.close();
    }

    public static void for_loop()
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++)
        {
            int result = 2 * i;
            System.out.printf("2 x %d = %d\n", i, result);
        }

    }


    public static void w1_1() {

        int number = readInt();
        int len = 0; // length of the number

        // 34456 =  len(5)

        while (number > 0)
        {
            number = number / 10; // 0
            len++;// len = 5
        }

        System.out.print(len);
    }

    public static void w1_2()
    {
        int number = readInt();
        // 0
        // 3 + 4 + 5 = 12
        // 1*  5 * 4 * 3  = 60

        int sum = 0;
        int product = 1;

        while (number > 0)
        {
            int last_digit = number % 10; // 3
            sum = sum + last_digit; // 12
            product = product * last_digit; // 60
            number = number / 10; // 0
        }

        System.out.println(sum);
        System.out.println(product);
    }

    public static void w1_3()
    {
        int number = readInt();
        // 304050

        int sum = 0;
        int product = 1;

        while (number > 0)
        {
            int last_digit = number % 10; // 3
            if (last_digit != 0)
            {
                sum = sum + last_digit; // 12
                product = product * last_digit; // 60
            }
            number = number / 10; // 0
        }

        System.out.println(sum);
        System.out.println(product);
    }

    public  static void w1_4()
    {
        int number = readInt();
        // 123
        //  2312 =
        int odd_quantity = 0; // quantity of odd nubmer

        while (number > 0)
        {
            int last_digit = number % 10; // 3
            if (last_digit % 2 == 1)
            {
                odd_quantity++;
            }
            number = number / 10;
        }
        System.out.print(odd_quantity);
    }


    public static void w1_5()
    {
        int number = readInt();
        // 123456 = 1 * 100000 + 2 * 10000 + 3 * 1000 + 4 * 100 + 5 * 10 + 6
        // 6*10 + 5 = 65
        // 65 * 10 + 4 = 654
        // 654 * 10 +  3
        // 654 -> 6543 ?
        // 12345

        int new_number = 0;
        while (number > 0)
        {
            int last_digit = number % 10; // get the last digit
            System.out.println(last_digit);
            new_number = new_number * 10 + last_digit;
            System.out.println(new_number);
            number = number / 10;
            System.out.println(number);
        }
    }






}
