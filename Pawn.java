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

public class Pawn extends Piece {
  public Pawn() {
    super();
    super.setType(Piece.PAWN);
  }
  
  public Pawn(int x, int y, int w) {
    super(x, y, w);
    super.setType(Piece.PAWN);
  }
  
  public Pawn(int x, int y, int w, int team) {
    super(x, y, w, team);
    super.setType(Piece.PAWN);
  }
  
  public boolean getValidSquares(int oldX, int oldY, int newX, int newY,
      Team team, Piece[][] board) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if (team.color == Team.WHITE) {
      if ((dx == 0) && (dy == -1) && board[newX - 1][newY - 1] == null) {
        return true;
      }
      else if (((dx == 0) && (oldY == 7) && (newY == 5)) &&
          board[newX - 1][newY - 1] == null
          && board[newX - 1][newY - 2] == null) {
        return true;
      }
      else {
        return false;
      }
    }
    else {
      if ((dx == 0) && (dy == 1) && board[newX - 1][newY - 1] == null) {
        return true;
      }
      else if (((dx == 0) && (oldY == 2) && (newY == 4)) &&
          board[newX - 1][newY - 1] == null
          && board[newX - 1][newY - 2] == null) {
        return true;
      }
      else {
        return false;
      }
    }
  }

  public boolean getAttackSquares(int oldX, int oldY, int newX, int newY,
      Team team, Piece[][] board) {
    int dx = newX - oldX;
    int dy = newY - oldY;
    
    if (team.color == Team.WHITE) {
      if (((dx == 1) || (dx == -1)) && (dy == -1)
          && (board[newX - 1][newY - 1] != null)
          && (board[newX - 1][newY - 1].getTeam() != team.color)) {
        return true;
      }
    }
    else {
      if (((dx == 1) || (dx == -1)) && (dy == 1)
          && (board[newX - 1][newY - 1] != null)
          && (board[newX - 1][newY - 1].getTeam() != team.color)) {
        return true;
      }
    }
    
    return false;
  }
}
