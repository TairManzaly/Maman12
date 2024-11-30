public class Owl extends wildAnimals{

    Owl(String name, String color, int age){
        super(name,color,age);
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
    String isFlying() {
        return name+" is flying";
    }
    @Override
    String  Eat() {
        return name+ "is eating";
    }

    @Override
    String Sleep() {
        return name+ "is sleeping";
    }
}
