import java.util.Scanner;

public class printInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName;
      String lastName;
      String streetAddress;
      String city;
      /* Using a string for zipCode because it should not have 
       * arithmetic operations performed on it*/
      String state;
      String zipCode;
      
      System.out.println("What is the person's first name?");
      firstName = scnr.nextLine();
      System.out.println("What is the person's last name?");
      lastName  = scnr.nextLine();

      System.out.println("What is the person's street address?");
      streetAddress = scnr.nextLine();
      System.out.println("What is the city this person lives in?");
      city  = scnr.nextLine();
      System.out.println("What is the state this person lives in?");
      state  = scnr.nextLine();
      System.out.println("What is the zip code this person lives in?");
      zipCode  = scnr.nextLine();

      System.out.println("Here is their personal information:");
      System.out.println(firstName + " " + lastName);
      System.out.println(streetAddress);
      System.out.println(city + ", " + state + " " + zipCode);
      
   }
}
