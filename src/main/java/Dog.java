public class Dog extends Animal {
    public Dog(int dogAge, String dogName) {
        super(dogAge,dogName);
        Animal.dogCounter++;
    }

    @Override
    public void run(int dist) {
        if(dist > 500) {
            System.out.println(super.animalName+ " хотел пробежать " +dist+" м, но не смог" );
        } else {
            super.run(dist);
        }
    }

    @Override
    public void swim(int dist) {
        if(dist > 10) {
            System.out.println(super.animalName+ " хотел проплыть " +dist+" м, но не смог" );
        } else {
            super.swim(dist);
        }
    }
}
