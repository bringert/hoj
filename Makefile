JAVAC = javac
JAVADOC = javadoc

LIB_SRC = util/*.java tuple/*.java fun/*.java num/*.java io/*.java lazy/*.java
SRC = $(LIB_SRC)

default all: $(SRC)
	mkdir -p build
	$(JAVAC) -source 1.5 -Xlint:unchecked -d build $(SRC)

clean:
	-rm -rf build/*

doc:
	$(JAVADOC) -source 1.5 -d javadoc $(LIB_SRC)
