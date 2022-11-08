package residency;

public abstract class Residency{
    String name;
    int rNumber;
    int area;
    int unit_rate;

    abstract long getPriceOfResidency();

    public Residency(){
        System.out.println("Default constructor");
    }
    public Residency(String name , int rNumber, int area){
        this.name = name;
        this.rNumber = rNumber;
        this.area = area;


    }
    public Residency(Residency r){
        r.name = name;
        r.rNumber = rNumber;
        r.area = area;
    }

    public
    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    int getRNumber(){
        return rNumber;
    }

    void setRNumber(int rNumber){
        this.rNumber = rNumber;
    }

    int getArea(){
        return area;
    }

    void setArea(int area){
        this.area =area;
    }

    int getUnitRate(){
        return unit_rate;
    }

    void setUnitRate(int unit_rate){
        this.unit_rate = unit_rate;
    }

}
