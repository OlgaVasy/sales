// Ex.5.17: CalculatingSales class
// Calculates and displays the total retail value for all products sold
import java.util.Scanner;

public class CalculatingSales {

   public static void main(String[] args){

      double price, total=0;
      int quantity;

      Scanner input = new Scanner(System.in);

      System.out.println("Please enter the product number (in dollars) or 0 to quit: ");

      int product = input.nextInt();

      while (product != 0) {

         switch (product) {

            case 1:
               price = 2.98;
               System.out.println("Please enter the quantity sold: ");
               quantity = input.nextInt();
               while (quantity < 0){
                  System.out.println("Quantity cannot be negative. Please enter the valid number: ");
                  quantity = input.nextInt();
               }
               total = total + quantity * price;
               break;

            case 2:
               price = 4.50;
               System.out.println("Please enter the quantity sold: ");
               quantity = input.nextInt();
               while (quantity < 0){
                  System.out.println("Quantity cannot be negative. Please enter the valid number: ");
                  quantity = input.nextInt();
               }
               total = total + quantity * price;
               break;

            case 3:
               price = 9.98;
               System.out.println("Please enter the quantity sold: ");
               quantity = input.nextInt();
               while (quantity < 0){
                  System.out.println("Quantity cannot be negative. Please enter the valid number: ");
                  quantity = input.nextInt();
               }
               total = total + quantity * price;
               break;

            case 4:
               price = 4.49;
               System.out.println("Please enter the quantity sold: ");
               quantity = input.nextInt();
               while (quantity < 0){
                  System.out.println("Quantity cannot be negative. Please enter the valid number: ");
                  quantity = input.nextInt();
               }
               total = total + quantity * price;
               break;

            case 5:
               price = 6.87;
               System.out.println("Please enter the quantity sold: ");
               quantity = input.nextInt();
               while (quantity < 0){
                  System.out.println("Quantity cannot be negative. Please enter the valid number: ");
                  quantity = input.nextInt();
               }
               total = total + quantity * price;
               break;

            default:
               System.out.println("Product number must be from 1 to 5");
               break;
         }
         System.out.println("Please enter the product number or 0 to quit: ");
         product = input.nextInt();
      }
         System.out.println("The total retail value of all products sold is: $"+total);
   }
   }
