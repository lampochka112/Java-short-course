# 🕰️ Легаси vs Modern: Путеводитель по эволюции Java-библиотек

Актуальные замены устаревших технологий с гайдами по миграции.  
**Последнее обновление:** Ноябрь 2023  

---

## 📌 Основная таблица замен

| Устаревшая технология | Современная замена | Ключевые улучшения | Сложность миграции | Гайд |
|-----------------------|--------------------|--------------------|-------------------|------|
| **JavaFX 2.x** | [JavaFX 21+](https://openjfx.io) | Модульность, GL ES 3.0, CI/CD | ⭐⭐ | [OpenJFX Migration](https://openjfx.io/openjfx-docs/) |
| **JAXB** | [Jackson XML](https://github.com/FasterXML/jackson-dataformat-xml) | Лучшая производительность, аннотации | ⭐⭐ | [Baeldung Guide](https://www.baeldung.com/jackson-xml) |
| **Log4j 1.x** | [Log4j 2.x](https://logging.apache.org/log4j/2.x/) | Асинхронность, плагины | ⭐⭐ | [Migration Guide](https://logging.apache.org/log4j/2.x/manual/migration.html) |
| **Apache Commons Collections 3.x** | [Collections 4.x](https://commons.apache.org/proper/commons-collections/) | Безопасность, лямбды | ⭐ | [API Changes](https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/index.html) |
| **JUnit 4** | [JUnit 5](https://junit.org/junit5/) | Параметризованные тесты, расширения | ⭐⭐ | [Migration Tips](https://junit.org/junit5/docs/current/user-guide/#migrating-from-junit4) |

---

## 🔧 Детали по миграции

### 1. JavaFX 2 → JavaFX 21+
```diff
# Было (pom.xml)
- <dependency>
-   <groupId>com.oracle</groupId>
-   <artifactId>javafx</artifactId>
-   <version>2.2.0</version>
- </dependency>

# Стало
+ <dependency>
+   <groupId>org.openjfx</groupId>
+   <artifactId>javafx-controls</artifactId>
+   <version>21</version>
+ </dependency>


2. JAXB → Jackson XML
java
// Было
@XmlRootElement
class User {
    @XmlElement String name;
}

// Стало
@JacksonXmlRootElement(localName = "user")
class User {
    @JacksonXmlProperty(localName = "name") 
    String name;
}
🚨 Риски при переходе
Обратная совместимость:

Jackson XML не поддерживает XSD-валидацию из коробки

Производительность:

Log4j 2.x требует настройки AsyncLogger для максимальной скорости

Устаревший код:

JUnit 4 → 5: @Before → @BeforeEach

📚 Дополнительные ресурсы
Oracle Migration Guide

Java Almanac: API Changes

JetBrains Migration Tools

💡 Советы
Используйте анализаторы зависимостей:

bash
mvn versions:display-dependency-updates
Тестируйте миграцию в отдельной ветке Git

Для сложных случаев применяйте адаптеры (Wrapper-паттерн)

🔄 Обновления: Хотите добавить свою замену? Создайте Issue!