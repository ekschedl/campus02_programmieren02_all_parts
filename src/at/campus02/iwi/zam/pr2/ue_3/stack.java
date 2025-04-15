package at.campus02.iwi.zam.pr2.ue_3;

import java.util.Stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Stack erstellen
        Stack<String> stack = new Stack<>();

        // Elemente auf den Stack legen
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Das oberste Element anzeigen
        System.out.println("Oberstes Element: " + stack.peek());  // C

        // Element entfernen und anzeigen
        System.out.println("Pop: " + stack.pop());  // C entfernt
        System.out.println("Oberstes Element nach Pop: " + stack.peek());  // B

        // Überprüfen, ob der Stack leer ist
        System.out.println("Ist der Stack leer? " + stack.empty());  // false

        // Das Element "B" suchen
        System.out.println("Position von B im Stack: " + stack.search("B"));  // 1 (oberstes Element)

        // Stack leeren
        stack.pop();
        stack.pop();
        System.out.println("Ist der Stack leer? " + stack.empty());  // true
    }
}
