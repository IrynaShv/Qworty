package ca.waterloo.qworty;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public class PieceView extends View {

    private Pieces pieces;
    private int width;
    private int height;
    private int pieceWidth;


    public PieceView(Context context, Pieces newPieces) {
        super(context);
        pieces = newPieces;
    }

    protected void OnDraw(Canvas canvas){
        width = this.getWidth();
        height = this.getHeight();

    }
}
