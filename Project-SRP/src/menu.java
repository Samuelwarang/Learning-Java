import java.util.*;

public class menu {

    Scanner sc = new Scanner(System.in);

    //To display the options of SRP
    public void menu() {
        System.out.println("Enter a number");
        System.out.println("1. Register Student\n2. Search\n3. Delete\n4. Show");

        int sl = sc.nextInt();
        
        //To select from the given options 
        switch (sl){
            case 1 : Register(); break;
            case 2 : Search(); break;
            case 3 : Delete(); break;
            case 4 : Show(); break;
        }

    }

    //Taking the Registration details 
    public void Register() {

        System.out.println("Enter Student name : ");
        String Sname = sc.next();

        System.out.println("Enter Mobile No. : ");
        String mob = sc.next();

        System.out.println("Enter Address : ");
        String adrs = sc.next();

        System.out.println("Enter Course : ");
        String Course = sc.next();
    }

    //Searching from the stored data 
    public void Search() {
        System.out.print("Search for : ");
        String Search = sc.nextLine();
    }

    //Delete a specific record
    public void Delete() {
        System.out.print("Delete : ");
        String Delete = sc.nextLine();
    }

    //Show all the records 
    public void Show() {
    }

    
    
}