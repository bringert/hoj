JDK15=/usr/local/java/j2sdk1.5.0

JAVAC=$(JDK15)/bin/javac
SRC=examples/*.java util/*.java tuple/*.java fun/*.java num/*.java io/*.java \
    lazy/*.java

default all: $(SRC)
	$(JAVAC) -source 1.5 -warnunchecked -d build $(SRC)

clean:
	-rm -rf build/*

javadoc:
	javadoc -d javadoc $(SRC)
