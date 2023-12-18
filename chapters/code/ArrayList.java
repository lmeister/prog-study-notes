// Import der ArrayList-Klasse
import java.util.ArrayList;

// Deklaration und Initialisierung
ArrayList<Integer> myArrayList = new ArrayList<>();

// Elemente hinzufuegen
myArrayList.add(1);

// Zugriff auf ein Element
int element = myArrayList.get(0);

// Iteration durch die ArrayList
for (int i = 0; i < myArrayList.size(); i++) {
    System.out.println(myArrayList.get(i));
}
