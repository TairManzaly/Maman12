public abstract class domesticAnimals extends Animals {
private  String privateName;
    Owner owner;
    domesticAnimals(String name, String color, int age,String privateName, Owner owner){
        super(name,color,age);
        this.privateName = privateName;
        this.owner = owner;
    }
}
