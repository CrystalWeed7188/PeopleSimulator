import java.util.*;
class Main {
	public static void main(String[] args) {
        Government Trump = new Government(.005);
		Society peopleTown = new Society(10000);

        //gets the name of the person in the people arrayList at position 7000
        System.out.println("hello " + peopleTown.people.get(7000).getAge());

        //i just want this to run somehow
        	for(int i = 0; i < peopleTown.totalPopulation; i++){
                Trump.taxAssignment(peopleTown.people.get(i).getIncome());
                System.out.println(i + " " + peopleTown.people.get(i).getName()  + " " + "income = " + peopleTown.people.get(i).getIncome() + " " + "Income Taxed " +);
	        }


        //places Demo code PLEASE REMOVE!!
        //remember that there are only 5 towns to start with
        //gets place of each person
    //     for(int o = 0; o < peopleTown.places.size(); o++){
    //         //this prints every place name
    //         System.out.println(peopleTown.places.get(o).getPlace());
    //     }
    //     peopleTown.people.get(1).changePlaceTo("brandontown");
    //     System.out.println(peopleTown.people.get(1).getPlace());
    //     peopleTown.populationOf(peopleTown,"brandontown");
    //     peopleTown.populationOf(peopleTown,peopleTown.places.get(0).getPlace());
    //     peopleTown.populationOf(peopleTown,peopleTown.places.get(1).getPlace());
    //     peopleTown.populationOf(peopleTown,peopleTown.places.get(2).getPlace());
    //     peopleTown.populationOf(peopleTown,peopleTown.places.get(3).getPlace());
    //     peopleTown.populationOf(peopleTown,peopleTown.places.get(4).getPlace());

    // }

    // This is the Places Code- Need help? Ask Brandon, Ian, or read the documentation provided.
}