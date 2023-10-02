/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhometasks;

import tasks.CreateBooksArray;
import java.util.Scanner;
import tasks.NumberParser;
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
            System.out.println("3. создание массива книг:");
            int task = scanner.nextInt(); scanner.nextLine();
            switch(task) {
                case 0:
                    System.out.println("выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("выбрана задача 1");
                    TemperatureConverter temperatureConverter;
                    temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;    
                case 2:
                    System.out.println("выбрана задача 2");
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParse();
                    break;
                 case 3:
                    System.out.println("выбрана задача 3");
                    CreateBooksArray createBooksArray;
                    createBooksArray = new CreateBooksArray();
                    createBooksArray.doCreateArray();
                    break;    
                default:
                    throw new AssertionError();
        }
    }while(repeat);
    System.out.println("До свидания!");
}


}    

