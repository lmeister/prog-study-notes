// Import der LinkedList-Klasse
import java.util.LinkedList;

// Deklaration und Initialisierung (singly LinkedList)
LinkedList<Integer> myLinkedList = new LinkedList<>();

// Elemente hinzufuegen
myLinkedList.add(1);

// Zugriff auf ein Element
int element = myLinkedList.get(1);

// Iteration durch die LinkedList
for (int value : myLinkedList) {
    System.out.println(value);
}