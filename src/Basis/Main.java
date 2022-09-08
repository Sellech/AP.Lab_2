package Basis;

import Gadgets.Phone;
import java.util.Scanner;

public class Main {
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
    }

    static void task_a(Phone[] arr){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit of city calls:");
        int lim = in.nextInt();

        for(int i=0; i< arr.length; i++){
            if(arr[i].getCityCalls() > lim){
                System.out.println(arr[i]);
            }
        }
    }


}

