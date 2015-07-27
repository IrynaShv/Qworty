package ca.waterloo.qworty;

import android.graphics.Color;
import android.graphics.Paint;

    enum Size {BIG, SMALL}
    enum Fill {HOLLOW, SOLID}
    enum Shape {SQUARE, CIRCLE}

    class Piece {
        private Shape shape;
        private Size size;
        private Fill fill;
        private String color;
        private Paint paint;
        private boolean used;
        private int xPos;
        private int yPos;

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
        public void SetX(int x) {xPos = x;}
        public void SetY(int y) {yPos = y;}
        public boolean GetUsed(){return used;}
        public void SetUsed(boolean val){used = val;}
    }


  class Pieces {

      Piece[] availablePieces = new Piece[16];
      public Pieces()
      {
          for(int i=0; i<16; i++)
            for (int j = 0; j <=1; j++)
                for (int k = 0; j <=1; j++)
                    for (int l = 0; j <= 1; j++)
                        for (int m = 0; j <= 1; j++) {
                            if( m ==0)
                                availablePieces[i]= new Piece(Shape.values()[j],Size.values()[k],Fill.values()[l],"#FFFFFF");
                            else
                                availablePieces[i]= new Piece(Shape.values()[j],Size.values()[k],Fill.values()[l],"#000000");
                        }

      }
      /*
      Square Big Hollow Black       [0]
      Square Big Hollow White       [1]
      Square Big noHollow Black     [2]
      Square Big noHollow White     [3]
      Square Small Hollow Black     [4]
      Square Small Hollow White     [5]
      Square Small noHollow Black   [6]
      Square Small noHollow White   [7]
      Circle Big Hollow Black       [8]
      Circle Big Hollow White       [9]
      Circle Big noHollow Black     [10]
      Circle Big noHollow White     [11]
      Circle Small Hollow Black     [12]
      Circle Small Hollow White     [13]
      Circle Small noHollow Black   [14]
      Circle Small noHollow White   [15]
       */
}
//tristan is bestest