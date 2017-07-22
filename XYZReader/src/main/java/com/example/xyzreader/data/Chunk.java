package com.example.xyzreader.data;

import android.widget.TextView;

/**
 * Created by Kids on 7/21/2017.
 */

public class Chunk {
    private TextView textView;
    private String text;
    private int partLength;
    public Chunk(TextView textView, String text, int partLength) {
        this.textView = textView;
        this.text = text;
        this.partLength = partLength;
    }

    public TextView getTextView() {
        return textView;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public int getPartLength() {
        return partLength;
    }

    public void setPartLength(int partLength) {
        this.partLength = partLength;
    }
}
