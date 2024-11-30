public class Lion extends wildAnimals{
    Lion(String name, String color, int age) {
        super(name, color, age);
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
    @Override
    String Eat() {
        return name+ "is eating";
    }

    @Override
    String Sleep() {
        return name+ "is sleeping";
    }
    String Roar(){
        return "is roaring";
    }
}
