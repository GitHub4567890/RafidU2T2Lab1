public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Chonky Boi", 3, 600);
        cat1.introduce();
        cat1.printCatInfo();

        System.out.println();

        Cat cat2 = new Cat("Skinny Boi",465,1);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
