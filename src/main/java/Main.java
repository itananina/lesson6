public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(5, "Мурзик");
        Cat cat2 = new Cat(3, "Толик");
        Cat cat3 = new Cat(1, "Пушок");
        Dog dog1 = new Dog(4,"Пёсель");
        Dog dog2 = new Dog(9,"Дружок");
        Dog dog3 = new Dog(6,"Смерч");

        cat1.run(205);
        cat1.swim(5);
        cat2.run(100);
        cat3.swim(5);
        dog1.run(505);
        dog1.swim(16);
        dog2.run(500);
        dog3.swim(5);

        Animal.printCount();
    }
}
