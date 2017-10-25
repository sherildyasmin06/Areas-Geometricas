package com.aplica01operaciones;

import Package_Operaciones.Clase01;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Promedio extends Activity {
   EditText txtcurso,txtn1,txtn2,txtn3,txtprom,txtobs;
   Button btnuevo3, btcalcular3, btsalir3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_promedio);
		txtcurso = (EditText)findViewById(R.id.tcurso);
		txtn1 = (EditText)findViewById(R.id.tnota1);
		txtn2 = (EditText)findViewById(R.id.tnota2);
		txtn3 = (EditText)findViewById(R.id.tnota3);
		txtprom = (EditText)findViewById(R.id.tpromedio);
		txtobs = (EditText)findViewById(R.id.tobservacion);
		btnuevo3 = (Button)findViewById(R.id.btnnuevo3);
		btcalcular3 = (Button)findViewById(R.id.btncalcular3);
		btsalir3 = (Button)findViewById(R.id.btnsalir3);
		btnuevo3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				txtcurso.setText("");
				txtn1.setText("");
				txtn2.setText("");
				txtn3.setText("");
				txtprom.setText("");
				txtobs.setText("");
				txtcurso.requestFocus();
			}
		});
		
         btcalcular3.setOnClickListener(new View.OnClickListener() {
 			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Clase01 objpromedio=new Clase01();
				String ycurso=txtcurso.getText().toString();
				int yn1=Integer.parseInt(txtn1.getText().toString());
				int yn2=Integer.parseInt(txtn2.getText().toString());
				int yn3=Integer.parseInt(txtn3.getText().toString());
				txtprom.setText(String.valueOf(objpromedio.Promedio(yn1, yn2, yn3)));
				double ypromedio=Double.parseDouble(txtprom.getText().toString());	
				txtobs.setText(String.valueOf(objpromedio.Observacion(ypromedio)));
				
			}
		});
         btsalir3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		finish();
	}
});
	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.promedio, menu);
		return true;
	}

}
