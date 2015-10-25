JFLAGS = -g 
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java
	
CLASSES = \
  fileshredder/ToRemove.java \
	fileshredder/Main.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) fileshredder/*.class
