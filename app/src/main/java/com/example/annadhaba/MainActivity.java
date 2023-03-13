package com.example.annadhaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toolbar goToKarttoolbar;
    ImageButton imageButton;
ArrayList<itemModelRecycler> arrayList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.item_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"KADAI PANEER","90", "180"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"MUTTER PANEER", "90", "180"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"SHAHI PANEER","90", "180"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon, "CHANA MASALA", "60", "120"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon, "DAL MAKHANI" ,"50","100"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"MIX VEG" ,"50" ,"100"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"KADI RICE", "50","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"KADI RICE", "50","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon, "RAJMA RICE","50", "70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"DAL RICE" ,"50", "70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"CHHOLE RICE","50", "70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"ALOO MUTTER RICE","50","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"ALOO PALAK" ,"35","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"ALOO PHOOL GOBHI","35","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon, "ALOO PATTA GOBHI","35", "70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"RAJMA" ,"35","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"CHHOLE","35","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"DAL FRY" ,"35","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"KADI" ,"35","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"ALOO MUTTER","35","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"ALOO BAINGAN" ,"35","70"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"RAITA" ,"25","50"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"TAWA ROTI" ,"NA","5"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"TANDOORI ROTI" ,"NA","5"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"TANDOORI ROTI BUTTER","NA","6"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"LACHHA PARATHA","NA","15"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"ALOO PARATHA","NA","15"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"ONION PARATHA","NA","20"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon, "PLAIN NAAN","NA","20"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"BUTTER NAAN","NA","25"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"GOBI PARATHA","NA","25"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"PANEER PARATHA","NA","30"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"PANEER NAAN","NA","35"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"Normal Thali","NA","60"));
        arrayList.add(new itemModelRecycler(R.drawable.anna_dhaba_icon,"Special Thali","NA","90"));

        RecyclerlistAdapter adapter =new RecyclerlistAdapter(MainActivity.this, arrayList);
        recyclerView.setAdapter(adapter);

        goToKarttoolbar =findViewById(R.id.goToKarttoolBar);
        setSupportActionBar(goToKarttoolbar);

        imageButton =findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iKart =new Intent(MainActivity.this,kart.class);
                startActivity(iKart);

            }
        });

    }
}