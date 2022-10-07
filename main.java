import java.util.Scanner;
import java.util.*; 
public class main { 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("A. Add New Records");
        System.out.println("B. Edit/Delete Records");
        System.out.println("C. Search for Records");
        System.out.println("D. Useful Reports");
        System.out.print("Please enter A,B,C, or D to choose an action. Enter a new line to exit: ");
        String action = input.nextLine();

        ArrayList< Map<String, String> > members = new ArrayList();
        ArrayList< Map<String, String>>  equipment = new ArrayList();
        ArrayList< Map<String, String>> new_drones = new ArrayList();

        while(!action.isBlank()){
        
        if (action.equals("A")) {
            
            System.out.print("Please enter what type of entity you would like to add: ");
            String entity = input.nextLine();
            entity = entity.toLowerCase();
   
            if (entity.equals("member")) {
                 

                Map<String, String> newMem = new HashMap<String, String>();

                System.out.println("First name: ");
                String fname = input.nextLine();

                newMem.put("fname", fname);

                System.out.println("Last name: ");
                String lname = input.nextLine();

                newMem.put("lname", lname);

                System.out.println("Address: ");
                String address = input.nextLine();

                newMem.put("address", address);

                System.out.println("Phone: ");
                String phone = input.nextLine();

                newMem.put("phone", phone);

                System.out.println("Email: ");
                String email = input.nextLine();

                newMem.put("email", email); 

                
                members.add(newMem);


            } else if (entity.equals("equipment")) {
                Map<String, String> newEquip = new HashMap<String, String>();

                System.out.println("Location: ");
                String location = input.nextLine();

                newEquip.put("location", location);

                System.out.println("Inventory ID: ");
                String inventID = input.nextLine();

                newEquip.put("inventory_id", inventID);

                System.out.println("Arrival Date: ");
                String arrivalDate = input.nextLine();

                newEquip.put("arrival_date", arrivalDate);

                System.out.println("Weight: ");
                String weight = input.nextLine();

                newEquip.put("weight", weight);

                System.out.println("Size: ");
                String size = input.nextLine();

                newEquip.put("size", size); 

                System.out.println("Equip Fee: ");
                String equipFee = input.nextLine();

                newEquip.put("equip_fee", equipFee); 

                

                
                equipment.add(newEquip);




            } else if (entity.equals("new_drone")) {
                Map<String, String> newDrone = new HashMap<String, String>();

                System.out.println("Fleet ID: ");
                String fleetID = input.nextLine();

                newDrone.put("fleet_id", fleetID);

                System.out.println("Capacity: ");
                String capacity = input.nextLine();

                newDrone.put("capacity", capacity);

                System.out.println("Time autonomy: ");
                String timeAutonomy = input.nextLine();

                newDrone.put("time_autonomy", timeAutonomy);

                System.out.println("Max Speed: ");
                String maxSpeed = input.nextLine();

                newDrone.put("max_speed", maxSpeed);

                
                new_drones.add(newDrone);


            }
        } 
            // will add more else-if statements for other entities later

        
    
    else if (action.equals("B")){
        //edit, delete records 
        System.out.println("What type of Record do you want to edit or delete? [Member, Equipment, New_Drone]"); 
        String answer = input.nextLine(); 

        //get primary key of each type of entity 
        if(answer.equals("member")){
            System.out.println("What is the Phone Number of the Member?"); 
            String phoneNum = input.nextLine(); 
            int recordIndex = 0;

            //search through array list 
            for(int i =0; i < members.size(); i++){
                //go through each element, search through keys 
                Map<String, String> record = members.get(i);
                for(String value : record.values()){
                    if(value.equals(phoneNum)){
                        recordIndex = i; 
                    }


                }

            }

            System.out.println("Do you want to edit or delete?");
            String choice = input.nextLine(); 

            if(choice.equals("edit")){
                System.out.println("What attribute do you want to edit?");
                String attValue = input.nextLine(); 
                System.out.println("What value do you want to change it to?");
                String newVal = input.nextLine(); 

                //update the record index map
                Map<String,String> mem = members.get(recordIndex); 
                mem.put(attValue,newVal);
                members.remove(recordIndex); 
                members.add(mem); 

            } else{
                
                //delete the record index map
                members.remove(recordIndex);
                

            }

        } else if (answer.equals("equipment")){
            //get primary key of each type of entity 
            System.out.println("What is the Inventory ID of the Equipment?"); 
            String inventID = input.nextLine(); 
            int recordIndex = 0;

            //search through array list 
            for(int i =0; i < equipment.size(); i++){
                //go through each element, search through keys 
                Map<String, String> record = equipment.get(i);
                for(String value : record.values()){
                    if(value.equals(inventID)){
                        recordIndex = i; 
                    }


                }

            }

            System.out.println("Do you want to edit or delete?");
            String choice = input.nextLine(); 

            if(choice.equals("edit")){
                System.out.println("What attribute do you want to edit?");
                String attValue = input.nextLine(); 
                System.out.println("What value do you want to change it to?");
                String newVal = input.nextLine(); 

                //update the record index map
                Map<String,String> mem = equipment.get(recordIndex); 
                //remove record, and then update it 
                mem.put(attValue,newVal);
                equipment.remove(recordIndex); 
                equipment.add(mem); 



            } else{
                
                //delete the record index map
                equipment.remove(recordIndex);
                

            }

        } else if(answer.equals("new_drone")){
                System.out.println("What is the Fleet ID of the Drone?"); 
                String fleetID = input.nextLine(); 
                int recordIndex = 0;
    
                //search through array list 
                for(int i =0; i < new_drones.size(); i++){
                    //go through each element, search through keys 
                    Map<String, String> record = new_drones.get(i);
                    for(String value : record.values()){
                        if(value.equals(fleetID)){
                            recordIndex = i; 
                        }
    
    
                    }
    
                }
    
                System.out.println("Do you want to edit or delete?");
                String choice = input.nextLine(); 
    
                if(choice.equals("edit")){
                    System.out.println("What attribute do you want to edit?");
                    String attValue = input.nextLine(); 
                    System.out.println("What value do you want to change it to?");
                    String newVal = input.nextLine(); 
    
                    //update the record index map
                    Map<String,String> mem = new_drones.get(recordIndex); 
                    //remove record, and then update it 
                    mem.put(attValue,newVal);
                    new_drones.remove(recordIndex); 
                    new_drones.add(mem); 



        }




    }
} else if (action.equals("C")){
    //search for an object 
    System.out.println("What type of Record do you want to search for? [Member, Equipment, New_Drone]"); 
    String answer = input.nextLine(); 

    if(answer.equals("member")){
        System.out.println("What is the Phone Number of the Member?"); 
        String phoneNum = input.nextLine();
        int recordIndex = 0;

            //search through array list 
            for(int i =0; i < members.size(); i++){
                //go through each element, search through keys 
                Map<String, String> record = members.get(i);
                for(String value : record.values()){
                    if(value.equals(phoneNum)){
                        recordIndex = i; 
                    }


                }

            }

            System.out.println("Here is the Record: "); 
            System.out.println(members.get(recordIndex));  


    } else if (answer.equals("equipment")){
         //get primary key of each type of entity 
         System.out.println("What is the Inventory ID of the Equipment?"); 
         String inventID = input.nextLine(); 
         int recordIndex = 0;

         //search through array list 
         for(int i =0; i < equipment.size(); i++){
             //go through each element, search through keys 
             Map<String, String> record = equipment.get(i);
             for(String value : record.values()){
                 if(value.equals(inventID)){
                     recordIndex = i; 
                 }


             }

         }

         System.out.println("Here is the Record: "); 
        System.out.println(equipment.get(recordIndex));



    } else{
        System.out.println("What is the Fleet ID of the Drone?"); 
                String fleetID = input.nextLine(); 
                int recordIndex = 0;
    
                //search through array list 
                for(int i =0; i < new_drones.size(); i++){
                    //go through each element, search through keys 
                    Map<String, String> record = new_drones.get(i);
                    for(String value : record.values()){
                        if(value.equals(fleetID)){
                            recordIndex = i; 
                        }
    
    
                    }
    
                }

                System.out.println("Here is the Record: "); 
                System.out.println(new_drones.get(recordIndex));


    

    }


       

}
System.out.print("Please enter A,B,C, or D to choose an action. Enter a new line to exit: ");
action = input.nextLine();


}
}
}
