class Animal {
    public String n;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        System.out.println("hello!!!");

    }
}

class dog extends Animal {
    String sound;

    public String getSound() {
        return sound;
    }

    public String setSound(String sound) {
        System.out.println("Bhow, Bhow!!");
        return sound;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal n = new Animal();
        dog s = new dog();

        // n.setN("Dog");
        // n.getN();

        // s.getSound();
        s.setSound(null);
    }
}
