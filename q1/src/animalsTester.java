public class animalsTester {
    public static void main(String[] args) {
        String name = "yoyo";
        String cell;
        cell = "0584741450";
        Owner owner = new Owner(name,cell);
        System.out.println(owner.toString());
        Dog dog = new Dog("dog","green", 8,"lol",owner);
        System.out.println(dog);
    }
}
