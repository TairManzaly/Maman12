public abstract class  Animals  {

    String name;
    String color;
    int age;
    abstract String Eat();
    abstract String Sleep();


    Animals(String name , String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
