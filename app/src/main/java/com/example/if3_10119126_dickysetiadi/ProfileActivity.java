package com.example.if3_10119126_dickysetiadi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// Tanggal Pengerjaan: 23 April 2022
// NIM: 10119126
// Nama: Dicky Setiadi
// Kelas: IF-3

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // inisialisasi view
        View decorView = getWindow().getDecorView();
        // Hide ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

}
