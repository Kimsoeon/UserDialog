package soeonkim.kr.hs.emirim.userdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but = (Button)findViewById(R.id.but);
        but.setOnClickListener(this);//핸들러의 객체가 매개변수. 지금은 현재 클래스가 핸들러
    }

    @Override
    public void onClick(View v) {
        View dlgV = View.inflate(this, R.layout.dialog, null);
        AlertDialog.Builder dialog = new AlertDialog.Builder(this); //혹은getApplicationContext()
        dialog.setTitle("Input User Inforamtion");
        dialog.setIcon(R.drawable.toast);
        dialog.setView(dlgV);
        dialog.setPositiveButton("Ok", null);
        dialog.setNegativeButton("Cancel", null);
        dialog.show();

    }
}
