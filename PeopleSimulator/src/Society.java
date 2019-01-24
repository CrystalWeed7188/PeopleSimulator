import java.util.*;


class Society{
	// this declares a new instance variable... an ArrayList for people
	List<Person> people = new ArrayList<Person>();
    List<Place> places = new ArrayList<Place>();

	public int totalPopulation;
    public Time time = new Time(1, 1, 0, 0);
    public int population;


	// these names came from https://nameberry.com/unisex-names
	private String[] firstNames = {"Avery","Riley","Jordan","Angel","Parker","Sawyer","Peyton","Quinn","Blake","Hayden","Taylor","Dakota","Reese","Zion","Remmington","Amari","Phoenix","Kendall","Harley","Rylan","Marley","Dallas"};
	private String[] lastNames = {"Hill","Carson","Ware","McMahon","Murray","Smith","Jones","Robinson","Morris","Brown","Meyers","Reed","Schmidt","Estrada","Huang","Patel","Gupta","Gomez","Ramirez","Thomas","Jordan","Samson","Samuels","Evans","Butts","Wright","Black","White"};

    // this is the places array: its contains all the places, in which people can live.
    private String[] placeNames = {"burg", "ton", "burgh", "town", " City", "ville", " Center"," Lake", "wood","ford","land","house","hill","bridge"," Creek", "boro"};
    //private String[] govNames ={"Dictatorship", "Absolute Monarchy", "Constitutional Monarchy", "Communism", "Representative Democracy", "Direct Democracy"};



public int societalHappiness(){
    int totalHappiness = 0;
    int averageHappiness = 0;
    for(int i = 0; i < population; i++){
        totalHappiness += people.get(i).getHappiness();
        averageHappiness = (int) Math.floor(totalHappiness / population);
    }
    return averageHappiness;
}


 Society(int numPeople) {
  population = numPeople;
  String fullName;
  String gender;
  for(int i = 0; i < 5; i++){
            places.add(new Place(lastNames[(int)(Math.random()*lastNames.length)]+placeNames[(int)(Math.random()*placeNames.length)]));
        }
  for (int i = 0; i < numPeople; i++) {
   fullName = firstNames[(int)(Math.random() * firstNames.length)] + " " + lastNames[(int)(Math.random() * lastNames.length)];
   int randomIndex = (int)(Math.random() * 2);
   if (randomIndex >= 1) {
    gender = "female";
   } else {
    gender = "male";
   }

   people.add(new Person((int)(Math.random()*100),fullName,gender,time.getDayCount(), places.get((int) (Math.random()*places.size())),(int) bellCurve(53719,30000)));
  }
 }

 public void cycleDay() {
    time.incrementTime();
    findTheLove(people.get((int)(Math.random() * population)), people.get((int)(Math.random() * population)));
 }


 public void addPerson(Person p1, Person p2) {
  String lastName;
  String gender;
  if ((p1.getGender() == "female" && p2.getGender() == "male") || (p1.getGender() == "male" && p2.getGender() == "female")) {
   if (p1.getGender().equals("male")) {
    String name = p1.getName();
    int space = name.indexOf(" ") + 1;
    lastName = name.substring(space, name.length());
   } else {
    String name = p2.getName();
    int space = name.indexOf(" ") + 1;
    lastName = name.substring(space, name.length());
   }
   int randomIndex = (int)(Math.random() * 2);
   if (randomIndex >= 1) {
    gender = "female";
   } else {
    gender = "male";
   }
   String fullName = firstNames[(int)(Math.random() * firstNames.length)] + " " + lastName;
   population++;
   people.add(new Person(0, fullName, gender, time.getDayCount(),p1.getPlace(),(int) bellCurve(53719,30000)));



  }
 }

 //for generating a bell curve for various aspects of the people in the society such as IQ
 public static long bellCurve(int mean, int sd) {
  int i = mean - (3 * sd);
  int j = mean + (3 * sd);
  int x = i;
  for (int c = i; c < j; c++) {
   double l = Math.random();
   if (l >= 0.5) {
    x++;
   }
  }
  return x;
 }

 //takes parameters of two people
 public void findTheLove(Person a, Person b) {
  double loveA = 0;
  double loveB = 0;
  double compatibility = 0;
   if (a.getAge() > 18 && b.getAge() > 18) {               //makes sure they're at least 18 ;)
    for (int i = 0; i < a.getHaves().size(); i++) {
     if (a.getWants().get(i) == b.getHaves().get(i)) {      //compares their haves and wants they were born with to find love
      loveA++;
     }
     if (b.getWants().get(i) == a.getHaves().get(i)) {
      loveB++;
     }
    }
    if (loveB == 0 || loveA == 0) {                   //can't divide by 0!
     compatibility = 0;
    } else if (loveA == 0 || loveB == 0) {            //averages their connections to come up with a random percent which I called compatibility
     compatibility = 0;
    } else {
     compatibility = (loveA + loveB) / 2;
    }
    if (compatibility >= 2) {
     a.gotMarriedTo(b);
     b.gotMarriedTo(a);
    }
   }
  }


}
