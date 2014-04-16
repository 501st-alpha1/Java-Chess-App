/* Chess
 * Copyright (C) 2010-2014 Scott Weldon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

//package com.scott_weldon.chess.gamestate;
package chess;

import java.util.ArrayList;

public class Team {
  public King king;
  public Queen queen;
  public Bishop bishopWest;
  public Bishop bishopEast;
  public Knight knightWest;
  public Knight knightEast;
  public Rook rookWest;
  public Rook rookEast;
  public Piece pawn1;
  public Piece pawn2;
  public Piece pawn3;
  public Piece pawn4;
  public Piece pawn5;
  public Piece pawn6;
  public Piece pawn7;
  public Piece pawn8;
  public int color;
  public ArrayList<Piece> pieces;
  
  public final static int WHITE = 0;
  public final static int BLACK = 1;
  
  //Create new pieces and place them in their proper position, depending on the
  //team color.
  public Team(int color) {
    pieces = new ArrayList<Piece>();
    this.color = color;
    if (color == WHITE) {
      this.king = new King(5, 8, 40, Piece.WHITE);
      this.queen = new Queen(4, 8, 40, Piece.WHITE);
      this.rookWest = new Rook(1, 8, 40, Piece.WHITE);
      this.rookEast = new Rook(8, 8, 40, Piece.WHITE);
      this.knightWest = new Knight(2, 8, 40, Piece.WHITE);
      this.knightEast = new Knight(7, 8, 40, Piece.WHITE);
      this.bishopWest = new Bishop(3, 8, 40, Piece.WHITE);
      this.bishopEast = new Bishop(6, 8, 40, Piece.WHITE);
      this.pawn1 = new Pawn(1, 7, 40, Piece.WHITE);
      this.pawn2 = new Pawn(2, 7, 40, Piece.WHITE);
      this.pawn3 = new Pawn(3, 7, 40, Piece.WHITE);
      this.pawn4 = new Pawn(4, 7, 40, Piece.WHITE);
      this.pawn5 = new Pawn(5, 7, 40, Piece.WHITE);
      this.pawn6 = new Pawn(6, 7, 40, Piece.WHITE);
      this.pawn7 = new Pawn(7, 7, 40, Piece.WHITE);
      this.pawn8 = new Pawn(8, 7, 40, Piece.WHITE);
    }
    if (color == BLACK) {
      this.king = new King(5, 1, 40, Piece.BLACK);
      this.queen = new Queen(4, 1, 40, Piece.BLACK);
      this.rookWest = new Rook(8, 1, 40, Piece.BLACK);
      this.rookEast = new Rook(1, 1, 40, Piece.BLACK);
      this.knightWest = new Knight(7, 1, 40, Piece.BLACK);
      this.knightEast = new Knight(2, 1, 40, Piece.BLACK);
      this.bishopWest = new Bishop(6, 1, 40, Piece.BLACK);
      this.bishopEast = new Bishop(3, 1, 40, Piece.BLACK);
      this.pawn1 = new Pawn(1, 2, 40, Piece.BLACK);
      this.pawn2 = new Pawn(2, 2, 40, Piece.BLACK);
      this.pawn3 = new Pawn(3, 2, 40, Piece.BLACK);
      this.pawn4 = new Pawn(4, 2, 40, Piece.BLACK);
      this.pawn5 = new Pawn(5, 2, 40, Piece.BLACK);
      this.pawn6 = new Pawn(6, 2, 40, Piece.BLACK);
      this.pawn7 = new Pawn(7, 2, 40, Piece.BLACK);
      this.pawn8 = new Pawn(8, 2, 40, Piece.BLACK);
    }
    
    pieces.add(this.king);
    pieces.add(this.queen);
    pieces.add(this.rookEast);
    pieces.add(this.rookWest);
    pieces.add(this.knightEast);
    pieces.add(this.knightWest);
    pieces.add(this.bishopEast);
    pieces.add(this.bishopWest);
    pieces.add(this.pawn1);
    pieces.add(this.pawn2);
    pieces.add(this.pawn3);
    pieces.add(this.pawn4);
    pieces.add(this.pawn5);
    pieces.add(this.pawn6);
    pieces.add(this.pawn7);
    pieces.add(this.pawn8);
  }

}
