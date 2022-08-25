import java.util.*;

public class Main {
  
  public static void printElement(int numberOne, int numberTwo) {
    
    System.out.printf("%d + %d = %d\t", numberOne, numberTwo, numberOne + numberTwo);
  }
  
  
  public static void printLine(int n) {
    for (int i = 0; i <= 9; i++){
      printElement (n, i);
  }
  System.out.println(" ");
  }
  
  public static void printTable () {
    for (int i = 0; i <= 9; i++) {
      printLine (i);
    }
  }
  
  
    public static void main(String[] args) {
      
    printTable();
  }
}