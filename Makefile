J2SE14=/usr/local/java/jdk
JSR14DISTR=/usr/local/java/j2sdk1.5.0

export J2SE14 JSR14DISTR

JAVAC=/usr/local/java/j2sdk1.5.0/bin/javac
JAVA=$(J2SE14)/bin/java -Xbootclasspath/p:$(JSR14DISTR)/gjc-rt.jar
SRC=examples/*.java util/*.java tuple/*.java fun/*.java num/*.java io/*.java \
    lazy/*.java #sfl/*.java

default all: $(SRC)
	$(JAVAC) -source 1.5 -warnunchecked -d build $(SRC)

clean:
	-rm -rf build/*

javadoc:
	javadoc -d javadoc $(SRC)

demo:
	$(JAVA) -cp build demo foo bar