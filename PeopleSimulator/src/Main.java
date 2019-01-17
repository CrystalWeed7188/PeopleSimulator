import java.util.*;
class Main {
	public static void main(String[] args) {
		Society peopleTown = new Society(10000);


        //i just want this to run somehow

                System.out.println(peopleTown.people.get(100).getName()  + " " + "income = " + peopleTown.people.get(100).getIncome() + " " + "Income Taxed " +  peopleTown.people.get(100).place.govOfPlace.taxAssignment(peopleTown.people.get(100).getIncome()));




    }

}