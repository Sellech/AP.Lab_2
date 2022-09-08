package Basis;

import Gadgets.Phone;
import java.util.Scanner;

/**
 * The Main class is used for executing the 2st laboratory work on AP
 * @author Yaroslav Chepiuk, CS-207
 * @version 1.0 2022-09-08
 */
public class Main {

    /**
     * This is the main() method, which is the entry point for executing a Java program
     * @param args contains the supplied command-line arguments
     */
    public static void main(String[] args){
        Phone[] arr = new Phone[7];
        arr[0] = new Phone(401, "Чепюк", "Ярослав","Андрійович", 345, 40, 70);
        arr[1] = new Phone(402, "Деряжний", "Гліб","Вікторович", 768, 96, 0);
        arr[2] = new Phone(403, "Вівсяний", "Юрій","Сергійович", 749, 33, 29);
        arr[3] = new Phone(404, "Дір", "Олекса","Олександрович", 6944, 125, 0);
        arr[4] = new Phone(405, "Артрук", "Наталія","Ігорівна", 123, 73, 0);
        arr[5] = new Phone(406, "Безручко", "Христина","Юріївна", 25, 19, 14);
        arr[6] = new Phone(407, "Ус", "Ліна","Андріївна", 5401, 58, 0);

        task_a(arr);
        task_b(arr);
        task_c(arr);
    }

    /**
     * The printLine method is used to print a decorative line to separate the text
     */
    static void printLine(){
        for(int i=0;i<50;i++){
            System.out.print("-");
        }
        System.out.print("\n");
    }

    static void task_a(Phone[] arr){
        Scanner in = new Scanner(System.in);
        printLine();
        printLine();
        System.out.print("Task A\nEnter the limit of city calls: ");
        int lim = in.nextInt();

        printLine();
        for(int i=0; i< arr.length; i++){
            if(arr[i].getCityCalls() > lim){
                System.out.println(arr[i]);
            }
        }
        printLine();
    }

    static void task_b(Phone[] arr){
        printLine();
        System.out.println("Task B\nInformation about subscribers who used intercity call:");
        printLine();
        for(int i=0; i<arr.length; i++){
            if(arr[i].getIntercityCalls() != 0){
                System.out.println(arr[i]);
            }
        }
        printLine();
    }

    static void task_c(Phone[] arr){
        Scanner in = new Scanner(System.in);
        printLine();
        System.out.println("Task C\nEnter a range of account values:");
        System.out.print("min = ");
        int min = in.nextInt();
        System.out.print("max = ");
        int max = in.nextInt();
        printLine();

        for(int i=0;i< arr.length;i++){
            if((arr[i].getAccNum()>min)&&(arr[i].getAccNum()<max)){
                System.out.println(arr[i]);
            }
        }
    }
}