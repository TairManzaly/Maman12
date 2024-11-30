public class Parrot extends domesticAnimals {

    Parrot(String name, String color, int age, Owner owner) {
        super(name, color, age, owner);
    }

    String isFlying() {
        return name+" is flying";
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(int age){
        this.age = age;
    }
    public String getOwner(){
        return owner.toString();
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }

    ;

    @Override
    String Eat() {
        return name + "is eating";
    }

    @Override
    String Sleep() {
        return name + "is sleeping";
    }
}

