# Aufgabe 2: Suspend Functions
## Aufgabe 2.1: Starten einer suspend Function
Rufe die Funktion *datasource.getLatestValue* auf und lasse den Wert in der Konsole ausgeben. 
Achte darauf, die Signatur der Main-Methode nicht zu verändern.
## Aufgabe 2.2: Zeitmessung
Mit der Funktion *measureTimeMillis* lässt sich die benötigte Zeit innerhalb des eingeschlossenen Blocks messen. Zur Erläuterung folgendes Beispiel: 

*val time = measureTimeMillis {
        // run code for time measuring here
}
println("Time needed in milliseconds: $time")*

Rufe die Funktion *datasource.getLatestValue* nun mehrfach auf und lasse die Werte ausgeben, ohne dass die Ausführungszeit um vielfaches steigt. 

## Aufgabe 2.3: Asynchrone Verarbeitung
*datasource.getLatestValue* soll zweifach Aufgerufen werden, dessen Werte anschließend Zusammenaddiert werden sollen. Dabei ist darauf zu achten, dass die Ausführung von *datasource.getLatestValue* parallel geschieht, sodass sich die Ausführungszeit nicht verdoppelt. 
Lasse auch hier wieder die benötigte Zeit ausgeben. 
