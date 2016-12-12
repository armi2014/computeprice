package padc.com.ph.computeprice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static String TAG = "MainActivity";

    private static final double APPLE_PRICE_PER_PIECE = 12.50;
    private static final double ORANGE_PRICE_PER_PIECE = 10.25;

    private EditText etAppleCount;
    private EditText etOrangeCount;
    private TextView etTotalPrice;
    private Button btnCompute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAppleCount = (EditText) findViewById(R.id.editText_apple_count);
        etOrangeCount = (EditText) findViewById(R.id.editText_orange_count);
        etTotalPrice = (TextView) findViewById(R.id.editText_total_price);

        btnCompute = (Button)findViewById(R.id.activity_main);
        btnCompute.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        double appleCount = 0.0;
        double orangeCount = 0.0;
        double totalPrice = 0.0;

        appleCount = Double.parseDouble(etAppleCount.getText().toString());
        orangeCount = Double.parseDouble(etOrangeCount.getText().toString());

        totalPrice = (APPLE_PRICE_PER_PIECE * appleCount) + (ORANGE_PRICE_PER_PIECE * orangeCount);

        Log.d(TAG, "Total Price = " + totalPrice);

        etTotalPrice.setText(totalPrice + "");
    }
}
