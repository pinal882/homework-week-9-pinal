package homeworkweek9;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between, 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between, 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

public class Program_2_StudentMarkSheet {
   static int rollNum, mathMark, scienceMark, englishMark;
   static  int totalMark;
   static double percentage;
   static String name;
   static String grade;
   static String result;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        name = scanner.next();
        System.out.println("Enter Student Roll Number: ");
        rollNum = scanner.nextInt();
        System.out.println("Enter Math Marks: ");
        mathMark = scanner.nextInt();
        while (mathMark < 0 || mathMark > 100) {
            System.out.println("Invalid Math Marks, marks between 0 to 100");
            System.out.println("Please enter correct MathMarks");
            mathMark = scanner.nextInt();
        }
        System.out.println("Enter Science  Marks: ");
        scienceMark = scanner.nextInt();
        while (scienceMark < 0 || scienceMark > 100) {
            System.out.println("Invalid Science Marks,Marks between 0 to 100");
            System.out.println("Please enter correct science marks");
            scienceMark = scanner.nextInt();
        }
        System.out.println("Enter English Marks: ");
        englishMark = scanner.nextInt();
        while (englishMark < 0 || englishMark > 100) {
            System.out.println("Invalid English Marks,Marks between 0 to 100");
            System.out.println("Please enter correct english marks");
            englishMark = scanner.nextInt();
        }
        //if else statements ensuring all the inserted marks are
        // not out of permitted value,if the values within permitted range it will
        //print result and if values are outside permitted range it will print error message
        if (mathMark >= 0 && mathMark <= 100 && scienceMark >= 0 && scienceMark <= 100
                && englishMark >= 0 && englishMark <= 100) {
            result1();
            print();

        } else {
            System.out.println("The Marks value should be between 0 to 100");
        }
        scanner.close();
    }
    //static method calculating total,percentage & allocating Pass,Fail and Grade
    //using conditions
    public static void result1(){
        totalMark = mathMark+englishMark+scienceMark;
        percentage = totalMark /3 ;
        System.out.println("Percentage" + percentage);
        if ((mathMark<35) || scienceMark < 35 || englishMark <35 ){
            percentage = 0.0;
            result = "Fail";
            grade = "N/A";
        } else if ((percentage>= 35) && percentage < 50) {
            result = "Pass";
            grade = "C";
        } else if ((percentage >= 50) && percentage <60) {
            result = "Pass";
            grade = "B";
        } else if ((percentage >= 60) && percentage <80){
            result ="Pass";
            grade = "A++";
    }else {
            System.out.println(" ");
        }

    }
public static void  print (){
    System.out.println("-----------------------------");
    System.out.println("|                           |");
    System.out.println("| Mark Sheet                |");
    System.out.println("|___________________________|");
    System.out.println("| Name      :" + name + "                  |");
    System.out.println("| Roll No   :" + rollNum + "                |");
    System.out.println("|___________________________|");
    System.out.println("| Subjects  : Marks           |");
    System.out.println("|___________________________|");
    System.out.println("| Math      :  " + mathMark + "                   |");
    System.out.println("| Science   :  "+ scienceMark + "                |");
    System.out.println("| English   :  "+ englishMark + "                |");
    System.out.println("|___________________________|");
    System.out.println("| Total     :  "+ totalMark + "             |");
    System.out.println("|___________________________|");
    System.out.println("| Percentage: "+ percentage + "           |");
    System.out.println("| Result    :    " + result + "               |");
    System.out.println("| Grade     :     " + grade + "                  |");
    System.out.println("|___________________________|");
}

    }



