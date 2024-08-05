package demo.solution.optionmenu;

import android.graphics.drawable.ColorDrawable;  // Import this class
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private static final int MENU_ITEM_SEARCH = R.id.app_bar_search;
    private static final int MENU_ITEM_SWITCH = R.id.app_bar_switch;
    private static final int MENU_ITEM_ITEM3 = R.id.item_menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Show ActionBar if available
        ActionBar actionBar = getSupportActionBar();
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.whatsapp_green));
        if (actionBar != null) {
            actionBar.show();
            actionBar.setTitle("WhatsApp");
            actionBar.setSubtitle("Send the massage to everyone");

            // Set ActionBar background color to WhatsApp green
            actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.whatsapp_green)));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu resource file
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        int id = item.getItemId();

        if (id == R.id.app_bar_search) {
            showToast("Search clicked");
            return true;
        } else if (id == R.id.app_bar_switch) {
            showToast("Switch clicked");
            return true;
        } else if (id == R.id.item_menu3) {
            showToast("Item 3 clicked");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
