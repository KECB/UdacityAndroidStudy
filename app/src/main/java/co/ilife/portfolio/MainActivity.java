package co.ilife.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  Button btnCapstone, btnBuildBigger, btnMakeMaterial, btnPopMovie, btnStockHawk, btnUbiquitous;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    btnCapstone = (Button) findViewById(R.id.btnCapstone);
    btnCapstone.setOnClickListener(this);
    btnBuildBigger = (Button) findViewById(R.id.btnBuildItBigger);
    btnBuildBigger.setOnClickListener(this);
    btnMakeMaterial = (Button) findViewById(R.id.btnMakeMaterial);
    btnMakeMaterial.setOnClickListener(this);
    btnPopMovie = (Button) findViewById(R.id.btnPopMovie);
    btnPopMovie.setOnClickListener(this);
    btnStockHawk = (Button) findViewById(R.id.btnStockHawk);
    btnStockHawk.setOnClickListener(this);
    btnUbiquitous = (Button) findViewById(R.id.btnUbiquitous);
    btnUbiquitous.setOnClickListener(this);
  }

  @Override public void onClick(View v) {
    switch (v.getId()) {
      case R.id.btnCapstone:
        showToast(getResources().getString(R.string.capstone));
        break;
      case R.id.btnBuildItBigger:
        showToast(getResources().getString(R.string.build_it_bigger));
        break;
      case R.id.btnMakeMaterial:
        showToast(getResources().getString(R.string.make_your_app_material));
        break;
      case R.id.btnPopMovie:
        showToast(getResources().getString(R.string.pop_movie));
        break;
      case R.id.btnStockHawk:
        showToast(getResources().getString(R.string.stock_hawk));
        break;
      case R.id.btnUbiquitous:
        showToast(getResources().getString(R.string.go_ubiquitous));
        break;
    }
  }

  private void showToast(String button) {
    Toast.makeText(this, "This button will launch my "+button+" app!",Toast.LENGTH_SHORT).show();
  }
}
