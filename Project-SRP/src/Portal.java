import java.util.*; 
//Using scanner extended from menu.java

public class Portal extends menu{
/*Extended to menu to fetch the registration options*/

    //SRP user login function 
    public void login() {

        //Asking Login Details 
        System.out.println("Enter Login Id : \n");
        String id = sc.next(); 
        System.out.println("Enter Password : \n");
        int pw = sc.nextInt();
        
        //to check whether the login details are correct
        if(id.equals("Sam") && pw==0){
            System.out.println("LOGIN SUCCESSFUL");
            menu();
        }else{
            System.out.println("Invalid login ID or Password");
        }

    }

}
