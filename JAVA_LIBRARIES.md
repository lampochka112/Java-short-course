# 📚 Полный гид по Java-библиотекам

Актуальный список самых полезных библиотек для Java-разработки.  
Обновлено: _Ноябрь 2023_

---

## 🏆 **ТОП-10 must-have библиотек**
| Библиотека | Описание | Версия | Ссылка |
|------------|----------|--------|--------|
| **Lombok** | Автогенерация геттеров/сетеров, логгеров | 1.18.30 | [Maven](https://mvnrepository.com/artifact/org.projectlombok/lombok) |
| **Gson** | Работа с JSON | 2.10.1 | [GitHub](https://github.com/google/gson) |
| **Guava** | Утилиты от Google | 32.1.2 | [Сайт](https://github.com/google/guava) |
| **JUnit 5** | Тестирование | 5.10.0 | [Документация](https://junit.org/junit5/) |
| **Log4j 2** | Логирование | 2.20.0 | [Apache](https://logging.apache.org/log4j/2.x/) |

---

## 📦 **По категориям**

### 1. Веб-разработка
| Библиотека | Использование |
|------------|---------------|
| **Spring Boot** | REST API | [Стартер](https://spring.io/projects/spring-boot) |
| **Jakarta EE** | Enterprise-приложения | [Сайт](https://jakarta.ee/) |
| **Spark** | Микрофреймворк | [GitHub](https://github.com/perwendel/spark) |

### 2. Работа с данными
```xml
<!-- Пример подключения в Maven -->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.3.1.Final</version>
</dependency>


Безопасность
Bouncy Castle: Криптография

Spring Security: Аутентификация

JWT: Токены

🔧 Утилиты
Для разработки:
groovy
// Пример для Gradle
implementation 'org.apache.commons:commons-lang3:3.13.0'
Apache Commons: StringUtils, RandomUtils

AssertJ: Флюентные assertions

MapStruct: Маппинг объектов

Асинхронность:
RxJava: Реактивное программирование

CompletableFuture: Встроенные в Java

🚀 Как подключить?
Maven:
xml
<dependency>
    <groupId>группа</groupId>
    <artifactId>артефакт</artifactId>
    <version>версия</version>
</dependency>
Gradle:
groovy
implementation 'группа:артефакт:версия'
💡 Все ссылки ведут на официальные репозитории или документацию.

🔍 Где искать библиотеки?
Maven Central

GitHub Topics

Awesome Java

📌 Советы
Проверяйте активность разработки (последний релиз на GitHub)

Смотрите количество звёзд и issues

Читайте CHANGELOG перед обновлением

🔄 Хотите добавить библиотеку? Создайте Pull Request!