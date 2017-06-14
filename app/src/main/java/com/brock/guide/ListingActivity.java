package com.brock.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.brock.guide.models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class ListingActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private ListView listViewData;

    private List<Restaurant> restaurantList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        textViewTitle = (TextView) findViewById(R.id.textView2);
        listViewData = (ListView) findViewById(R.id.listViewData);

        if(getIntent().getExtras() != null){
            boolean isResto = getIntent().getExtras().getBoolean("isResto");
            if(isResto){
                textViewTitle.setText("Les Restaurents");
                restaurantList.add(new Restaurant("Mac Do","Fast Food","01 02 03 04","grossac@gmail.com","grogro.com","https://m.mcdonalds.fr/mcdo-mcdofr-front-theme-mobile/image/mcdo-france-android-app.png"));
                restaurantList.add(new Restaurant("SpeedRabbit","Pizza","05 09 65 52","pizapiza@piza.com","speedRabbit.com","http://www.rentabilitedelafranchise.com/21-59-thickbox/speed-rabbit-pizza.jpg"));
                restaurantList.add(new Restaurant("Flunch","Restaurant","04 05 07 08 06","cavaFluncher.com","cavafluncher.com","https://upload.wikimedia.org/wikipedia/commons/f/f1/Logo_Restaurant_Flunch.jpg"));
                restaurantList.add(new Restaurant("Eat Sushis","Sushiiis","09 99 99 99","chouchis@dsds.com","eatsushis.com","http://cdn.ou-dejeuner.com/establishment/logo/original/eat-sushi_55310.jpg"));
                //listViewData.setAdapter(new ArrayAdapter<Restaurant>(ListingActivity.this,R.layout.item_restaurent,restaurantList));
                listViewData.setAdapter(new RestaurantAdapter(ListingActivity.this,R.layout.item_restaurent,restaurantList));
            }else{
                textViewTitle.setText("Les Hôtels");
            }
        }

    }
}
