
class Person {
	public int age;
	private String name;
    private double income;
    public Place place;
    public int thisPopulation;



	public Person(int age, String name,Place place,double income) {
		this.name = name;
		this.age = age;
         this.place = place;
         this.income = income;
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

    //-----------------------------------------------------------------
    //Places

    public String getPlace(){
         return place.getPlace();
    }

    public String changePlaceTo(Place newPlace){
         this.place = newPlace;
         return ("Person " + this.name + "moved to " + newPlace);
    }


    //-----------------------------------------------------------
    //sets a random income so government can test taxes untill people that are doing money finish

    public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;

    }




}