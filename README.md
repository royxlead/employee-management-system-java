## Employee Management System

An **Employee Management System** developed in Java with MySQL integration, featuring a user-friendly interface built using Java Swing. This project simplifies employee record management with essential functionalities like adding, removing, and updating employee details.

## Features

- **Add Employee**: Add new employee records with details such as name, contact, designation, and more.
- **Remove Employee**: Remove employee records securely.
- **Update Employee Details**: Modify existing employee information.
- **View Employees**: Display a list of all employees in the database.
- **Database Integration**: Uses MySQL for data storage and retrieval.
- **Secure Operations**: Prevents SQL injection by using PreparedStatements for database queries.
- **User-Friendly Interface**: Built with Java Swing for a clean and intuitive UI.

## Repository

GitHub Repository: [Employee Management System](https://github.com/heysouravroy/employee_management_system.git)

## Table Structure

The application uses a MySQL `employee` table with the following structure:

| Column Name | Data Type       | Attributes                  |
|-------------|-----------------|-----------------------------|
| empId       | INT            | Primary Key, Auto Increment |
| name        | VARCHAR(40)    | NOT NULL                    |
| fname       | VARCHAR(40)    |                             |
| dob         | DATE           |                             |
| salary      | DECIMAL(10, 2) |                             |
| address     | VARCHAR(100)   |                             |
| phone       | VARCHAR(15)    |                             |
| email       | VARCHAR(50)    |                             |
| designation | VARCHAR(40)    |                             |
| aadhar      | VARCHAR(12)    | UNIQUE                      |

## Prerequisites

Before running this project, ensure you have the following:

- **Java Development Kit (JDK)** 8 or higher.
- **MySQL Server** installed and running.
- MySQL JDBC Driver (`mysql-connector-java.jar`) added to your project.
- Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans.

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/heysouravroy/employee_management_system.git
   cd employee_management_system
   ```

2. **Configure the Database**:
   - Create a database in MySQL:
     ```sql
     CREATE DATABASE EmployeeManagement;
     ```
   - Use the `employee` table structure mentioned above.
   - Insert sample data if necessary.

3. **Update Database Credentials**:
   - Open the `DatabaseConnection.java` file.
   - Update the following variables:
     ```java
     private static final String DB_URL = "jdbc:mysql://localhost:3306/EmployeeManagement";
     private static final String DB_USER = "your_username";
     private static final String DB_PASSWORD = "your_password";
     ```

4. **Run the Application**:
   - Compile and run the `Main.java` file in your IDE.

## Usage

1. Launch the application.
2. Use the menu to add, remove, update, or view employee records.
3. Ensure all fields are filled correctly to avoid validation errors.

## Technologies Used

- **Java**: Core programming language for development.
- **Java Swing**: GUI framework for building the user interface.
- **MySQL**: Database for storing employee records.
- **JDBC**: To connect and interact with the database.

## Contributing

Contributions are welcome! If you would like to add new features or fix bugs, please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

For queries or feedback, feel free to contact me at [heysouravro@icloud.com](mailto:heysouravro@icloud.com).

---
⭐ If you found this project helpful, give it a star!
```
