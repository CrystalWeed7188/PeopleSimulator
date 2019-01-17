//package placeutil;
class Place {
    public String name;
    public int population;
    public Government govOfPlace = new Government(0.15);

    public Place(String name){
        this.name = name;
    }
    public String getPlace(){
        return name;
    }
}