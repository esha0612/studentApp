package javaclass4;
import java.util.Scanner;
//Your Name: Esha Shivakumar
//Class and Section: CIS 35A 64Z ONLINE
//Assignment Number: 2
//Due Date: 5/14/23
//Date Submitted: 5/14/23

public class GenoNucleicAcid {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        NucleicAcid[] nucleicAcids = new NucleicAcid[5];

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter the properties for Nucleic Acid #" + (i+1));
	            System.out.print("Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Chemical formula: ");
	            String chemicalFormula = scanner.nextLine();

	            System.out.print("Molar mass: ");
	            float molarMass = scanner.nextFloat();
	            scanner.nextLine(); 


	            System.out.print("Density: ");
	            float density = scanner.nextFloat();
	            scanner.nextLine(); 
	         

	            nucleicAcids[i] = new NucleicAcid(name, chemicalFormula, molarMass, density);
	            System.out.println();
	        }

	        for (NucleicAcid nucleicAcid : nucleicAcids) {
	            nucleicAcid.print();
	            System.out.println();
	        }
	    }
	}