all: Bishop.class Chess.class Chess$$MoveListener.class Game.class King.class Knight.class Pawn.class Piece.class Polygons.class Queen.class Rook.class Team.class

%.class: %.java
	javac $<
