
class Main {
	// I'll be using this main method for testing
	public static void main(String[] args) {
        Government Trump = new Government(.005);
		Society peopleTown = new Society(10000);

        //gets the name of the person in the people arrayList at position 7000
        System.out.println("hello " + peopleTown.people.get(7000).getAge());

        //i just want this to run somehow
        	for(int i = 0; i < peopleTown.population; i++){
                Trump.taxAssignment(peopleTown.people.get(i).getIncome());
                System.out.println(i + " " + peopleTown.people.get(i).getName() + " age = "+ peopleTown.people.get(i).getAge() + " " + "income = " + peopleTown.people.get(i).getIncome() + " " + "Income Untaxed "+ peopleTown.people.get(i).getIncomeUntaxed());
	                }

    }

}
