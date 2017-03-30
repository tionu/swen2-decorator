Diese �bung baut auf �bung 1 auf

1. Wandeln Sie die Patient Klasse in ein Immutable Objekt um
  - Passen Sie alle Stellen im Code dazu an, sodass keine Fehlermeldungen mehr �brig bleiben
2. Erweitern Sie die Patient Klasse um die Eigenschaften Telefonnummer, Stra�e, Hausnummer, PLZ, Ort
  - Verwenden Sie dazu das Builder-Pattern, um die Lesbarkeit zu erhalten und die Klasse trotzdem immutable zu belassen
  - Erm�glichen Sie es, die Adresse (Stra�e, Hausnummer, PLZ, Ort) in einer Methode anzugeben
3. Erstellen Sie eine Klasse "AlterDecorator", welche von der abstrakten Klasse "PropertyDecorator" erbt und der Eigenschaftstabelle eine weitere Zeile mit dem Alter des Patienten hinzuf�gt. Erstellen Sie einen Test f�r die Klasse AlterDecorator