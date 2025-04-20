# 🚀 Java-Short-Course: Краткий курс по Java для начинающих

![Java Logo](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green.svg)

Этот репозиторий содержит **бесплатный практический курс** по основам Java, от синтаксиса до ООП и работы с коллекциями. Курс подойдёт тем, кто хочет освоить Java с нуля или освежить знания.

---

## 📌 Оглавление
1. [Быстрый старт](#-быстрый-старт)
2. [Структура курса](#-структура-курса)
3. [Как пользоваться материалами](#-как-пользоваться-материалами)
4. [Пример кода](#-пример-кода)
5. [Практические задания](#-практические-задания)
6. [Частые вопросы](#-частые-вопросы)
7. [Лицензия](#-лицензия)
8. [Автор и контакты](#-автор-и-контакты)

---

## 🚀 Быстрый старт

### Требования
- Установленная **JDK 17+** ([скачать с adoptium.net](https://adoptium.net/)).
- Любая IDE (рекомендуем [IntelliJ IDEA](https://www.jetbrains.com/idea/) или [VS Code](https://code.visualstudio.com/)).

### Клонирование репозитория
```bash
git clone https://github.com/lampochka112/Java-Short-Course.git
cd Java-Short-Course

📖 Как пользоваться материалами
Откройте папку src/ и выберите нужную тему.

Изучите примеры кода (все файлы содержат комментарии).

Попробуйте изменить код и запустите его через IDE.

Для закрепления решите задачи из exercises/.

💡 Совет: Используйте Official Java Documentation для углублённого изучения.


💻 Пример кода
Класс HelloWorld (базовый синтаксис)
java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Привет, мир! 🌎");
        int sum = 2 + 2;
        System.out.println("2 + 2 = " + sum);
    }
}

Как запустить?

Скопируйте код в файл HelloWorld.java.

В терминале выполните:

bash
javac HelloWorld.java && java HelloWorld


🧩 Практические задания
В папке exercises/ вы найдёте задачи разной сложности:

Лёгкие: Написать метод, считающий факториал.

Средние: Реализовать сортировку списка.

Сложные: Многопоточный парсер данных.

Решения можно проверить с помощью тестов (см. папку tests/).

❓ Частые вопросы
❔ Как исправить ошибку javac not found?
Убедитесь, что JDK установлен и добавлен в PATH. Проверьте:

bash
java -version
javac -version
❔ Где найти подсказки к заданиям?
В файлах hints.md внутри каждой папки с упражнениями.

📜 Лицензия
Этот проект распространяется под лицензией MIT. Подробнее см. LICENSE.

👨‍💻 Автор и контакты
Автор: lampochka112

Email: daniilgolosov232@gmail.com


💬 Ваши предложения и вопросы приветствуются!
Если нашли ошибку или хотите добавить тему, создайте Issue или форкните репозиторий.



📚 Как подключать библиотеки в Java
1. Ручное подключение (JAR-файлы)
Шаги:
Скачайте JAR-файл библиотеки (например, с Maven Repository).

В IDE (IntelliJ IDEA/Eclipse):

IntelliJ:
File → Project Structure → Modules → Dependencies → + → JARs...

Eclipse:
ПКМ на проекте → Build Path → Configure Build Path → Add External JARs...

Пример с библиотекой Gson (для работы с JSON):
java
import com.google.gson.Gson;

public class JsonExample {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson("Hello, Java!");
        System.out.println(json); // Выведет: "Hello, Java!"
    }
}
2. Использование Maven
Шаги:
Добавь зависимость в pom.xml:

xml
<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
</dependencies>
Обнови проект (IDE сделает это автоматически или через mvn install).

3. Использование Gradle
Шаги:
Добавь зависимость в build.gradle:

groovy
dependencies {
    implementation 'com.google.code.gson:gson:2.10.1'
}
Пересобери проект:

bash
./gradlew build
4. Современный способ: JPMS (Java 9+)
Если используешь модули, добавь в module-info.java:

java
module my.module {
    requires com.google.gson;
}
🔥 Популярные библиотеки и их добавление
Библиотека	Maven (pom.xml)	Gradle (build.gradle)
Gson	com.google.code.gson:gson:2.10.1	implementation 'com.google.code.gson:gson:2.10.1'
JUnit 5	org.junit.jupiter:junit-jupiter:5.9.3	testImplementation 'org.junit.jupiter:junit-jupiter:5.9.3'
Lombok	org.projectlombok:lombok:1.18.28	compileOnly 'org.projectlombok:lombok:1.18.28'
❓ Частые проблемы
Ошибка ClassNotFoundException:

Проверь, что библиотека добавлена в зависимости.

Для Maven/Gradle: выполни mvn clean install или gradle build.

Конфликт версий:

Убедись, что все зависимости совместимы (например, через mvn dependency:tree).