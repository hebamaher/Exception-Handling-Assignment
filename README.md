# Exception-Handling-Assignment
This program reads ARXML files containing a list of containers that have ID, Short Name and Long Name by passing the file path and reordering the list alphapetically by the Short Name then writes new file containing the reordered list with modified path
The Exception Handling folder contains 
4 classes in src folder: 
  1.Container Class for creating containers with ID, Short Name, Long Name 
  2.EmptyAutosarFileException for declaring an exception in case of empty file 
  3.NotVaildAutosarFileException for declaring an exception in case of non arxml file extenstion 
  4.Exception Handling Class that has readfile method that takes the file path as a parameter also handling the mentioned exceptions by printing the stack trace and create a list of containers that have the values passed in the file , sorting it in the main,  and creating new modified file (mod.armxl) by writeFile method that takes the sorted list & the file path as parameters also thows ParserConfigurationException & TransformerException
3 files in src folder: 1.EmptyFileCase.arxml that tests the EmptyAutosarFileException 2.WrongFormatCase.txt that tests the NotVaildAutosarFileException 3.NormalCase.arxml that produce the modified file if the input is correct
batch file in dist folder you can run the program in the batch file the program will ask for the path of the .arxml file you want to provide, you can copy the path of one of the 3 files mentioned above and pasting it in the program make sure the path is right and is not between " ".
