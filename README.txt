CSC 512 - Compiler Construction - Mayur Phadte (mmphadte)

Confirmed working on VCL node with Java 1.7.0.0_151

Instructions :
1. Install ANTLR.
1a. curl -O https://www.antlr.org/download/antlr-4.7.1-complete.jar
1b. export CLASSPATH="./antlr-4.7.1-complete.jar:$CLASSPATH"

2. Compile using JAVA.
2a. javac *.java

3. Run CustomParser
3a. java CustomParser

Output :
These files are created in the same folder :
1. Simple file - ordered_generated_simple.py
2. Multiplexing file - ordered_generated_multiplexing.py


Test cases :
Change line 15 in CustomParser.java to use the appropriate prototxt file and recompile.

1. test1.prototxt : Does not have have bn and scale layers for one of the convolution layers.
This throws an error with the name of the layer that is missing the bn-scale-relu layers and
the number of layers that are missing. If a layer does not have all 3 then an error is not
thrown as the last layer in the input file does not have these 3.

2. test2.prototxt : The order of layers has been messed up on purpose in this file and it can be
seen from the output that the topology of the layers is still retained.

3. test3.prototxt : The first layer has been placed at the end of the file. The first convolution
layer can be put anywhere in the file and it will show up in the correct order and proper first
parameter in the slim.conv2d function. (slim.conv2d(input,...) instead of slim.conv2d(net,...)) as
is the case with other convolution layers.
