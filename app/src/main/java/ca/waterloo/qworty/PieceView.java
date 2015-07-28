package ca.waterloo.qworty;

import android.content.Context;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.View;

public class PieceView extends View {

    private Pieces pieces;
    private int width, height, viewWidth, viewHeight, smallPieceRad, bigPieceRad, widthCent, heighCent, screenHeightWOView;
    private Context gameContext;

    public PieceView(Context context, Pieces newPieces) {
        super(context);
        pieces = newPieces;
        gameContext = context;
    }

    protected void OnDraw(Canvas canvas){
        viewWidth = this.getWidth();
        viewHeight = this.getHeight();
        width = viewWidth/8;
        height = viewHeight/2;
        DisplayMetrics metrics = gameContext.getResources().getDisplayMetrics();
        screenHeightWOView = metrics.heightPixels - viewHeight;
        smallPieceRad = viewWidth/2;
        bigPieceRad = viewWidth*(3/4);

        for(int i = 0; i< pieces.getPieces().length; i++)
        {

        }

    }
}
