# FILE-HANDLING-UTILITY

**COMPANY**: CODETECH IT SOLUTIONS

**NAME**: Patil Mayuresh Pratap

**INTERN ID**:CT08ICW

**DOMAIN**:JAVA

**BATCH DURATION**:December 30th, 2024 to January 30th, 2025

**MENTOR NAME**:NEELA SANTOSH

#DESCRIPTION

This Java program demonstrates basic file operations: reading, writing, and modifying text files. It utilizes Java's java.io package to handle file input and output operations efficiently, making it a robust solution for basic file management tasks.

**Features**

Write to a File: Overwrites or creates a new text file with the provided content.

Read a File: Reads and prints the content of the file to the console.

Append to a File: Adds new content to the existing file without overwriting it.

**Libraries Used**

1. java.io Package

The java.io package provides essential classes for file handling in Java. The key classes used in this program include:
BufferedWriter: Used for writing text to a file in an efficient manner. It buffers characters to improve performance, especially for large files.
BufferedReader: Used for reading text from a file. It reads data line by line, making it suitable for structured text processing.
FileWriter: Facilitates writing characters to a file. It can be configured for overwriting or appending mode.
FileReader: Reads character streams from a file. It works seamlessly with BufferedReader for efficient file reading.
These classes ensure reliable file operations, including automatic resource management when used with try-with-resources.

2. Error Handling (IOException)
The program employs Java's IOException class to manage input/output errors gracefully. This ensures that runtime errors such as missing files or insufficient permissions are handled without crashing the program.

**Resources Used**

1. Integrated Development Environment (IDE):
Eclipse IDE: The program is designed to be easily run and managed in Eclipse. Eclipse provides a structured environment for coding, compiling, and debugging Java programs, making it beginner-friendly and efficient for developers.

2. Documentation and Tutorials:

Official Java SE Documentation: This serves as the primary reference for understanding the java.io package and related classes.
Online Tutorials and Guides:
TutorialsPoint: Comprehensive explanations of file handling in Java.
GeeksForGeeks: Examples and code snippets for BufferedWriter and BufferedReader.

3. Version Control:
GitHub: The project can be stored in a GitHub repository for version control and easy sharing. This encourages collaboration and ensures code security.

4. Learning Resources:
YouTube: Video tutorials explaining Java file handling concepts.
ChatGPT: Used for detailed explanations and troubleshooting during program development.

**How to Run the Program**

Prerequisites

Install the Java Development Kit (JDK) on your machine.

Download from Oracle's Java Downloads.

Install an IDE like Eclipse or IntelliJ IDEA.

Steps to Run in Eclipse

Open Eclipse and create a new Java Project:

Go to File > New > Java Project.

Name the project (e.g., FileHandlingProject).

Create a new Java Class:

Right-click on the src folder > New > Class.

Name the class FileHandlingUtility.

Check the option to include public static void main(String[] args).

Copy and paste the provided code into the class.

Create a text file:

Right-click on the project > New > File.

Name the file example.txt.

(Optional) Add initial content to the file.

**OUTPUT**

![OUTPUT](https://github.com/user-attachments/assets/456ffa9e-8371-4a32-b265-998e9a0fa612)

Update the filePath in the code if necessary to match the location of example.txt.

Run the program:

Right-click anywhere in the code editor > Run As > Java Application.
