
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
Jag lade till text för knappen samt för den andra aktiviteten i strings.xml. Se koden nedan.
```
<resources>
    <string name="app_name">Screens</string>
    <string name="button_text">Click here!</string>
    <string name="second_activity_text">Hej Hej från andra sidan!</string>
</resources>
```
## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).



Bilder läggs i samma mapp som markdown-filen.

![](android.png)

