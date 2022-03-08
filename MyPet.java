package pet;

public class MyPet {
	    public static void main(String [] args){
	        Pet pet1 = new Pet("Dog","Hank",3,3);//creating object to pet class with details
	        Dog dog1 = new Dog("Dog","Skid",4,2,10,6,"Yes");//creating object to Dog class with details Type Name Age Stay SpaceNbr Weight Grooming
	        Cat cat1 = new Cat("Cat","Percy",5,1,11,2,"No");//creating object to Cat class with details Type Name Age Stay SpaceNbr Weight Grooming
	        pet1.getPet();
	        pet1.checkIn();
	    }
	}
