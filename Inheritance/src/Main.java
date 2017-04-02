/**
 * Created by jwilson on 02/04/2017.
 */
public class Main {

    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("York", 8, 20, 4, 1, 1, 20, "long coat");
        dog.eat();
    }
}
