package com.example.actionbarchallenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewBook extends AppCompatActivity {

    EditText etTitle, etWriter, etType;
    Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_book_activity);

        etTitle = findViewById(R.id.etTitle);
        etWriter = findViewById(R.id.etWriter);
        etType = findViewById(R.id.etType);
        btnAdd = findViewById(R.id.btnAdd);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etTitle.getText().toString().isEmpty() || etWriter.getText().toString().isEmpty() ||
                        etType.getText().toString().isEmpty()) {
                    Toast.makeText(NewBook.this, "Please fill up the fields!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Book book = new Book(etType.getText().toString(), etTitle.getText().toString(),
                            etWriter.getText().toString());
                    ApplicationClass.books.add(book);
                    Toast.makeText(NewBook.this, "Book added successfully!", Toast.LENGTH_SHORT).show();
                    etTitle.setText(null);
                    etWriter.setText(null);
                    etType.setText(null);

                    setResult(RESULT_OK);
                    NewBook.this.finish();
                }

            }
        });

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add a new Book");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
