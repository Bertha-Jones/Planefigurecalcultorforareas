import java.util.Scanner;

public class ChinesZodiacSigns {
    // A switch statement to get the animal name of a particular year
    public static void main(String[] args) {

        // the chinese zodiac is based on a 12 year cycle plan.
        Scanner input = new Scanner(System.in);

         // accepting input from users
        System.out.println("please enter your birth year ");
        int year = input.nextInt();

        /* 0: monkey
        1: rooster
        2:dog
        3:pig
        4:rat
        5:ox
        6;tiger
        7:rabbit
        8:dragon
        9:snake
        10:horse
        11;sheep
         */
        switch (year %12){
            case 0:
                System.out.println("your birth year is monkey");break;
            case 1:
                System.out.println("your birth year is  rooster");break;
            case 2:
                System.out.println("your birth year is dog");break;
            case 3:
                System.out.println("your birth year is pig");break;
            case 4:
                System.out.println("your birth year is rat");break;
            case 5:
                System.out.println("your birth year is ox");break;
            case 6:
                System.out.println("your birth year is tiger");break;
            case 7:
                    System.out.println("your birth month is rabbit");break;
            case 8:
                System.out.println("your birth month is dragon");break;
            case 9:
                System.out.println("your birth month is snake");break;
            case 10:
                System.out.println("your birth month is horse");break;
            case 11:
                System.out.println("your birth month is sheep");
        }
    }
}
