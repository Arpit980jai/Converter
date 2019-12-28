package hk.ust.cse.comp107x.converter;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=(EditText)findViewById(R.id.editText);
                EditText editText1=(EditText)findViewById(R.id.editText2);
                double vMiles=Double.valueOf(editText.getText().toString());
                double vKm=vMiles/0.62137;

                DecimalFormat formatVal=new DecimalFormat("##.##");
                editText1.setText(formatVal.format(vKm));
            }
        });
        Button button2  =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=(EditText)findViewById(R.id.editText);
                EditText editText1=(EditText)findViewById(R.id.editText2);
                double vKm=Double.valueOf(editText1.getText().toString());
                double vMiles=vKm*0.62137;

                DecimalFormat formatVal=new DecimalFormat("##.##");
                editText.setText(formatVal.format(vMiles));
            }
        });
    }
}
