🧪 OrangeHRM Automation Testing Framework
Cucumber | Selenium | Java
📌 Introduction

This repository contains a BDD-based automation testing framework for the OrangeHRM application, developed using Cucumber, Selenium WebDriver, and Java.
The framework automates Login and Dashboard functionalities and is designed to be scalable, readable, and easy to maintain.

🎯 Objectives

Automate OrangeHRM Login and Dashboard pages

Follow Behavior Driven Development (BDD) approach

Implement Page Object Model (POM)

Provide reusable and maintainable test code

Support CI/CD execution using Maven & Jenkins

🧰 Tech Stack
Tool / Technology	Description
Java	Programming language
Selenium WebDriver	Browser automation
Cucumber	BDD framework
TestNG	Test execution
Maven	Build & dependency management
POM	Design pattern
Jenkins	Continuous Integration (optional)
🗂️ Project Structure
OrangeHRM-Cucumber-Automation
│
├── src/main/java
│   ├── pages
│   │   ├── LoginPage.java
│   │   └── DashboardPage.java
│   ├── utils
│   │   ├── DriverFactory.java
│   │   └── ConfigReader.java
│
├── src/test/java
│   ├── stepdefinitions
│   │   ├── LoginSteps.java
│   │   └── DashboardSteps.java
│   ├── runners
│   │   └── TestRunner.java
│
├── src/test/resources
│   ├── features
│   │   ├── login.feature
│   │   └── dashboard.feature
│   ├── config
│   │   └── config.properties
│
├── pom.xml
└── README.md

🧪 Test Scenarios Covered
🔐 Login Page

Login with valid credentials

Login with invalid credentials

Error message validation

Empty username/password validation

📊 Dashboard Page

Dashboard page visibility after successful login

Validation of dashboard elements

Logout functionality

📝 Sample Feature File
Feature: OrangeHRM Login Functionality

  Scenario: Login with valid credentials
    Given user is on OrangeHRM login page
    When user enters valid username and password
    And clicks on login button
    Then user should be navigated to dashboard page

⚙️ Configuration

Update the config.properties file:

browser=chrome
baseUrl=https://opensource-demo.orangehrmlive.com/
username=Admin
password=admin123

▶️ How to Execute Tests
✅ Prerequisites

Java JDK 8 or above

Maven installed

Chrome browser

IDE (IntelliJ IDEA / Eclipse)

▶️ Run Using Maven
mvn clean test

▶️ Run Using Test Runner

Navigate to TestRunner.java

Right-click → Run

📊 Reports

Cucumber HTML Report

TestNG Report

📁 Reports generated under:

target/

🌟 Framework Highlights

✔ BDD with Cucumber
✔ Page Object Model (POM)
✔ Easy configuration management
✔ Maven-based execution
✔ CI/CD ready
✔ Beginner-friendly & interview-ready

🔮 Future Enhancements

Cross-browser execution

Parallel test execution

Allure reporting

API automation integration

Docker support

👩‍💻 Author

Maithili Patil
QA Automation Engineer

📌 Note

This framework is created for learning, practice, and demonstration purposes using the OrangeHRM demo application.
