/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhometasks;

import java.util.Scanner;
import tasks.TemperatureConverter;

/**
 *
 * @author admin
 */
public class App {
    private Scanner scanner;
    
    public App(){
        this.scanner = new Scanner(System.in);
    }
    public void run(){
        boolean repeat = true;
        do{
            System.out.println("Выберите задачу:");
            System.out.println("0. Закончить программу:");
            System.out.println("1. Конверетер температуры:");
            int task = scanner.nextInt(); scanner.nextLine();
            switch(task) {
                case 0:
                    System.out.println("выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("выбрана задача 1");
                    NumberParses numberParser = ;
                    temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;
                case 2:
                    System.out.println("выбрана задача 2");
                    TemperatureConverter temperatureConverter;
                    temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;
                default:
                    throw new AssertionError();
        }
    }while(repeat);
    System.out.println("До свидания!");
}
}
