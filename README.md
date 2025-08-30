# 📘 Exception Handling Project

## 📌 Overview
This program reads `.arxml` files containing a list of containers with:
- **ID**
- **Short Name**
- **Long Name**

It takes the file path as input, reorders the list **alphabetically by Short Name**, and writes a new file with the reordered list (at a modified path).

---

## ⚡ Exception Handling
The `src` folder contains 4 classes inside the **Exception Handling** package:

1. **Container**  
   - Creates containers with ID, Short Name, and Long Name.  

2. **EmptyAutosarFileException**  
   - Thrown when the input file is empty.  

3. **NotValidAutosarFileException**  
   - Thrown when the input file does not have an `.arxml` extension.  

4. **ExceptionHandling**  
   - `readFile(path)` → Reads the file, handles the above exceptions, and creates a list of containers.  
   - Sorting is performed in `main`.  
   - `writeFile(sortedList, path)` → Writes the sorted list to a new modified file (`mod.arxml`).  
   - May throw `ParserConfigurationException` & `TransformerException`.  

---

## 📂 Test Files (in `src` folder)
1. **EmptyFileCase.arxml** → Tests the `EmptyAutosarFileException`.  
2. **WrongFormatCase.txt** → Tests the `NotValidAutosarFileException`.  
3. **NormalCase.arxml** → Produces a modified file if the input is valid.  

---

## ▶️ Running the Program
A batch file is provided in the `dist` folder.

1. Run the batch file.  
2. The program will ask for the path of the `.arxml` file.  
3. Copy the path of one of the 3 test files and paste it in the program.  

⚠️ **Note:**  
- Ensure the path is correct.  
- Do **not** enclose the path in quotes (`"`).  

---
