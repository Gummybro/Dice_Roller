package edu.gannon.diceeroller;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Private Button btnRoll;
    Private Textview textViewRoll;
    Private ImageView imageViewRoll;
    Private int rollResult =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnroll =findViewById(R.id.btn_rollDice);
        textViewRoll = findViewById(R.id.tx_dice);
        ImageviewRoll = findViewByID(R.id.iv_dice);

    }

    public void rollDice(View view) {

        rollResult = new Random().nextInt()
    }
}