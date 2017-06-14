package com.brock.guide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.brock.guide.models.Restaurant;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Brock on 14/06/2017.
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurant>{

    int resId;
    LayoutInflater inflater;

    public RestaurantAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Restaurant> objects) {
        super(context, resource, objects);
        resId = resource;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder; //declaration

        if(convertView == null){
            convertView = inflater.inflate(resId,null);

            viewHolder = new ViewHolder();
            viewHolder.textViewTitle = convertView.findViewById(R.id.textViewTitle);
            viewHolder.textViewCategory = convertView.findViewById(R.id.textViewCategory);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textViewTitle.setText("Le titre");
        viewHolder.textViewCategory.setText("La catégorie");
        return convertView;
    }
    class ViewHolder{
        TextView textViewTitle;
        TextView textViewCategory;

    }
}
