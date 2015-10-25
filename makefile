JFLAGS = -g 
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java
	
CLASSES = \
  fileshredder/ToRemove.java \
	fileshredder/Main.java \

default: jar

jar: classes
	jar cfe FileShredder.jar fileshredder.Main fileshredder/*.class

classes: $(CLASSES:.java=.class)

clean:
	$(RM) fileshredder/*.class
	$(RM) *.jar
