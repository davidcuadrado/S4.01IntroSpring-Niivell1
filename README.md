📄 Description

This project serves as an introduction to Spring Boot, demonstrating how to build a basic web application with database access using JPA.

💻 Technologies Used

Eclipse IDE 2024-03

Spring Boot 3.3.4


📋 Prerequisites

Java 17 or higher

Maven 3.6 or newer


🛠️ Installation
Clone the repository:
> git clone <REPOSITORY_URL>
Navigate to the project directory:
> cd project-name
Build the project using Maven:
> mvn clean install

▶️ Execution

You can run the application locally using Maven or the generated JAR file.

With Maven:
> mvn spring-boot:run
Or run the JAR file directly:
> java -jar target/filename.jar

🔑 Key Features
REST API: This project provides RESTful endpoints to manage resources via HTTP.
Data Access with JPA: It uses Spring Data JPA to interact with a relational database.

🌐 Deployment
Steps for deployment:
1. Build the application: Ensure the application is properly built by generating an executable JAR:
> mvn clean package
2. Prepare the environment:
· Ensure a Java Runtime Environment (JRE) compatible with Java 17 or higher is available.

· Set up a database (if necessary) and configure the application.properties file (e.g., database URL, credentials).

3. Deploying on Cloud/VM: Run the built JAR file directly on a VM or cloud platform:
> java -jar target/filename.jar
4. Containerized Deployment (Optional):

· Build the Docker image:
> mvn spring-boot:build-image
· Run the Docker container:
> docker run -p 8080:8080 your-image-name
5. CI/CD Integration
To automate the deployment process, integrate the repository with a CI/CD pipeline using tools like GitHub Actions, Jenkins, or GitLab CI.


🤝 Contributing
1. Fork the repository
2. Create a new branch:
> git checkout -b feature/new-feature
3. Make your changes and commit them:
>git commit -m 'Add new feature'
4. Push to the branch:
> git push origin feature/new-feature
5. Create a pull request


🔗 Useful links
· Spring Boot – Introduction to RESTful Web Services: https://www.geeksforgeeks.org/spring-boot-introduction-to-restful-web-services/
· ¿Qué es una API REST?: https://www.ibm.com/es-es/topics/rest-apis