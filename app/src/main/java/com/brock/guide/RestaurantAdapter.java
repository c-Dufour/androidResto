package com.brock.guide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import com.brock.guide.models.Restaurant;

import java.util.List;

/**
 * Created by Brock on 14/06/2017.
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurant>{
    public RestaurantAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Restaurant> objects) {
        super(context, resource, objects);
    }
}
