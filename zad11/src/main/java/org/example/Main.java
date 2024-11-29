package org.example;

public class Main {
    public static void main(String[] args) {
        GameCharacter original = new GameCharacter("Warrior", 100, 50);
        GameCharacter clone = original.clone();

        clone.setName("Mage");
        clone.setHealth(80);
        clone.setStrength(70);

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}