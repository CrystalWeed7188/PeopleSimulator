class Person {
	public int age;
	private String name;
    private double income;
    private double incomeUntaxed;



	public Person(int age, String name, double income) {
		this.name = name;
		this.age = age;
        this.setIncome(income);
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
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

}