import java.util.Scanner;
public class Student_grade_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter English marks :  ");
        int English = input.nextInt();
        System.out.println("Enter Maths marks :  ");
        int Maths = input.nextInt();
        System.out.println("Enter Science marks :  ");
        int Science = input.nextInt();
        System.out.println("Enter Social marks :  ");
        int Social = input.nextInt();
        System.out.println("Enter Computer marks :  ");
        int Computer = input.nextInt();

        int total = English + Maths + Science + Social + Computer;
        float Average_percentage = total * 100 / 500;

        String grade;
        switch ((int) (Average_percentage / 10)) {
            case 9, 10:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 5, 4:
                grade = "pass";
                break;
            default:
                grade = "Fail";
                break;
        }
        System.out.println("\n Your total marks = " + total);
        System.out.println("\n Your Average_percentage is = " + Average_percentage);
        System.out.println("\n grade: " + grade);
    }
   }