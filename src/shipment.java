import java.util.Scanner;

public class shipment {
    public static void main(String[] args) {

       //  A program to calculate the shipping cost of a package
        Scanner input = new Scanner(System.in);
//  prompt customers input goes here
        System.out.println("Please enter the weight of the package");
        double weight = input.nextDouble();


        if(weight > 20){
            System.out.println("package cannot be shipped");
        }
        else if(weight>0 && weight <=2){
            System.out.println("Your shipping cost is $" + 2.5);
        }
        else if(weight >2 && weight <=4){
            System.out.println("Your shipping cost is $" + 4.5);
        }
        else if(weight >4 && weight <=10){
            System.out.println("Your shipping cost is $" + 7.5);
        }
        else if(weight >10 && weight <=20){
            System.out.println("Your shipping cost is $" + 10.5);
        }


        }


    }

