package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        /*

        Scanner scanner = new Scanner(System.in);
        int countryCode = scanner.nextInt();
        switch (countryCode){
            case 1: {
                System.out.println("USA");
            }break;
            case 44: {
                System.out.println("UK");
            }break;
            case 91: {
                System.out.println("India");
            }break;
            default: {
                System.out.println("Not a valid code");
            }
        }


        for (int i = 0, j = 0; i < 2 && j<5 ; i++, j++) {
            System.out.println("Value of i: " + i + "  Value of j: " + j);
            for(int k = 0; k < 2; k++){
                System.out.println("Inner Value of k: " + k);
            }
        }
*/
/*      int count =0;
        while(count<10 ){
            System.out.println("Running count while loop");
            count++;
        }
        boolean runloop = true;
        do{
            System.out.println("do while");
            count++;
        } while (count < 10 && runloop);
    }
 */
    //For Loop: Calculate sum of whole number from 1 to 100//
//        int result= 0;
//        for(int i = 1; i <= 100; i++){
//            result = result+i;
//        }
//      System.out.println("Value of sum : " + result);

        // Do While Loop:
        int result = 0;
        int i = 0;
        do{
            result = result+i;
            System.out.println("result : " + result);
            i++;
        } while(i <= 100);
        System.out.println("Sum : " + result);
    }
}