package exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] personArray = new Person[3];
        for(int i = 0; i < personArray.length; i++){
            personArray[i] = new Person();

            System.out.println("Enter Id : ");
            personArray[i].id = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Name : ");
            personArray[i].name = scanner.nextLine();

            System.out.println("Enter Family : ");
            personArray[i].family = scanner.nextLine();

            System.out.println("Person Saved");
            System.out.println("-".repeat(50));
        }
        System.out.println("Person List");
        for (Person person : personArray){
            System.out.println(person);
        }
    }

}
