package vn.edu.ntu.tuongnghi.tuongnghi_59131563_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String textXacNhan;
    EditText editTen, editNgaySinh, editSoThichKhac;
    RadioGroup radgGioiTinh;
    CheckBox checPhim, checNhac, checCafe, checNha, checBep;
    Button buttXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }

    private void addView(){
        editTen = findViewById(R.id.editTen);
        editNgaySinh = findViewById(R.id.editNgaySinh);
        radgGioiTinh = findViewById(R.id.radgGioiTinh);
        checPhim = findViewById(R.id.checPhim);
        checNhac = findViewById(R.id.checNhac);
        checCafe = findViewById(R.id.checCafe);
        checNha = findViewById(R.id.checNha);
        checBep = findViewById(R.id.checBep);
        editSoThichKhac = findViewById(R.id.editSoThichKhac);
        buttXacNhan = findViewById(R.id.buttXacNhan);
    }

    private void addEvent(){
        buttXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacNhan();
            }
        });
    }

    private void xacNhan(){
        textXacNhan = editTen.getText().toString() + "\n" +
                "Ngày sinh: " + editNgaySinh.getText().toString() + "\n" +
                "Giới tính: ";
        if (radgGioiTinh.getCheckedRadioButtonId() == R.id.radbNam)
            textXacNhan += "Nam" + "\n" + "Sở thích: ";
        else
            textXacNhan += "Nữ" + "\n" + "Sở thích: ";

        if (checPhim.isChecked())
            textXacNhan += "Xem phim; ";
        if (checNhac.isChecked())
            textXacNhan += "Nghe nhạc; ";
        if (checCafe.isChecked())
            textXacNhan += "Đi cà phê với bạn; ";
        if (checNha.isChecked())
            textXacNhan += "Ở nhà một mình; ";
        if (checBep.isChecked())
            textXacNhan += "Vào bếp nấu ăn; ";

        textXacNhan += editSoThichKhac.getText().toString();
        Toast.makeText(getApplicationContext(), textXacNhan, Toast.LENGTH_SHORT).show();
    }
}
