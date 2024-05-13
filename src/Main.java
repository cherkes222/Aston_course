public class Main {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Sharik");
        dogs[1] = new Dog("Archi");

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Marik");
        cats[1] = new Cat("Garik");
        cats[2] = new Cat("Varya");

        dogs[0].run(400);
        dogs[0].swim(5);
        System.out.println();

        dogs[1].run(200);
        dogs[1].swim(8);
        System.out.println();

        cats[0].run(50);
        cats[0].swim(0);
        System.out.println();

        cats[1].run(150);
        cats[1].swim(10);
        System.out.println();

        cats[2].run(250);
        cats[2].swim(3);
        System.out.println();

        System.out.println("Количество животных: " + Animal.getCount());
        System.out.println("Количество котиков: " + Cat.getCatCount());
        System.out.println("Количество собачек: " + Dog.getDogCount());
        System.out.println();

        Bowl bowl = new Bowl(0);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        System.out.println();



        for (Cat cat : cats) {
            System.out.println(cat.getName() + " голодает: " + cat.isHungry());
        }


        bowl.addFood(5);
        cats[0].eat(bowl);
        System.out.println(cats[0].getName() + " голодает: " + cats[0].isHungry());


        bowl.addFood(0);
        cats[1].eat(bowl);
        System.out.println(cats[1].getName() + " голодает: " + cats[1].isHungry());


        bowl.addFood(6);
        cats[2].eat(bowl);
        System.out.println(cats[2].getName() + " голодает: " + cats[2].isHungry());
    }
}