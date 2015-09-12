package com.barrybecker4.omgandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView mainTextView;
    private Button mainButton;
    private int numClicks = 0;
    private EditText mainEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Access the TextView defined in layout XML
        // and then set its text
        mainTextView = (TextView) findViewById(R.id.main_textview);
        mainTextView.setText("Set in Java!");

        // 2. Access the Button defined in layout XML and listen for it here
        mainButton = (Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);

        // 3. Access the EditText defined in layout XML
        mainEditText = (EditText) findViewById(R.id.main_edittext);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /** Called when main_button clicked */
    @Override
    public void onClick(View v) {

        numClicks++;
        // change the text when the button is clicked.
        mainTextView.setText("Button pressed " + numClicks + " times.");

        // Take what was typed into the EditText and use in TextView
        mainTextView.setText(mainEditText.getText().toString()
                + " is learning Android development! (" + numClicks + ")");

    }
}
