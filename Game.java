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

/*
 * Game
 * Main state class (Model in MVC)
 */
import javax.swing.JPanel;

class Game extends JPanel {
  public Team white = new Team(Team.WHITE);
  public Team black = new Team(Team.BLACK);
  private int currentX = 0;
  private int currentY = 0;
  private Team currentTeam = white;
  private Piece[][] board = new Piece[8][8];
  //An array to keep track of which piece is on which square. "null" means the
  //square is empty.
  
  public Game() {
    //Initialize piece positions.
    this.board[0][0] = black.rookEast;
    this.board[1][0] = black.knightEast;
    this.board[2][0] = black.bishopEast;
    this.board[3][0] = black.queen;
    this.board[4][0] = black.king;
    this.board[5][0] = black.bishopWest;
    this.board[6][0] = black.knightWest;
    this.board[7][0] = black.rookWest;
    this.board[0][1] = black.pawn1;
    this.board[1][1] = black.pawn2;
    this.board[2][1] = black.pawn3;
    this.board[3][1] = black.pawn4;
    this.board[4][1] = black.pawn5;
    this.board[5][1] = black.pawn6;
    this.board[6][1] = black.pawn7;
    this.board[7][1] = black.pawn8;
    
    this.board[0][7] = white.rookWest;
    this.board[1][7] = white.knightWest;
    this.board[2][7] = white.bishopWest;
    this.board[3][7] = white.queen;
    this.board[4][7] = white.king;
    this.board[5][7] = white.bishopEast;
    this.board[6][7] = white.knightEast;
    this.board[7][7] = white.rookEast;
    this.board[0][6] = white.pawn1;
    this.board[1][6] = white.pawn2;
    this.board[2][6] = white.pawn3;
    this.board[3][6] = white.pawn4;
    this.board[4][6] = white.pawn5;
    this.board[5][6] = white.pawn6;
    this.board[6][6] = white.pawn7;
    this.board[7][6] = white.pawn8;
  }
  
  //Make sure the move is valid, and execute. This need improvement too.
  public void processMove(Piece p, int x, int y, Team team) {
    if ((team == white) && (currentTeam == white)) {
      if (p.getValidSquares(currentX, currentY, x, y, team, this.board)) {
        if ((p instanceof Pawn) && (y == 1)) {
          this.upgradePawn(p, team);
        }
        p.setX(x);
        p.setY(y);
        this.board[x - 1][y - 1] = p;
        this.board[currentX - 1][currentY - 1] = null;
        this.currentX = 0;
        this.currentY = 0;
        switchTeam();
      }
      else if (p.getAttackSquares(currentX, currentY, x, y, team, this.board)) {
        this.board[x - 1][y - 1].setStatus(false);
        p.setX(x);
        p.setY(y);
        this.board[x - 1][y - 1] = p;
        this.board[currentX - 1][currentY - 1] = null;
        this.currentX = 0;
        this.currentY = 0;
        switchTeam();
      }
      else {
        this.currentX = 0;
        this.currentY = 0;
      }
    }
    else if ((team == black) && (currentTeam == black)){
      if (p.getValidSquares(currentX, currentY, x, y, team, this.board)) {
        if ((p instanceof Pawn) && (y == 8)) {
          this.upgradePawn(p, team);
        }
        p.setX(x);
        p.setY(y);
        this.board[x - 1][y - 1] = p;
        this.board[currentX - 1][currentY - 1] = null;
        this.currentX = 0;
        this.currentY = 0;
        switchTeam();
      }
      else if (p.getAttackSquares(currentX, currentY, x, y, team, this.board)) {
        this.board[x - 1][y - 1].setStatus(false);
        p.setX(x);
        p.setY(y);
        this.board[x - 1][y - 1] = p;
        this.board[currentX - 1][currentY - 1] = null;
        this.currentX = 0;
        this.currentY = 0;
        switchTeam();
      }
      else {
        this.currentX = 0;
        this.currentY = 0;
      }
    }
    else {
      currentX = 0;
      currentY = 0;
    }
  }

  //Promote pawns to queens.
  public void upgradePawn(Piece pawn, Team team) {
    if (pawn instanceof Pawn) { //Just in case ;)
      pawn = new Queen(pawn.getX(), pawn.getY(), Piece.getWidth(), team.color);
    }
  }

  public void switchTeam() {
    if (this.currentTeam == this.white)
      this.currentTeam = this.black;
    else
      this.currentTeam = this.white;
  }

  public void setCurrentX(int x) {
    this.currentX = x;
  }
  
  public int getCurrentX() {
    return this.currentX;
  }

  public void setCurrentY(int y) {
    this.currentY = y;
  }
  
  public int getCurrentY() {
    return this.currentY;
  }

}
