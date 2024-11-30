public class Dog extends domesticAnimals {

    Dog(String name, String color, int age, String pName, Owner owner) {
        super(name, color, age, pName,owner);
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


    @Override
    String Eat() {
        return "The dog is eating";
    }

    @Override
    String Sleep() {
        return "The dog is Sleeping";
    }
    String Bark(){
        return name+" is barking";
    }

    @Override
    public String toString(){
        return "The name of the Dog: "+name+"\nThe Color of the dog: "+color+"\nThe age of the dog: "
                +age+"\nOwner details: "+owner.toString();
    }
}
