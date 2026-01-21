# Ecommerce Selenium Automation Framework 🚀

## 📌 Overview
This project is a Selenium automation framework built using **Java, TestNG, and Maven**  
It automates core user flows of a real-world e-commerce application.

Target application: https://automationexercise.com

![Java](https://img.shields.io/badge/Java-21-blue)
![Selenium](https://img.shields.io/badge/Selenium-4-green)
![Build](https://img.shields.io/badge/Build-Maven-orange)

---

## 🛠 Tech Stack
- Java 21
- Selenium WebDriver 4
- TestNG
- Maven
- Page Object Model (POM)
- PageFactory
- WebDriverManager

---
### 🧱 Framework Design
- **BasePage**: Centralizes PageFactory initialization
- **BaseTest**: Manages TestNG lifecycle methods
- **DriverFactory**: Provides thread-safe WebDriver instances
- **Tests**: Contain business-level test scenarios

---
## ▶ How to Run Tests
### Option 1: Using TestNG
- Right-click `testng.xml`
- Select **Run**

### Option 2: Using Maven
- use command "mvn clean test"

---
## 📁 Project Structure
```text
src
├── main
│   └── java
│       ├── base
│       │   └── BasePage.java
│       ├── pages
│       │   └── (Page Objects will be added here)
│       └── utils
│           └── DriverFactory.java
│
└── test
    └── java
        ├── base
        │   └── BaseTest.java
        └── tests
            └── LoginTest.java