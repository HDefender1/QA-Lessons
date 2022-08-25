import java.util.*;

public class Main {
  
  public static void printElements (int number, int rows, int columns) {
        
      for (int i = 0 ; i < rows; i++){ 
        for (int j = 0; j < columns; j ++)
        {
          System.out.print(number + " ");
        }
      System.out.println();
       
      }
  }
    public static void main(String[] args) {
      
      printElements (15,10,10);
  }
}