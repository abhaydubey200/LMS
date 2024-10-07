# Library Management System

This **Library Management System** is a Java-based console application that allows users to manage library operations such as adding/removing books and students, issuing and returning books, and saving/loading data using file I/O.

## Features
- **Add Books**: Users can add new books to the library.
- **Remove Books**: Remove books from the library using their unique ID.
- **Display Books**: View the list of all books available in the library.
- **Add Students**: Users can add student information.
- **Remove Students**: Remove student records by ID.
- **Display Students**: View the list of all students registered in the system.
- **Issue Books**: A student can borrow a book, provided it's available.
- **Return Books**: A student can return a borrowed book.
- **Data Persistence**: Save all books and students data to files and load them on startup.

## Project Structure

```plaintext
LMS/
│
├── src/
│   ├── models/
│   │   ├── Book.java           # Book class representing each book in the library
│   │   └── Student.java        # Student class representing each student
│   │
│   ├── managers/
│   │   ├── BookManager.java    # Manages all book-related operations
│   │   └── StudentManager.java # Manages all student-related operations
│   │
│   └── utils/
│       └── FileManager.java    # Handles file saving and loading operations for persistence
│
├── bin/                        # Directory where compiled classes will be stored
│
├── README.md                   # Project documentation (this file)
└── LibraryManagementSystem.java # Main class with menu-driven interaction
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 17 or above.
- A terminal/command prompt or an IDE like Eclipse, IntelliJ IDEA, or NetBeans.

### Installation

1. **Clone the Repository**
   
   Clone this repository to your local machine using:

   ```bash
   git clone <repository-url>
   ```

2. **Navigate to the Project Directory**

   ```bash
   cd LMS
   ```

3. **Compile the Project**

   Use the following command to compile the project:

   ```bash
   javac -d bin -sourcepath src src/LibraryManagementSystem.java
   ```

4. **Run the Application**

   After compiling, run the application with the following command:

   ```bash
   java -cp bin LibraryManagementSystem
   ```

### Usage

1. After running the application, a menu will be displayed with options to:
   - Add/Remove Books.
   - Add/Remove Students.
   - Issue/Return Books.
   - Save data and exit the application.

2. Enter the corresponding option number to perform actions. Follow on-screen prompts to input details such as book ID, title, author, student ID, and name.

### Example

```plaintext
--- Library Management System ---
1. Add Book
2. Remove Book
3. Display All Books
4. Add Student
5. Remove Student
6. Display All Students
7. Issue Book
8. Return Book
9. Save & Exit
Enter your choice: 
```

## Data Persistence

- The system saves book data to `books.dat` and student data to `students.dat` files.
- On startup, the system loads this data to maintain previous records.

## Contributing

Contributions are welcome! To contribute:

1. Fork this repository.
2. Create a new branch for your feature or bugfix (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add feature'`).
4. Push to your branch (`git push origin feature-branch`).
5. Create a pull request.

## Contact

For any questions or feedback, feel free to reach out to me at:- dubeyabhay430@gmail.com 
```

### Adjustments to Make:
- https://github.com/abhaydubey200/LMS
- dubeyabhay430@gmail.com 
