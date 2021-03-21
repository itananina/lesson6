public class Animal {
    public int animalAge;
    public String animalName;
    public static int dogCounter = 0;
    public static int catCounter = 0;
    public static int animalCounter = 0;

    public Animal (int animalAge, String animalName) {
        this.animalAge = animalAge;
        this.animalName = animalName;
        animalCounter++;
    }

    public void run(int dist) {
        System.out.println(this.animalName + " пробежал " + dist + " м");
    }

    public void swim(int dist) {
        System.out.println(this.animalName + " проплыл " + dist + " м");
    }

    public static void printCount() {
        System.out.println("Всего животных: "+animalCounter+". Собак: "+dogCounter+". Котов: "+catCounter);
    }
}
