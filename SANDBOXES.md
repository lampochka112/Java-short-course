# 🏖️ Онлайн-песочницы для Java

Лучшие платформы для быстрого тестирования кода без локальной установки.  
**Актуально на:** Декабрь 2023  

---

## 🚀 ТОП-5 песочниц

### 1. [JDoodle](https://www.jdoodle.com/online-java-compiler/)
![JDoodle](https://img.shields.io/badge/JDoodle-Java_17-blue?logo=java)
- **Возможности:**
  - Поддержка Maven/Gradle
  - Импорт библиотек через pom.xml
  - Совместное редактирование
- **Пример:**
  ```java
  public class Main {
      public static void main(String[] args) {
          System.out.println("Hello from JDoodle!");
      }
  }


2. OneCompiler
OneCompiler

Фичи:

50+ предустановленных библиотек (Jackson, Gson и др.)

Встроенный дебаггер

Экспорт в Repl.it

3. GitHub Codespaces
Codespaces

Полноценная IDE в браузере

Преднастроенные шаблоны для:

Spring Boot

JavaFX

Micronaut

🧩 Специализированные песочницы
Платформа	Назначение	Пример использования
Spring Initializr	Генерация Spring-проектов	Demo
Java 8+ REPL	JShell онлайн	jshell> List.of(1,2,3).forEach(System.out::println)
DevContainer	Готовые Docker-образы	.devcontainer/devcontainer.json
🎮 Интерактивное обучение
1. Hyperskill
Hyperskill

Проекты с автоматической проверкой

Встроенная IDE

2. CodeGym
CodeGym

Виртуальный наставник

1200+ практических задач

⚙️ Как подключить библиотеки
В JDoodle:
Нажмите "Add Library"

Введите название (например, org.json:json:20231013)

Импортируйте в коде:import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject("{\"name\":\"John\"}");
        System.out.println(obj.getString("name")); // John
    }
}

💡 Советы
Для Spring Boot используйте Spring Boot Web

Для JavaFX - OpenJFX Online Demo

Для тестирования - JShell с JUnit

🔥 Pro Tip: Сохраняйте код в Gist (Ctrl+S в большинстве песочниц)

🚨 Ограничения
Макс. время выполнения: 5-30 сек

Доступ к файловой системе: ❌

GPU-ускорение: ❌

https://www.jdoodle.com/online-java-compiler здуесь модно создать свою песочницу. 