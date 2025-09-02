# Employee Management System

A **Java-based desktop application** for managing employee records, built with **Java Swing** for the user interface and **MySQL** for database management. This project demonstrates full-stack development with Java, integrating front-end design, back-end logic, and persistent storage.

## 📌 Features

* Add, update, delete, and view employee details.
* Store and manage employee data in a **MySQL database**.
* GUI built with **Java Swing** for user-friendly interaction.
* Calendar/date-picker support (via JCalendar library).
* Input validation for reliable data management.

## 🛠️ Tech Stack

* **Language:** Java
* **Database:** MySQL
* **Libraries/Dependencies:**

  * `mysql-connector-java` (for DB connectivity)
  * `jcalendar` (for date selection)

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/employee_management_system.git
   cd employee_management_system
   ```

2. Import the project into your IDE (IntelliJ IDEA / Eclipse).

3. Import the database:

   * Create a MySQL database (e.g., `ems_db`).
   * Import the provided SQL schema if included.

4. Add required JAR files (in `lib/`):

   * `mysql-connector-java-8.x.jar`
   * `jcalendar-x.x.x.jar`

5. Run the application:

   ```bash
   java -jar employee_management_system.jar
   ```

## 📂 Project Structure

* `employee/management/system` → Source code (Java classes).
* `icons/` → Icons and images for the GUI.
* `settings.json` → Configuration (if applicable).
* `.jar files` → External libraries (MySQL Connector, JCalendar).

## 🔮 Future Enhancements

* Add user authentication & role-based access.
* Generate reports (PDF/Excel export).
* Cloud database support for remote access.
* Improved UI with modern frameworks (JavaFX).

## 📄 License

This project is licensed under the MIT License.
