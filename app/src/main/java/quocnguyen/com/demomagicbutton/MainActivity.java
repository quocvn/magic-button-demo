package quocnguyen.com.demomagicbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity {

    MagicButton btnFacebook, btnYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFacebook = (MagicButton) findViewById(R.id.magic_button_facebook);
        btnYoutube = (MagicButton) findViewById(R.id.magic_button_youtube);

        btnFacebook.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Facebook", Toast.LENGTH_SHORT).show();
            }
        });

        btnYoutube.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Youtube", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
