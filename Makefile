JDK15=/usr/local/java/j2sdk1.5.0

JAVAC=$(JDK15)/bin/javac
JAVADOC=$(JDK15)/bin/javadoc
LIB_SRC=util/*.java tuple/*.java fun/*.java num/*.java io/*.java lazy/*.java
SRC=$(LIB_SRC)

default all: $(SRC)
	$(JAVAC) -source 1.5 -warnunchecked -d build $(SRC)

clean:
	-rm -rf build/*

doc:
	$(JAVADOC) -source 1.5 -d javadoc $(LIB_SRC)
