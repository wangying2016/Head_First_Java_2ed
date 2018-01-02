P186
```java
Animal[] animals = new Animal[5];
animals [0] = new Dog();
animals [1] = new Cat();
animals [2] = new Wolf();
animals [3] = new Hippo();
animals [4] = new Lion();

for (int i = 0; i < animals.length; i++) {
    animals[i].eat();
    animals[i].roam();
}
```
P187
```java
class Vet {
    public void giveShot(Animal a) {
        // do horrible things to the Animal at
        // the other end of the 'a' parameter
        a.makeNoise();
    }
}

class PetOwner {
    public void start() {
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();
        v.giveShot(d);
        v.giveShot(h);
    }
}
```