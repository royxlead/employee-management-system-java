# 🗂️ Employee Management System (Java)

A desktop application built in **Java Swing** for managing employee records, seamlessly integrated with **MySQL**. This project demonstrates full-stack essentials: a graphical front-end, database integration, and real-world CRUD functionality.

## 📌 Features

* **CRUD Operations** – Add, update, delete, and view employee information.
* **MySQL Database Integration** – Stores all employee details persistently.
* **Interactive GUI** – Built with Java Swing for a user-friendly experience.
* **Date Picker Support** – JCalendar integration for selecting dates (e.g. joining date).
* **Input Validation** – Ensures correct data entry before saving to the database.

## ⚙️ Tech Stack

| Component     | Details                             |
| ------------- | ----------------------------------- |
| **Language**  | Java                                |
| **Database**  | MySQL                               |
| **Libraries** | `mysql-connector-java`, `jcalendar` |

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/royxlead/employee-management-system-java.git
cd employee-management-system-java
```

### 2. Import into IDE

* Use **IntelliJ IDEA**, **Eclipse**, or any Java IDE.
* Add the included JARs (`mysql-connector-java`, `jcalendar`) to your project classpath.

### 3. Configure the Database

* Create a MySQL database, e.g. `ems_db`.
* Import the provided schema (if available) or create a simple employee table with fields like `id`, `name`, `dob`, `designation`, etc.

### 4. Run the Application

* From your IDE, run the main class.
* Or via terminal:

  ```bash
  java -jar employee_management_system.jar
  ```

The GUI will launch, and you can begin managing employee records.

## 📂 Project Structure

```
employee-management-system-java/
├── employee/management/system/   # Core Java source code
├── icons/                        # GUI icons and image assets
├── libs/                         # External JARs (MySQL connector, JCalendar)
├── README.md                     # Documentation
└── LICENSE                       # MIT license
```

## 🔮 Future Enhancements

* Add **user authentication** (admin, HR, employee roles).
* **Export reports** as PDF/Excel.
* Migrate GUI to **JavaFX** for a modern look.
* Add **search, filter, and sort** features.
* Enable **cloud database support** for remote use.
