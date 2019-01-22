import java.util.ArrayList;

class Person {
	public int age;
	private String name;

    public Place place;
    public int thisPopulation;
    private boolean depressed;
    private boolean optimistic;
    private int happiness;
    private int birthday;
    private String gender;
    public Person spouse;
    private ArrayList <Integer> haves = new ArrayList <Integer>();
    private ArrayList <Integer> wants = new ArrayList <Integer>();
    private boolean married = false;
    public int IQ = bellCurve(100,15);
    public int income = bellCurve(53719,30000);
    //private double income;
    public int points = 0;
    public int mill = bellCurve(50,25);



	public Person(int age, String name,String gender,int birthdate,Place place,int income) {
		 this.name = name;
		 this.age = age;
         this.place = place;
         this.income = income;
         this.depressed = Math.random() < 0.15;
         this.optimistic = Math.random() < 0.15;
         this.happiness = 60;  //start at 60 bc 50 felt too sad for a normal person
         this.birthday = birthdate;
         this.gender = gender;

         this.spouse = null;
         for(int i = 0; i < 10; i++){
            haves.add((int)(Math.random()*10));
            wants.add((int)(Math.random()*10));
         }
	}



	public Person() {
		this.name = "Brad";
		this.age = 37;
	}

	public boolean olderThan(int otherAge) {
		if (age > otherAge) {
			return true;
		} else {
			return false;
		}

	}



	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	public void hadBirthday() {
		age++;
	}
    public boolean getDepressed(){
        if(age < 11){
            depressed = false;
        }
        return depressed;
    }
    public boolean getOptimistic(){
        if(depressed == true){
            optimistic = false;
        }
        return optimistic;
    }
    public int getHappiness(){
        //change these to while loops later when we merge if you can
        return happiness;
    }
    public int setHappiness(){
        if(depressed == true && age > 11){
            happiness = (int) Math.floor(Math.random() * 30) + 6;
            if(happiness < 10){
                happiness += (int) Math.floor(Math.random() * 8);
            }
        }
        if(optimistic == true) {
            happiness += (int) Math.floor(Math.random() * 10) + 5;
        }
        if(income < 53500 && age > 20){
            happiness -= (int) Math.floor(Math.random() * 10);
        }
        if(income > 58000 && age > 20){
            happiness += (int) Math.floor(Math.random() * 15);
        }
        if(married == true){
            happiness += (int) Math.floor(Math.random() * 25) + 5;
        }

       return happiness;
    }
    public void changeHappiness(int percentChange){
        percentChange += happiness;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public int getBirthday(){
        return birthday;
    }

    public ArrayList <Integer> getHaves(){
        return haves;
    }
    public ArrayList <Integer> getWants(){
        return wants;
    }

    public boolean isMarried(){
        return married;
    }

    public void gotMarriedTo(Person spouse){
        married = true;
        this.spouse = spouse;
    }

    public Person getSpouse(){
        if(spouse != null){
            return spouse;
        }else{
            return null;
        }
    }

     public static int bellCurve(int mean, int sd) {
		// make nombors gud
	    int i = mean - (3*sd);
	    int j = mean + (3*sd);
		int x = i;
		for(int c = i; c < j; c++) {
			double l = Math.random();
			if(l >= 0.5) {
				x++;
			}
		}
		return x;
     }

    public Place getPlace(){
         return place.getPlace();
    }


    public String changePlaceTo(Place newPlace){
         this.place = newPlace;
         return ("Person " + this.name + "moved to " + newPlace);
    }



    //-----------------------------------------------------------
    //sets a random income so government can test taxes untill people that are doing money finish

    public double getIncome() {
		return (double) income;
	}

	public void setIncome(int income) {
		this.income = income;

    }





}