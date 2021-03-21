public class Cat extends Animal {
    //public int catAge; //не нужны тк все буду хранить в полях супера
    //public String catName;

    public Cat(int catAge, String catName) {
        super(catAge,catName);
        Animal.catCounter++;
    }

    @Override
    public void run(int dist) {
        if(dist > 200) {
            System.out.println(super.animalName+ " хотел пробежать " +dist+" м, но не смог" );
        } else {
            super.run(dist);
        }
    }

    @Override
    public void swim(int dist) {
        System.out.println(super.animalName + " признался, что не умеет плавать...");
    }
}
