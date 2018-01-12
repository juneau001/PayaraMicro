
# Using the Payara Micro 5 snapshot build.
FROM payara/micro:5-SNAPSHOT

# Maintainer of the Image
MAINTAINER Josh Juneau "juneau001@gmail.com"

# Downloads the Apache Derby Client library
RUN wget -O /opt/payara/deployments/database-connector.jar http://central.maven.org/maven2/org/apache/derby/derbyclient/10.14.1.0/derbyclient-10.14.1.0.jar

# Sets database connection environment variables
ENV DOCKER_HOST docker.for.mac.localhost
ENV DB_NAME ACME
ENV DB_USER acmeuser
ENV DB_PASSWORD yourpassword

# Adds an application
COPY EmployeeService-1.0.war /opt/payara/deployments

# Default command to execute
ENTRYPOINT ["java", "-jar", "/opt/payara/payara-micro.jar", "--addJars", "/opt/payara/deployments/database-connector.jar", "--deploy", "/opt/payara/deployments/EmployeeService-1.0.war"]
