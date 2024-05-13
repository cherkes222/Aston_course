class Dog extends Animal {
    public static int count;
    private final String name;

    public Dog(String name) {
        super();
        count++;
        this.name = name;

    }
    public static int getDogCount() {
        return count;
    }



    @Override
    public void run(int distance) {
        int maxRunDistance = 500;
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println("Не мучайте" + name);
        }
    }

    @Override
    public void swim(int distance) {
        int maxSwimDistance = 10;
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не проплывёт!");
        }
    }
}