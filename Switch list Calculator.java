import java.util.*;

class Dcoder
{  
  public static void main(String args[])
  {  
      //Scanner object for taking the input 
    Scanner sc = new Scanner(System.in);
        
      int i=0;
      while (i == 0){
          
      //Taking input to select a operation for calculation 
      System.out.println("Select a operation\n1.Addition\n2.Substraction\n3.Multiply\n4.Divide");
      int calc = sc.nextInt();
          
      //Switch case to select from number of operations
      switch (calc){
              
          case 1: //Addition
              System.out.println("Enter first number");
              int a = sc.nextInt();
              System.out.println("Enter second number");
              int b = sc.nextInt();
              
              int add = a + b;
              System.out.println("Addition answer :" + add + "\n\n");
              break;
              
          case 2: //Substraction
              System.out.println("Enter first number");
              int c = sc.nextInt();
              System.out.println("Enter second number");
              int d = sc.nextInt();
              
              int sub = c - d;
              System.out.println("Substraction answer :" + sub + "\n\n");
              break;
              
          case 3: //Multiply
              System.out.println("Enter first number");
              int e = sc.nextInt();
              System.out.println("Enter second number");
              int f = sc.nextInt();
              
              int mul = e * f;
              System.out.println("Multiply answer :" + mul + "\n\n");
              break;
              
          case 4: //Divide
              System.out.println("Enter first number");
              int g = sc.nextInt();
              System.out.println("Enter second number");
              int h = sc.nextInt();
              
              int div = g / h;
              System.out.println("Divide answer :" + div + "\n\n");
              break;
              
          default : 
              System.out.println("Invalid number\n\n");
      }
      }
  }
}
