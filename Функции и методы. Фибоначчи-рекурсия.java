import java.util.*;

public class Main {
  
    public static int fibClassic (int n) {
      
      if ((n == 1) || (n == 2)) 
        return 1;
      else {
      
      int f1 = 1;
      int f2 = 1;
      int fk = 0;
      
      for (int i = 3; i <= n; i++)
      {
        fk = f1 + f2;
        f1 = f2;
        f2 = fk;
        
      }
      return fk;
    }
  }
  
    public static void printFibClassic (int n) {
      for (int i =1; i <=n;  i++){
        System.out.print (fibClassic(i) + " "); 
      }
    System.out.println (); 
    }
    
    public static int fibRecursion (int n){
      
      if ((n == 1) || (n == 2))
      return 1;
      else
      return fibRecursion (n-1) + fibRecursion (n-2);
    }
    
    public static void printFibRecursion (int n) {
      for (int i =1; i <=n;  i++){
        System.out.print (fibRecursion(i) + " "); 
      }
    System.out.println (); 
    }
      
    public static void main (String[] args) {
      
    printFibClassic(15);
    printFibRecursion (10);
    
    }
  }