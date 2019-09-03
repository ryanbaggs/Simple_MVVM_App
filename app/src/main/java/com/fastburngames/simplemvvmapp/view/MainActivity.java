package com.fastburngames.simplemvvmapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fastburngames.simplemvvmapp.R;
import com.fastburngames.simplemvvmapp.viewModel.TextViewModel;

public class MainActivity extends AppCompatActivity {

    // Views.
    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the ViewModel.
        // On https://developer.android.com/reference/android/arch/lifecycle/ViewModelProviders
        // ViewModelProviders.of is listed as not deprecated.
        TextViewModel viewModel = ViewModelProviders.of(this).get(TextViewModel.class);

        // Text setup.
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        // Button setup.
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
