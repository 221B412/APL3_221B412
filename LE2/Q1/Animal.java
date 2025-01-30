abstract class Animal {
    abstract void makeVoice();
}
class Cow extends Animal {
    void makeVoice() {
        System.out.println("Cow says: Moo");
    }
}

class Dog extends Animal {
    void makeVoice() {
        System.out.println("Dog says: Woof");
    }
}

class Pig extends Animal {
    void makeVoice() {
        System.out.println("Pig says: Oink");
    }
}

class Goat extends Animal {
    void makeVoice() {
        System.out.println("Goat says: Baa");
    }
}

class Lion extends Animal {
    void makeVoice() {
        System.out.println("Lion says: Roar");
    }
}
