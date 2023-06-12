package javaclass4;
//Your Name: Esha Shivakumar
//Class and Section: CIS 35A 64Z ONLINE
//Assignment Number: 2
//Due Date: 5/14/23
//Date Submitted: 5/14/23

import java.util.Scanner;

public class GenomeInput {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        HumanGenome mickeyMouseGenome = getInputAndCreateGenome(scanner, "Mickey Mouse");
        HumanGenome elsaGenome = getInputAndCreateGenome(scanner, "Princess Elsa");
        HumanGenome jasmineGenome = getInputAndCreateGenome(scanner, "Princess Jasmine");
        scanner.close();

        mickeyMouseGenome.print();
        elsaGenome.print();
        jasmineGenome.print();
    }

    public static HumanGenome getInputAndCreateGenome(Scanner scanner, String name) {
        System.out.printf("");

        System.out.printf("Enter the number of genes in the %s genome: ", name);
        int numberOfGenes = scanner.nextInt();

        System.out.printf("Enter the number of chromosomes in the %s genome: ", name);
        int numberOfChromosomes = scanner.nextInt();

        System.out.printf("Enter the number of cells in the %s body (in trillions): ", name);
        int numberOfCells = scanner.nextInt();

        return new HumanGenome(name, numberOfGenes, numberOfChromosomes, numberOfCells);
    }
}
