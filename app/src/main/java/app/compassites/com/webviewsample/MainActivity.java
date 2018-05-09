package app.compassites.com.webviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text = findViewById(R.id.et_url);
        Button submit = findViewById(R.id.btn_submit);
        final WebView webView = findViewById(R.id.web_view);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.getSettings().getLoadsImagesAutomatically();
                webView.loadUrl(text.getText().toString());
            }
        });
    }
}
