SRC_ROOT=src/com/scott_weldon/chess
BIN_ROOT=bin/com/scott_weldon/chess

SRC_GAMESTATE=$(SRC_ROOT)/gamestate
BIN_GAMESTATE=$(BIN_ROOT)/gamestate
SRC_MANUAL_VIEW=$(SRC_ROOT)/manual_view
BIN_MANUAL_VIEW=$(BIN_ROOT)/manual_view
SRC_MAIN=$(SRC_ROOT)/main
BIN_MAIN=$(BIN_ROOT)/main

OBJECTS=Bishop.class Chess.class Chess$$MoveListener.class Game.class King.class Knight.class Pawn.class Piece.class Polygons.class Queen.class Rook.class Team.class

all: state manual_view main

state:
	javac -d bin -classpath bin -sourcepath $(SRC_GAMESTATE) \
		$(SRC_GAMESTATE)/*.java

manual_view:
	javac -d bin -classpath bin -sourcepath $(SRC_MANUAL_VIEW) \
		$(SRC_MANUAL_VIEW)/*.java

main:
	javac -d bin -classpath bin -sourcepath $(SRC_MAIN) \
		$(SRC_MAIN)/*.java

clean:
	rm -v $(BIN_GAMESTATE)/*.class $(BIN_MANUAL_VIEW)/*.class \
		$(BIN_MAIN)/*.class
