package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Adapter;

import java.util.ArrayList;

/**
 * Created by nmatveev on 20.07.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public int mColorResourseId;

    public int mIconPlayResourceId;





    public WordAdapter(Activity context, ArrayList<Word> words, int layoutColor,int iconPlay) {
        super(context, 0, words);
        mColorResourseId = layoutColor;
        mIconPlayResourceId = iconPlay;


        //LinearLayout background = (LinearLayout)context.findViewById(R.id.list_item_text_layout);
        // background.setBackgroundResource(layoutColor);
    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListItemView = convertView;
        if (convertView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //return super.getView(position, convertView, parent);
        Word posItem = getItem(position);

        RelativeLayout textLayout = (RelativeLayout) ListItemView.findViewById(R.id.list_item_text_layout);
        textLayout.setBackgroundResource(mColorResourseId);


        TextView miwokTextView = (TextView) ListItemView.findViewById(R.id.text_miwok);
        miwokTextView.setText(posItem.getMiwokTranslation());


        TextView englishTextView = (TextView) ListItemView.findViewById(R.id.text_english);
        englishTextView.setText(posItem.getDefaultTraslation());


        ImageView imageView = (ImageView) ListItemView.findViewById(R.id.image);
        //imageView.setImageResource(posItem.getImageResourseId());
        //imageView.setBackgroundColor(R.color.tan_background);

        if (posItem.hasImage()){
            imageView.setImageResource(posItem.getImageResourseId());
            imageView.setVisibility(View.VISIBLE);
        }
            else{
                imageView.setVisibility(View.GONE);
            }

        ImageView imageView1 = (ImageView) ListItemView.findViewById(R.id.play_ic);
        imageView1.setImageResource(mIconPlayResourceId);
















        return ListItemView;


    }





    }
