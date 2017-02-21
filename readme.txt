This is a small writeup for the OVAL comparer authored by Brett Gurman, Hardik Jhaveri, and Rujuta Palande. 

Our basic approach was to create classes for each of the non-terminal elements in both the definition schema and the system configuration schema, as well as a few additional classes for our results schema. After then annotating these classes with the appropriate XML decorator tags, Java-built-in-functions marshall and unmarshall allowed us to trivially go from a definitions or SC file to plain java objects, or vice versa.

With marshalling and unmarshalling out of the way, the only component left is making the actual comparisons between the values found in the definitions file. Currently, this part is completed to work for files with only one definition. Support for multiple definitions is coming Soon™.

To run this program, simply run ResMain.java, which will produce a results file derived from comparing the definitions file provided with the system characteristic file provided. If you wish to use a different set of files, change the values DEF_FILE (line 11, JAXBApp.java) and SC_FILE (line 13, mainClass.java)