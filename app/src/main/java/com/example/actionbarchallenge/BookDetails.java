package com.example.actionbarchallenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BookDetails extends AppCompatActivity {

    TextView tvTitleX, tvWriterX;
    ImageView ivTypeX;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Book Detail");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        tvTitleX = findViewById(R.id.tvTitleX);
        tvWriterX = findViewById(R.id.tvWriterX);
        ivTypeX = findViewById(R.id.ivTypeX);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String writer = intent.getStringExtra("writer");
        String images = intent.getStringExtra("image");

        tvTitleX.setText(title);
        tvWriterX.setText(writer);

        if (images.equals("SciFi"))
        {
            ivTypeX.setImageResource(R.drawable.scfi);
        } else if  (images.equals("Drama"))
        {
            ivTypeX.setImageResource(R.drawable.drama);
        } else
        {
            ivTypeX.setImageResource(R.drawable.romance);
        }
    }



}
