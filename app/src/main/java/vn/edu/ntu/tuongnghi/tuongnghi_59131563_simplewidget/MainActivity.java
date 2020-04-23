package vn.edu.ntu.tuongnghi.tuongnghi_59131563_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String textXacNhan;
    EditText editTen, editNgaySinh, editSoThichKhac;
    RadioGroup radgGioiTinh, radgSoThich;
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
        radgSoThich = findViewById(R.id.radgSoThich);
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
        switch (radgSoThich.getCheckedRadioButtonId()) {
            case R.id.checPhim:
                textXacNhan += "Xem phim";
            case R.id.checNhac:
                textXacNhan += "; Nghe nhạc";
            case R.id.checCafe:
                textXacNhan += "; Đi cà phê với bạn bè";
            case R.id.checNha:
                textXacNhan += "; Ở nhà một mình";
            case R.id.checBep:
                textXacNhan += "; Vào bếp nấu ăn";
        }
        textXacNhan += editSoThichKhac.getText().toString();
        Toast.makeText(getApplicationContext(), textXacNhan, Toast.LENGTH_SHORT).show();
    }
}
