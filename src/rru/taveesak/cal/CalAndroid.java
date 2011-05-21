package rru.taveesak.cal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import rru.taveesak.*;

public class CalAndroid extends Activity {
    /** Called when the activity is first created. */
	Button bt1,bt2,bt3,bt4;
	EditText et1,et2;
	TextView tv1;
	Calculator c=new Calculator();
    @Override
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        tv1=(TextView)findViewById(R.id.textView1);
        bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv1.setText(String.valueOf(c.add(Double.parseDouble(et1.getText().toString()),Double.parseDouble(et2.getText().toString()))));
			}
		});
        bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv1.setText(String.valueOf(c.sub(Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()))));
				
			}
		});
        bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv1.setText(String.valueOf(c.multi(Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()))));
			}
		});
        bt4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv1.setText(String.valueOf(c.div(Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()))));

			}
		});
        
    }
}