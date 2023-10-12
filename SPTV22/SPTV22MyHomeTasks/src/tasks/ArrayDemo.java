/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArrayDemo {
    private Scanner scanner;
    public ArrayDemo(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runDemo() {
        int[] myArray = new int[20];
        Random random = new Random();
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(19 - 0 + 1) + 0; //реализовать четность чисел
            
        }
        System.out.println("Массив из 20 рандомных чисел");
        for (int i = 0; i < myArray.length; i++){
            System.out.printf("%3d", myArray[i]);
        }
        System.out.println();
        System.out.println("среднее арифметическое элементов без учета максимального и минимального числа");
        //System.out.println(sum);
    }
    
}
