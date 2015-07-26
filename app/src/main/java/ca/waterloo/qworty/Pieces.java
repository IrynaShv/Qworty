package ca.waterloo.qworty;

import android.graphics.Color;
import android.graphics.Paint;

    enum Size {BIG, SMALL}
    enum Fill {WITH_X, WITHOUT_X}
    enum Shape {SQUARE, CIRCLE}

    class Piece {
        private Shape shape;
        private Size size;
        private Fill fill;
        private String color;
        private Paint paint;
        private boolean used;

        public Piece( Shape shape, Size size, Fill fill, String color){
            this.used = false;
            this.shape = shape;
            this.size = size;
            this.fill = fill;
            this.color = color;
            paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.parseColor(color));
        }

        public void UsePiece(){
            SetUsed(true);
        }

        public boolean GetUsed(){return used;}
        public void SetUsed(boolean val){used = val;}
    }


  class Pieces {

      Piece[] availablePieces = new Piece[16];
      public Pieces()
      {
          for(int i=0; i<16; i++) {
           // availablePieces[i]
          }
      }


}
