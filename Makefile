JAVAC = javac
JAVADOC = javadoc

JAVACFLAGS = -source 1.5 -Xlint:unchecked

LIB_SRC = util/*.java tuple/*.java fun/*.java num/*.java io/*.java lazy/*.java
SRC = $(LIB_SRC) examples/*.java

default all: $(SRC)
	mkdir -p build
	$(JAVAC) $(JAVACFLAGS) -d build $(SRC)

clean:
	-rm -rf build/*

doc:
	$(JAVADOC) -source 1.5 -d javadoc $(LIB_SRC)
