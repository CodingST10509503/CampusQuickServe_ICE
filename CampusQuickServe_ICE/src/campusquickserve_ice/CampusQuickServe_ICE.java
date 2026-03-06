package campusquickserve_ice;
//JOptionnPane was imported to show dialog boxes
import javax.swing.JOptionPane;
//order class is created to show the methods related to the order
class Order {

    //this method returns the final message shown to the customer
    public static String createMessage(String customerName, String studentNumber, String item, int quantity,
double sum, int discount, double vat, double total) {
        // thank you message for the end of the slip
        String Thanks = "Thank you for your order!";
//This is the slip that contains all the details of the buyer 
return "CampusQuickServe\n" +
// This is used to show the customers name 
"Customer: " + customerName + "\n" +
//shows the student number on the slip
"Student Number: " + studentNumber + "\n" +
// Shows what item was ordered 
"Item Ordered: " + item + "\n" +
// The quantity of the item that was ordered
"Quantity: " + quantity + "\n" +
//Item total in Rand 
"Items total: R" + sum + "\n" +
// How much discount was applied 
"Discount: R" + discount + "\n" +
//The Value added tax that was used
"VAT: " + vat + "%\n" +
//The final total calculated
"Total: R" + total + "\n" +
Thanks;
    }
//this method was used to get the final result of the price aka the total
public static double calculateTotal(double pricePerItem, int quantity, double vat, int discount) {
//this calculates the two numbers to get the subtotal and multiplies it 
double subtotal = pricePerItem * quantity;
//Calculates the total
double total = subtotal + vat - discount;
//returns the total
return total;
    }
}
//Program runs in this main class
public class CampusQuickServe_ICE {

public static void main(String[] args) {
//all the customers info
 String customerName = "Sarah Moyo";
 String studentNumber = "ST23014567";
 String item = " Burger";
 int Quantity = 2;
 double num1 = 45.50;
 double num2 = 45.50;
 double sum1 = (num1 + num2);
 double num3 = 13.65;
 double sum2 = (num1 + num2 + num3);
 int Discount = 0;
 final double VAT = 15;
//Call method to calculate final total
double total = Order.calculateTotal(num1, Quantity, num3, Discount);
//Call method to create the final receipt message 
  String message = Order.createMessage(customerName, studentNumber, item, Quantity, sum1, Discount, VAT, total);
  //Displays the message in a dialog box 
  JOptionPane.showMessageDialog(null, message);
    }
}
