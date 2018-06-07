package com.example.android.customlistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LanguageAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] languages;
    private final Integer[] images;
    public LanguageAdapter(@NonNull Activity context, Integer[] languageImage, String[] language) {
        super(context, R.layout.list_item,language);

        this.context = context;
        this.images=languageImage;
        this.languages=language;

    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, null,true);

        TextView language = rowView.findViewById(R.id.title);
        ImageView imageView = rowView.findViewById(R.id.languageImage);

        language.setText(languages[position]);
        imageView.setImageResource(images[position]);

        return rowView;
    }
}
