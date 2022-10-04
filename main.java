import java.util.Scanner;
public class main { 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("A. Add New Records");
        System.out.println("B. Edit/Delete Records");
        System.out.println("C. Search for Records");
        System.out.println("D. Useful Reports");
        System.out.print("Please enter A,B,C, or D to choose an action. Enter a new line to exit: ");
        String action = input.nextLine();

        input.close();
    
    }
