class Cat extends Animal {
    public static int count;
    private final String name;
    private boolean isHungry;

    public Cat(String name) {
        super();
        count++;
        this.name = name;
        this.isHungry = true;
    }

    public static int getCatCount() {
        return count;
    }
    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        int maxRunDistance = 200;
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println("Не мучайте " + name);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не проплывёт!.");
    }

    public void eat(Bowl bowl) {
        if (bowl.getFood() >= 5) {
            bowl.decreaseFood();
            isHungry = false;
            System.out.println(name + " поел из миски!.");
        } else {
            System.out.println(name + " остался голоден!.");

        }
    }

    public boolean isHungry() {
        return isHungry;
    }
}