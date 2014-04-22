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

package com.scott_weldon.chess.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import com.scott_weldon.chess.gamestate.Game;
import com.scott_weldon.chess.gamestate.Piece;
import com.scott_weldon.chess.manual_view.Polygons;
import com.scott_weldon.chess.manual_view.Chessboard;

public class Chess extends JFrame {
  //Set up frame.
  public static void main(String[] args) {
    Game game = new Game(); // Model
    Chessboard board = new Chessboard(game); // View
    JFrame frame = new Chess(board); // Controller

    frame.setVisible(true);
  }

  public Chess(Chessboard board) {
    this.addMouseListener(new MoveListener(board));
    this.add(board);
    this.setSize(500, 500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Chess");
  }
  
  class MoveListener implements MouseListener{
    private Chessboard board;

    public MoveListener(Chessboard board) {
      this.board = board;
    }

    //Watch for mouse clicks.
    public void mouseClicked(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      board.processClick(x, y);
    }

    public void mouseEntered(MouseEvent arg0) {
      // Do nothing
    }

    public void mouseExited(MouseEvent arg0) {
      // Do nothing
    }

    public void mousePressed(MouseEvent arg0) {
      // Do nothing
    }

    public void mouseReleased(MouseEvent arg0) {
      // Do nothing
    }
  }
}
