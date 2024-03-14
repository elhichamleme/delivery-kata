# Running the  Project

This guide will walk you through the steps required to run this project 

## Prerequisites

Before running the project, ensure you have the following installed:

- Java Development Kit (JDK) 21 or later
- Maven (for building the project)

## Steps to Run

1. **Clone the Project**: Start by cloning the project repository from GitHub using the following command:

    ```bash
    git clone https://github.com/elhichamleme/delivery-kata
    ```

2. **Navigate to Project Directory**: Enter into the project directory using the `cd` command:

    ```bash
    cd delivery-kata
    ```

3. **Build the Project**: Use Maven to build the project. Run the following command:

    ```bash
    mvn clean install
    ```

4. **Run the Application**: Once the project is built successfully, you can run the application using Maven. Execute the following command:

    ```bash
    mvn spring-boot:run
    ```

5. **Access the Application**: Once the application has started, you can access it through a web browser or API client. By default, Spring Boot applications run on port 8080. Open your web browser and navigate to [http://localhost:8080](http://localhost:8080) to access the application.

6. **Stopping the Application**: To stop the application, you can press `Ctrl + C` in the terminal where the application is running.

## Additional Notes

- If the default port 8080 is already in use, you can specify a different port by modifying the `application.properties` file or using command-line arguments.

- Make sure to configure any necessary environment variables or external dependencies as per your project requirements.

- Refer to the project documentation or README file for specific instructions related to this project.

That's it! You have successfully run the Spring Boot 3.2 project.
