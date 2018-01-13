# Payara Micro Examples
Examples for use with Java Magazine article

Dockerfile downloads Apache Derby client driver and sets environment variables for creating the data connection.

Standard Configuration
----------------------

Run the SQL script on an Apache Derby database that is installed on the host machine to load the schema.  Then
modify the Dockerfile environment variables in order to connect to the database from within the container.

Build the sources for the EmployeeService using Maven to create the *EmployeeService-1.0.war* file.

*Build:*  <pre>docker build employeeservice:1.0 .</pre>

*Run:*    <pre>docker run -d -p 8080:8080 --name employeeservice employeeservice:1.0</pre>
