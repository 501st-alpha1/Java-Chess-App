#SRC_ROOT=src/com/scott_weldon/chess
#BIN_ROOT=bin/com/scott_weldon/chess
SRC_ROOT=src/chess
BIN_ROOT=bin/chess
SRC_GAMESTATE=$(SRC_ROOT)/gamestate
BIN_GAMESTATE=$(BIN_ROOT)/gamestate
SRC_MANUAL_VIEW=$(SRC_ROOT)/manual_view
BIN_MANUAL_VIEW=$(BIN_ROOT)/manual_view
SRC_MAIN=$(SRC_ROOT)/main
BIN_MAIN=$(BIN_ROOT)/main

OBJECTS=Bishop.class Chess.class Chess$$MoveListener.class Game.class King.class Knight.class Pawn.class Piece.class Polygons.class Queen.class Rook.class Team.class

all:
	javac -d bin -sourcepath $(SRC_ROOT) $(SRC_ROOT)/*.java

#all: $(BIN_ROOT)/$(OBJECTS)
#all: $(BIN_GAMESTATE)/* $(BIN_MANUAL_VIEW)/* $(BIN_MAIN)/*

#$(BIN_ROOT)/%.class: $(SRC_ROOT)/%.java
#	javac -d bin -sourcepath $(SRC_ROOT) $<

#TODO
#There must be a better way to do this...
#$(BIN_GAMESTATE)/%.class: $(SRC_GAMESTATE)/%.java
#	javac -d $(BIN_GAMESTATE) -sourcepath $(SRC_GAMESTATE) $<

#$(BIN_MANUAL_VIEW)/%.class: $(SRC_MANUAL_VIEW)/%.java
#	javac -d $(BIN_MANUAL_VIEW) -sourcepath $(SRC_MANUAL_VIEW) $<

#$(BIN_MAIN)/%.class: $(SRC_MAIN)/%.java
#	javac -d $(BIN_MAIN) -sourcepath $(SRC_MAIN) $<

#$(BIN_ROOT)/gamestate/%.class: $(SRC_ROOT)/gamestate/%.java
#	javac -d $(BIN_ROOT)/gamestate -sourcepath $(SRC_ROOT)/gamestate $<
