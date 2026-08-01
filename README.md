# UI Autotests for Chitai-Gorod

Проект UI-автотестов для сайта интернет-магазина [«Читай-город»](https://www.chitai-gorod.ru/).

## Проверяемая функциональность

В проекте реализовано 5 UI-автотестов:

- успешное открытие главной страницы;
- открытие каталога;
- ввод названия книги в поле поиска;
- поиск автора «Чингиз Айтматов»;
- поиск книги «Белый пароход».

## Используемые технологии

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

## Запуск тестов

Для локального запуска тестов в Windows используется команда:

```powershell
.\gradlew clean test
```

## Удалённый запуск в Jenkins

Тесты запускаются в Jenkins с использованием Selenoid.

### [Открыть Jenkins Job](https://jenkins.qa.guru/view/java-students/job/hw_14_chitai_gorod/)

Команда запуска в Jenkins:

```text
clean test
```

![Jenkins Build](media/jenkins.jpg)

## Интеграции

### [Allure Report](https://jenkins.qa.guru/job/hw_14_chitai_gorod/lastSuccessfulBuild/allure/)

В Allure Report отображаются результаты выполнения тестов, шаги, скриншоты, Page Source, логи браузера и видеозаписи прохождения тестов в Selenoid.

![Allure Report](media/allure-report.jpg)

### [Allure TestOps](https://allure.autotests.cloud/project/5302/dashboards)

Результаты выполнения тестов из Jenkins передаются в Allure TestOps.

В Allure TestOps отображаются автоматизированные тест-кейсы, история запусков и статистика выполнения тестов.

![Allure TestOps](media/allure-testops.jpg)

Пример запуска с выполненными тестами, шагами и связью с Jira:

![Allure TestOps Launch](media/allure-testops-launch.jpg)

### [Jira](https://jira.qa.guru/browse/REF-13)

Для проекта создана задача:

**REF-13 — UI autotests for Chitai-Gorod website**

Задача Jira связана с автоматизированными тест-кейсами и запуском в Allure TestOps.

![Jira Integration](media/jira.jpg)

## Telegram-уведомления

После завершения сборки Jenkins отправляет в Telegram уведомление с результатами выполнения тестов и ссылкой на Allure Report.

![Telegram Notification](media/telegram.jpg)

## Репозиторий

### [GitHub Repository](https://github.com/tumenbaevaj/full_project)