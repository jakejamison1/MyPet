package pet;

import java.util.Scanner;

class Dog extends Pet {
    public int dogSpaceNbr;
    public int dogWeight;
    public String dogGrooming;
    public Dog(String petType,String petName,int petAge,int daysStay,int dogSpaceNbr,int dogWeight,String dogGrooming){
        super(petType,petName,petAge,daysStay);
        this.dogSpaceNbr = dogSpaceNbr;
        this.dogWeight = dogWeight;
        this.dogGrooming = dogGrooming;
    }
    Scanner read = new Scanner(System.in);
    public void getGrooming() {
        System.out.println("Dog Grooming : "+dogGrooming);
    }
    public void setGrooming() {
        String temp = read.nextLine();
        dogGrooming = temp;
        System.out.println("Dog Grooming : "+dogGrooming);
    }
    public void getDogWeight() {
        System.out.println("Dog Weight : "+dogWeight);
    }
    public void setDogWeight() {
        int temp = read.nextInt();
        dogWeight = temp;
        System.out.println("Dog Weight : "+dogWeight);
    }
    public void setdogSpaceNbr() {
        int temp = read.nextInt();
        dogSpaceNbr = temp;
        System.out.println("Dog SpaceNbr : "+dogSpaceNbr);
    }
    public void getdogSpaceNbr() {
        System.out.println("Dog SpaceNbr : "+dogSpaceNbr);
    }
    public void setPet() {
        super.setPet();
    }
    public void updatePet() {
        super.updatePet();
    }
    public void getPet() {
        super.getPet();
    }
}