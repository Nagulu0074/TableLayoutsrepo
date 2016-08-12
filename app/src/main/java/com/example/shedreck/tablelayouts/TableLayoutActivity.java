package com.example.shedreck.tablelayouts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.TableLayout;

    public class TableLayoutActivity extends AppCompatActivity {
        CheckBox c1,c2,c3,c4;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_table_layout);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
        }
        public void TableLayout(View v) {
            c1 = (CheckBox) findViewById(R.id.c1);
            c2 = (CheckBox) findViewById(R.id.c2);
            c3 = (CheckBox) findViewById(R.id.c3);
            c4 = (CheckBox) findViewById(R.id.c4);


            StringBuilder orderlist = new StringBuilder();
            orderlist.append("You have ordered :");

            if (c1.isChecked()) {
                orderlist.append(c1.getText() + " ");
            }
            if (c2.isChecked()) {
                orderlist.append(c2.getText() + " ");
            }
            if (c3.isChecked()) {
                orderlist.append(c3.getText() + " ");
            }
            if (c4.isChecked()) {
                orderlist.append(c4.getText() + " ");
            }


            Toast.makeText(TableLayout.this,orderlist, Toast.LENGTH_LONG).show();
            c1.setChecked(false);
            c2.setChecked(false);
            c3.setChecked(false);
            c4.setChecked(false);
        }

    }
