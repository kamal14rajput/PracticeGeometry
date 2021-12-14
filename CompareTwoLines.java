import java.util.Scanner;

public class CompareTwoLines {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("comparing equality of two line:-");
        System.out.println("enter the value of first line:");
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();
        double length =	Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("length of line: "+length);

        System.out.println("enter the value of second line:");
        int x3= sc.nextInt();
        int y3= sc.nextInt();
        int x4= sc.nextInt();
        int y4= sc.nextInt();
        double  length1 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("length of line: "+length1);
        if (Double.compare(length, length1) == 0) {

            System.out.println("Both the lines are equal in length");
        }
        else if (Double.compare(length, length1) < 0) {

            System.out.println("the second line greater then first line");
        }
        else {

            System.out.println("the first line is greater then second line");
        }
    }
}
