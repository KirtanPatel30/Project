import java.util.Scanner;
public class CSC211Project{
        public static void main(String[] args) {
            System.out.println("Welcome to our Program !");
            System.out.println("1)Time Converter");
            System.out.println("2)Leap Year");
            System.out.println("3)Dice Roll");
            System.out.println("4)Average Calculator");
            Scanner scanner = new Scanner(System.in);
            int option;
            do {

                System.out.print("Please choose a function: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        timeConverter();break;
                    case 2:
                        leapYear();break;
                    case 3:
                        diceRoll();break;
                    case 4:
                        averageCalc();break;
                }
                System.out.println();
                printMenu();
            } while (option != 0);
        }
        public static void timeConverter(){
            System.out.println("----------------------------");
            System.out.println("Welcome to my Time Convertor");
            System.out.println("----------------------------");
            System.out.println();
            System.out.print("Enter time in seconds:");
            Scanner input= new Scanner(System.in);
            int seconds= input.nextInt();
            int numb1 = seconds % 60;
            int numb2 = seconds / 60;
            int numb3 = numb2 % 60;
            numb2 = numb2/60;
            System.out.println("Displaying seconds converted to minutes-> "+numb2+":"+numb3+":"+numb1);
            System.out.println("Thank you!");
        }
        public static void leapYear(){
            System.out.println("----------------------------");
            System.out.println("Welcome to my Leap Year checker");
            System.out.println("----------------------------");
            System.out.println();
            System.out.print("Enter year you want to convert:");
            Scanner scn = new Scanner(System.in);
            int year = scn.nextInt();
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " : Leap Year");}
            else {
                System.out.println(year + " : Not a Leap Year");
            }
        }
        public static void diceRoll(){
            System.out.println("----------------------------");
            System.out.println("Welcome to Dice Roll");
            System.out.println("-----------------------------");
            int min = 1;
            int max = 6;
            int range = max - min + 1;
            int diceRoll = (int) (Math.random() * range) + 1;

            System.out.println("The number you got was : "+diceRoll);
            if(diceRoll==1 || diceRoll==2)
                System.out.println("This number is a Low value");
            if(diceRoll==3 || diceRoll==4)
                System.out.println("This number is a Medium value");
            else if (diceRoll==5 || diceRoll==6) {
                System.out.println("This number is a High value");
            }
        }
        public static void averageCalc(){
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------------");
            System.out.println("Welcome to Average Calculator");
            System.out.println("-----------------------------");
            System.out.println("Please enter 3 whole numbers :");
            //Read user input
            double x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            //creating expression of calculating average using the variables
            double AvgNum = (x + y + z) / 3;
            //Display the average number in a sentence
            System.out.println("You entered " + (int) x + " " + y + " " + z + " and the average of them is " + AvgNum);
        }
        public static void printMenu(){
            System.out.println("Welcome to our Program !");
            System.out.println("1)Time Converter");
            System.out.println("2)Leap Year");
            System.out.println("3)Dice Roll");
            System.out.println("4)Average Calculator");
        }

    }

