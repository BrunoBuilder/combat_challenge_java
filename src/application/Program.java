package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		int damage, life, armor, rounds;
		Champion champion1, champion2;
		
		System.out.println("Enter the data of the first champion:");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Starting life: ");
		life = sc.nextInt();
		System.out.print("Attack: ");
		damage = sc.nextInt();
		System.out.print("Armor: ");
		armor = sc.nextInt();
		champion1 = new Champion(name, life, damage, armor);
		System.out.println();
		
		System.out.println("Enter the data of the second champion:");
		System.out.print("Name: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Starting life: ");
		life = sc.nextInt();
		System.out.print("Attack: ");
		damage = sc.nextInt();
		System.out.print("Armor: ");
		armor = sc.nextInt();
		champion2 = new Champion(name, life, damage, armor);
		System.out.println();
		
		System.out.print("How many turns do you want to run? ");
		rounds = sc.nextInt();
		
		for(int i = 0; i < rounds; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			System.out.println();
			System.out.println("Turn "+(i+1)+" Result:");
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			if(champion1.getLife() == 0 || champion2.getLife() == 0) {
				i = rounds;
			}
		}
		
		System.out.println();
		System.out.println("END OF COMBAT");
		
		sc.close();
	}

}
