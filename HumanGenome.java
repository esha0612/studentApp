package javaclass4;
//Your Name: Esha Shivakumar
//Class and Section: CIS 35A 64Z ONLINE
//Assignment Number: 2
//Due Date: 5/14/23
//Date Submitted: 5/14/23

public class HumanGenome {
	private String name;
	private int genes;
	private int chromosomes;
	private int cells;
	//default constructor
	public HumanGenome(String name, int genes, int chromosomes, int cells) {
		this.name = name;
		this.genes = genes;
		this.chromosomes=chromosomes;
		this.cells = cells;
	}
	//getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGenes(){
        return genes;
    }

    public void setGenes(int genes){
        this.genes = genes;
    }

    public int getChromosomes(){
        return chromosomes;
    }

    public void setChromosomes(int chromosomes){
        this.chromosomes = chromosomes;
    }

    public int getCells(){
        return cells;
    }

    public void setCells(int cells){
        this.cells = cells;
    }
    public void print(){
    	 System.out.println("");
    	 System.out.printf("Genome Name: %s\nNumber of Genes: %d\nNumber of Chromosomes: %d\nNumber of Cells: %d\n", name, genes, chromosomes, cells);
    	 System.out.println("");
    }
}
