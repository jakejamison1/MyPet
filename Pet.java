package pet;

import java.util.Scanner;
import java.time.LocalDateTime;

//definition of pet class
public class Pet {
Scanner read = new Scanner(System.in);//Scanner class to read input from reader.
//private attributes
private String petType;
private String petName;
private int petAge;
private int dogSpace;
private int catSpace;
private int daysStay;
private int amountDue;
String CheckIn = "No";
String CheckOut = "No";

public Pet(String petName,String petType,int petAge,int daysStay){//Public constructor
	this.petName = petName;
	this.petType = petType;
    this.petAge = petAge;
    this.daysStay = daysStay;
}
public void checkIn(){
    CheckIn = "Yes";
    LocalDateTime myObj = LocalDateTime.now(); // Create a date
    System.out.println("Check In of the pet is at :"+myObj); //Display time of check in
}

public void getPet(){
    System.out.println("Pet Type : " + petType);
    System.out.println("Pet Name : " + petName);
}
public void setPet() {
    System.out.println("Select 1. Set Pet Type"+"\n"+"2. Set Pet Name "+"\n"+"3. Set Pet Age ");
    int temp = read.nextInt();
    switch (temp) {
        case 1 :
            System.out.println("Enter Pet Type:");
            String temp1 = read.nextLine();
            petType = temp1;
        case 2 :
            System.out.println("Enter Pet Name:");
            String temp2 = read.nextLine();
            petName = temp2;
        case 3 :
            System.out.println("Enter Pet Age:");
            int temp3 = read.nextInt();
            petAge = temp3;
    }
}
public void createPet(){
    System.out.println("Enter Pet Type:");
    String Temp4 = read.nextLine();
    petType = Temp4;
    System.out.println("Enter Pet Name:");
    String Temp5 = read.nextLine();
    petName = Temp5;
    System.out.println("Enter Pet Age:");
    int Temp6 = read.nextInt();
    petAge = Temp6;
}
public void updatePet(){
    System.out.println("Select 1.Update Pet Type" + "\n" + "2.Update Pet Name " + "\n" + "3.Update Pet Age " + "\n" + "4.Update Days Stay");
    int temp = read.nextInt();
    switch (temp) {
        case 1 :
            System.out.println("Enter Pet Type:");
            String TempPet1 = read.nextLine();
            petType = TempPet1;
        case 2 :
            System.out.println("Enter Pet Name:");
            String TempPet2 = read.nextLine();
            petName = TempPet2;
        case 3 :
            System.out.println("Enter Pet Age:");
            int TempPet3 = read.nextInt();
            petAge = TempPet3;
        case 4 :
            System.out.println("Enter Number of Days Staying:");
            int temp4 = read.nextInt();
            daysStay = temp4;
    }
}
}