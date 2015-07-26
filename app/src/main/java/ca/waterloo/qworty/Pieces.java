package ca.waterloo.qworty;

import android.graphics.Color;
import android.graphics.Paint;


 // Created by tristan on 2015-07-26.

  class Pieces {

    private String shape;
    private String size;
    private String fill;
    private String color;
    private Paint paint;

    public Pieces( String shape, String size, String fill, String color){
        this.shape = shape;
        this.size = size;
        this.fill = fill;
        this.color = color;
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor(color));
    }
}
