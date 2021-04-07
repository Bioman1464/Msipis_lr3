package mspis.lr.three;

interface Fruit {
    int eat();
}

class Apple implements Fruit {
    @Override
    public int eat() {
        return 5;
    }
}

class People {

    private Fruit fruit = new Apple();

    public void eatFruit() {
        fruit.eat();
    }
}

interface Service<Int, String> {

    String invoke(Int a);
}

class Lambda {

    public Service<Integer, String> hello() {
        return a -> {
            Fruit fruit = new Apple();
            fruit.eat();
            return "I'm good!";
        };
    }
}