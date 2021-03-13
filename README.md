# indexer

a Java program that can compile the index for a book from the notes that the indexer makes as she reads and re-reads
the paginated galleys.

Program reads in an indexer’s notes from a text file specified on the command
line , compiles the index, and writes it out to standard output (System.out).
Whoever prepares the input file is supposed to make sure that each line of the input file is
empty, which in this case that line is not processed , or contains
an indexer’s note. This note consists of a page number, a colon, a space, and either a heading
(which starts with an uppercase letter) or a heading, a slash, and a sub-heading (which starts with
a lowercase letter)  It is assumed that the text of a heading or sub-heading will never contain either a colon or a slash.
If the program encounters a line in the input file that does not have the right structure, it
echoes that line to System.err and specifies why the line does not have the right structure. Then,
the program leaves the line out of the index and continues processing the next line of the input file
(instead of , say, crashing). System.err echoes the wrong structures using
the following cases:
• A line does not have a colon :.
• A heading does not start with an uppercase letter.
• A sub-heading does not start with a lowercase letter.
• There is no space after colon or there are more than one space after colon.
