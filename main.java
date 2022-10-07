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
        
        if (action.equals("A")) {
            
            System.out.print("Please enter what type of entity you would like to add: ");
            String entity = input.nextLine();
            entity = entity.toLowerCase();

            ArrayList< Map<String, String>  > members = new ArrayList();
            ArrayList< Map<String, String>  >  equipment = new ArrayList();
            ArrayList< Map<String, String>  > new_drones = new ArrayList();

   
            if (entity.equals("member")) {
                 

                Map<String, String> newMem = new HashMap<String, String>();

                System.out.print("First name: ");
                String fname = input.nextLine();

                newMem.put("fname", fname);

                System.out.print("Last name: ");
                String lname = input.nextLine();

                newMem.put("lname", lname);

                System.out.print("Address: ");
                String address = input.nextLine();

                newMem.put("address", address);

                System.out.print("Phone: ");
                String phone = input.nextLine();

                newMem.put("phone", address);

                System.out.print("Email: ");
                String email = input.nextLine();

                newMem.put("email", address); 

                
                members.add(newMem);


            } else if (entity.equals("equipment")) {

            } else if (entity.equals("new_drone")) {

            } 
            // will add more else-if statements for other entities later

        input.close();
    
    }
