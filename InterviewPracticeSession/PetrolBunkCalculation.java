package InterviewPracticeSession;

import java.util.Scanner;

public class PetrolBunkCalculation {
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new PetrolBunkCalculation().print();
	}

	private void print() {
		System.out.println("Enter petrol in car (litre)");
		int petrolInCar=sc.nextInt();
		System.out.println("Enter Number Of Petrol Bunks around the car travel area");
		int petrolBunkCount=sc.nextInt();
		String petrolBunksName[]=new String[petrolBunkCount];
		System.out.println("Enter tha names of petrolBunks,Capacites and distance of petrol bunk");
		int petroBunkCapacities[]=new int[petrolBunkCount];
		int distacne[]=new int[petrolBunkCount];
		for (int index = 0; index <petrolBunkCount; index++) {
			System.out.println("Petrol bunk name :");
			petrolBunksName[index]=sc.next();
			System.out.println("Enter Capacity of petrol bunk");
			petroBunkCapacities[index]=sc.nextInt();
			System.out.println("Enter distance of petrol bunk");
			distacne[index]=sc.nextInt();
			System.out.println("PetrolBunk : "+petrolBunksName[index]+"---> capacity : "+petroBunkCapacities[index]);
			petrolInCar=petrolInCar-distacne[index]+petroBunkCapacities[index];
			System.out.println("Now petrol in car ------>"+petrolInCar+"\n");
		}
		
		
	}

}
