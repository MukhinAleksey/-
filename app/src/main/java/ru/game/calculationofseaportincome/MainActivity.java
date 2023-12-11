package ru.game.calculationofseaportincome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Создание морского порта
        Seaport seaport = new Seaport(170000);

        // Добавление дохода от обслуживания морских судов
        ShipServicing servicingIncome = new ShipServicing(125, 3500);
        seaport.addIncome(servicingIncome);

        // Расчет выручки
        int totalRevenue = seaport.calculateTotalRevenue();

        // Вывод результата на экран
        TextView resultTextView = findViewById(R.id.resultTextView);
        String result = String.format(Locale.getDefault(), "Выручка морского порта за месяц: %d монет", totalRevenue);
        resultTextView.setText(result);
    }
}