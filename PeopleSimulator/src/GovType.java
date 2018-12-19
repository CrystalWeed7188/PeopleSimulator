class GovType{
//initialized variables
private double taxRate;
private String typeLabel;
//private Person leader;

//constructer

public GovType(String typeLabel,  double taxRate){
    this.typeLabel = typeLabel;
    this.taxRate = taxRate;

    //an attempt to establish whats in things????
}
//make something to differenciate different systems of gov





//getters and setters


public String getTypeLabel() {
    //probablly randomly assigned to regions
    typeLabel = "Democracy";

    return typeLabel;
}

public void typeProperties(double income){
    if (typeLabel.equals("Democracy")){
        //will I make different tax rates for income levels? Probably account for single and married?

        if(income > 0 &&  income < 10000){
            taxRate = .10;
        }else if (income > 10000 &&  income < 38000){
            taxRate = .12;
        } else if(income > 38000 &&  income < 82000){
            taxRate = .22;
        } else{
            taxRate = .30;
        }
    }

    

}



public void setTypeLabel(String typeLabel) {
	this.typeLabel = typeLabel;
}






public double getTaxRate() {
	return taxRate;
}


public void setTaxRate(double taxRate) {
	this.taxRate = taxRate;
}




}