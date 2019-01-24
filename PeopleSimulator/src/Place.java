//package placeutil;
class Place {
    public String name;
    public String govType;
    public int population;
    public Government govOfPlace = new Government(0.15);

    public Place(String name, String govType){
        this.name = name;
        this.govType = govType;
    }
    public Place getPlace(){
        return this;

    }
   


}