
# Rapport

Jag började med att skapa ny Empty View Activity och tillhörande xml-fil och ändrade namnet
till SecondActivity.java samt activity_second.xml. Jag behövde ta bort överflödig kod i SecondActivity
och filen såg därefter ut som koden nedan.
```
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }
}

```
Jag behövde därefter gå in i filen build.gradle och ändra versionen av material. Se koden nedan.
```
implementation 'com.google.android.material:material:1.1.0'
```
Därefter skapade jag en knapp i activity_main.xml och placerade den över textView med hjälp av 
constraints. Jag gav knappen ett id samt en text. Se koden nedan.
```
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        android:id="@+id/openSecondActivityButton"
        app:layout_constraintBottom_toTopOf="@id/helloText"
        android:text="@string/button_text"/>
```
Därefter skapade jag en variabel "goToSecondActivityButton" i OnCreate-metoden i MainActivity.java
och importerade klassen Button. Jag hämtade id för knappen från activity_main.xml. Jag lade till
OnClickListener till knappen och behövde lägga till metoden OnClick. I metoden skapade jag ett nytt
Intent för att öppna SecondActivity från MainActivity. Se koden nedan.

```
        Button goToSecondActivityButton = findViewById(R.id.openSecondActivityButton);
        goToSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
```
I activity_second.xml skapade jag en ny TextView med ett id. Se koden nedan.
```
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        android:id="@+id/intent_text"/>
```

Jag lade till text för knappen i en string i strings.xml. Se koden nedan.
```
<resources>
    <string name="app_name">Screens</string>
    <string name="button_text">Click here!</string>
</resources>
```
I MainActivity.java lade jag till Extras för att bifoga data. Se koden nedan.
```
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name", "Louise");
        startActivity(intent);
    }
```
I SecondActivity.java lade jag till Bundle för att möjliggöra att datan skickas med i mitt Intent.
``` 
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");

        }
``` 
Därefter skapade jag ett TextView-objekt i SecondActivity.java och hämtade min TextView med hjälp 
av findViewById från activity_second.xml.
``` 
        if (extras != null) {
            String name = extras.getString("name");
            Log.d("asdasd:", name);
            TextView myText = findViewById(R.id.intent_text);
            myText.setText("Hej hej från andra sidan, hälsar ".concat(name));

        }
```         


Bilder läggs i samma mapp som markdown-filen.

![](android.png)

