all: bin/*
#all: Bishop.class Chess.class Chess$$MoveListener.class Game.class King.class Knight.class Pawn.class Piece.class Polygons.class Queen.class Rook.class Team.class

bin/%.class: src/%.java
	javac -d bin -sourcepath src $<
