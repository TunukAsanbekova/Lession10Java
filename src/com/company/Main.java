package com.company;

import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
     /*   Random random = new Random();

       int[] array = new int[10];
        int sum = 0;
       for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(50);
           if (array[i] % 2 == 0) {
               System.out.print(array[i] + "  ");
               sum += array[i];

           }


       }
        System.out.print("\n" + "sum  " + sum); */
        summa(30,20,50);

        }
        static void summa(int...values) {
        int count = 0;

            for (int i = 0; i < values.length; i++) {
                count += values[i];

            }
            int count1 = 0;
            for (int sum : values) {
                count1+=sum;
                System.out.println(sum);
            }

            System.out.println(count);

    }
    }

