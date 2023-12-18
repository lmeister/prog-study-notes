// Verwendung des Set-Datentyps
import java.util.HashSet;
import java.util.Set;

// Deklaration und Initialisierung
Set<String> mySet = new HashSet<>();

// Elemente hinzufügen
mySet.add("Apple");
mySet.add("Banana");

// Überprüfen auf Eindeutigkeit
boolean containsBanana = mySet.contains("Banana");
