(BootProj03MiniProjectHospitalManagementApplication README)
Project Overview:
This project is a Spring Boot application designed for managing hospital information. It allows you to retrieve hospital details based on specified locations (cities).

Prerequisites:
Before running this application, ensure you have the following installed:
Java Development Kit (JDK): Version 17 or higher.
Maven or Gradle: Build tool for managing dependencies and building the project.
Oracle Database: An Oracle database instance is required to store and retrieve hospital data.
Oracle JDBC Driver: The Oracle JDBC driver must be available in your project's classpath.

Usage:
Once the application is running, it will automatically execute the main method in BootProj03MiniProjectHospitalManagementApplication.java. This method:
Starts the Spring Boot application.
Retrieves a PayRollOperationController bean from the application context.
Calls the showallhospitalbydesg method on the controller, passing in the cities "Mumbai", "Bangalore", and "Chennai".
Prints the retrieved hospital information to the console.
Closes the application context.

Troubleshooting:
ORA-17190: Connection property format error:
This error indicates a problem with the Oracle JDBC driver's handling of connection properties.
Ensure you have added oracle.jdbc.v$session.program=DISABLED to your connection URL.
Verify your Oracle JDBC driver version.
ORA-17059: Failed to convert to internal representation:
This error indicates a data type mismatch between your Java code and the Oracle database.
Check the data types of your database columns and ensure they match the data types used in your Java code.
Inspect the SQL query in HospitalDaoImpl.getHospital() and the data in the result set.

NoSuchBeanDefinitionException:
This usually occurs when spring can't find a bean.
Verify that all of your components, services, and repositories are annotated with the correct Spring annotations (e.g., @Component, @Service, @Repository).
Ensure that your @ComponentScan annotation in your main application class is configured correctly.
Verify the bean names that you are using with the getBean() method.

Database Connection Issues:
Double-check your database connection properties for accuracy.
Ensure the Oracle database is running and accessible.
Verify that the Oracle JDBC driver is in your project's classpath.

