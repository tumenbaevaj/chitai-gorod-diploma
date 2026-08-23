# UI Autotests for Chitai-Gorod

<p align="center">
  <a href="https://www.chitai-gorod.ru/">
    <img src="media/logo.jpg"
         alt="Chitai-Gorod logo"
         width="150">
  </a>
</p>

This project is designed to automate UI testing of the [Chitai-Gorod](https://www.chitai-gorod.ru/) online bookstore.

## Test Coverage

The project includes seven automated UI test cases:

- opening the home page;
- opening the catalog;
- entering a book title in the search field;
- searching for the author “Чингиз Айтматов”;
- searching for the book “Белый пароход”;
- searching for the book “Джамиля” using a parameterized test;
- searching for the book “Плаха” using a parameterized test.

## Technologies

<p align="center">
  <img width="55" title="IntelliJ IDEA" alt="IntelliJ IDEA"
       src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg">
  <img width="55" title="Java" alt="Java"
       src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg">
  <img width="55" title="Gradle" alt="Gradle"
       src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg">
  <img width="55" title="JUnit 5" alt="JUnit 5"
       src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg">
  <img width="55" title="GitHub" alt="GitHub"
       src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg">
  <img width="55" title="Jenkins" alt="Jenkins"
       src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg">
  <img width="55" title="Jira" alt="Jira"
       src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jira/jira-original.svg">
  <img width="55" title="Telegram" alt="Telegram"
       src="https://cdn.simpleicons.org/telegram/26A5E4">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Selenide-46A834?style=for-the-badge">
  <img src="https://img.shields.io/badge/Selenoid-00AEEF?style=for-the-badge">
  <img src="https://img.shields.io/badge/Allure_Report-F4A261?style=for-the-badge">
  <img src="https://img.shields.io/badge/Allure_TestOps-8A2BE2?style=for-the-badge">
</p>

## Running the Tests

The following command is used to run the tests locally on Windows:

```powershell
.\gradlew clean test
```

## Remote Test Execution in Jenkins

Selenoid is used for remote test execution in Jenkins.

### [Open Jenkins Job](https://jenkins.qa.guru/view/java-students/job/hw_14_chitai_gorod/)

The following command is used to run the tests in Jenkins:

```text
clean test
```

![Jenkins Build](media/jenkins.jpg)

## Integrations

### [Allure Report](https://jenkins.qa.guru/job/hw_14_chitai_gorod/lastSuccessfulBuild/allure/)

Allure Report displays test execution results, test steps, screenshots, page source, browser console logs, 
and videos of test execution in Selenoid.

![Allure Report](media/allure-report.jpg)

### [Allure TestOps](https://allure.autotests.cloud/project/5302/dashboards)

Test execution results are sent from Jenkins to Allure TestOps.

Allure TestOps displays automated test cases, launch history, execution results, and test automation statistics.


![Allure TestOps](media/allure-testops.jpg)

An example of an Allure TestOps launch with executed tests, test steps, and Jira integration is shown below:

![Allure TestOps Launch](media/allure-testops-launch.jpg)

### [Jira](https://jira.qa.guru/browse/REF-13)

The following Jira issue was created for the project:

**REF-13 — UI autotests for Chitai-Gorod website**

The Jira issue is linked to the automated test cases and the Allure TestOps launch.

![Jira Integration](media/jira.jpg)

## Telegram Notifications

After the Jenkins build is completed, a Telegram notification with the test execution results and a link to the 
Allure Report is sent as shown below:

![Telegram Notification](media/telegram.jpg)

## Repository

### [GitHub Repository](https://github.com/tumenbaevaj/full_project)