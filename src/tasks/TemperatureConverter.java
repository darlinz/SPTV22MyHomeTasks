/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TemperatureConverter {
    private Scanner scanner;
    
public TemperatureConverter(Scanner scanner) {
    this.scanner = scanner;
}
    
    public void doConvert(){
        boolean repeat = true;
        do{
            System.out.println("выберите направление конвертации");
            System.out.println("0. Закончить задачу");
            System.out.println("1. Конвертировать из Цельсия в Фаренгейт");
            System.out.println("2. Парсер числа");
            System.out.print("задача номер:");
            int task = scanner.nextInt(); scanner.nextLine();
            switch(task) {
                case 0:
                    System.out.println("выбран выход из конвертора");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("конверт из Цельсия в фаренгейт");
                    celsiusToFahrenheit();
                    break;
                case 2:
                    System.out.println("конверт из фаренгейтa в Цельсия");
                    fahrenheitToCelsius();
                default:
                    System.out.println("выберите числа из списка");
            
            }
            
        }
        while(repeat);
        }

    private void celsiusToFahrenheit() {
        System.out.println("введите температуру (Celsius):");
        double tCelsius = scanner.nextDouble(); scanner.nextLine();
        double tFarhenheit = 0;
        System.out.println("результат (Farhenheit): %.1f%n", tFarhenheit);
    }

    private void fahrenheitToCelsius() {
        System.out.println("Введите температуру (Fahrenheit):");
        double tFahrenheit = scanner.nextDouble(); 
        double tCelsius = 0;
        
    }
    
}
