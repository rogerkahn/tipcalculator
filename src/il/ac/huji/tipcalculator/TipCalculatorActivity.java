package il.ac.huji.tipcalculator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("DefaultLocale") 
public class TipCalculatorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculator, menu);
        return true;
    }
    @SuppressLint("DefaultLocale") 
    public void Calculate(View view){
		
			double amountAsDouble = Double.parseDouble(((EditText)findViewById(R.id.edtBillAmount)).getText().toString());
			String amountAsString;
// tip percentage
			amountAsDouble *= 0.12;
	// formatted to string based on checkbox value
			
			if (((CheckBox)findViewById(R.id.chkRound)).isChecked()){
				amountAsString = String.format("%.0f", amountAsDouble); 
			}
			else{
				amountAsString = String.format("%.2f", amountAsDouble);
			}
			((TextView)findViewById(R.id.txtTipResult)).setText("Tip: $" + amountAsString);
		}
	
	
    
}
