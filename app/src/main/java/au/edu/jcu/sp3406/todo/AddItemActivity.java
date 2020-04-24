package au.edu.jcu.sp3406.todo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class AddItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        ActionBar actionBar = getSupportActionBar();    assert  actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        dataSource getSharedPreferences("todo items", Context.MODE_PRIVATE);


    }

    @Override
   public void onBackPressed(){
        Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
   }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:

                Set<String> items = dataSource.getStringSet("items", new HashSet<String>());
                assert items != null;
                dataSource.edit().clear(.putStringSet.("items", items).apply())
                Toast.makeText(this,"Added", Toast.LENGTH_SHORT).show();
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
