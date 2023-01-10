package Lecture04.Lecture06;

import java.util.Scanner;

public class PlanVacantion {
    public static void main(String[] args) {
        double budget;
        double dailyBudget;
        String vacantionTipe;
        int days;
        int people;
        String msgBgDestination =  "Available destination: Bulgaria";
        String msgOutBgDestination = "Available destination: Outside Bulgaria";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter vacation type");

        vacantionTipe = scanner.nextLine();
        System.out.println("Pls enter number of days");
        days = scanner.nextInt();
        System.out.println("Pls enter number of people");
         people = scanner.nextInt();
        System.out.println("Pls enter your budget");
                budget= scanner.nextDouble();
        dailyBudget = budget / (days * people);
        switch (vacantionTipe){
            case "Beach":
                if(dailyBudget<50) {
                    System.out.println(msgBgDestination);
                } else{
                        System.out.println(msgOutBgDestination);
                    }

                break;
        case "Mountain":
            if(dailyBudget<30) {
                System.out.println(msgBgDestination);
            } else{
                System.out.println(msgOutBgDestination);
            }
break;
            default:System.out.println("There is no information about this type of vacation!");

        }




    }
}
