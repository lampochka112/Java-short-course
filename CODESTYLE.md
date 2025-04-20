# 🎨 Java Code Style Guide

Единые стандарты оформления кода при работе с популярными библиотеками.  
Актуально для Java 17+  

---

## 📌 Общие принципы

1. **Отступы**: 4 пробела (не табы)
2. **Именование**:
   - Классы: `PascalCase`
   - Методы: `camelCase()`
   - Константы: `UPPER_SNAKE_CASE`

---

## 📚 Стиль для конкретных библиотек

### 1. Lombok
```java
// ✅ Правильно
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
}

// ❌ Неправильно
public @Data class User { ... }


Правила:

Аннотации перед public class

Группировка анноций сверху вниз:

1. @Data/@Value

2. @Builder

3. Конструкторы

4. Кастомные аннотации

2. Spring
// ✅ Правильно (constructor injection)
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;
}

// ❌ Неправильно (field injection)
@Autowired
private UserRepository userRepo;

Правила:

@Autowired только через конструктор

@Transactional на уровне сервиса, а не репозитория

Порядок аннотаций:

1. @Service/@Component

2. @Transactional

3. @RequiredArgsConstructor

3. Jackson
// ✅ Правильно (явное именование)
@JsonProperty("user_name")
private String username;

// ❌ Неправильно (неявное маппинг)
private String userName;

Правила:

Все DTO-поля должны иметь @JsonProperty

Для вложенных объектов:

@JsonUnwrapped
private Address address;
Сериализация дат:

@JsonFormat(pattern = "yyyy-MM-dd")
private LocalDate birthDate;

🔧 Инструменты автоматизации
1. Checkstyle
Пример .checkstyle.xml:

xml
<module name="Checker">
    <module name="TreeWalker">
        <module name="AnnotationLocation">
            <property name="tokens" value="CLASS_DEF"/>
            <property name="allowSamelineMultipleAnnotations" value="false"/>
        </module>
    </module>
</module>

2. EditorConfig
ini
[*.java]
indent_style = space
indent_size = 4
end_of_line = lf
charset = utf-8
trim_trailing_whitespace = true
insert_final_newline = true


💡 Лучшие практики
Группировка зависимостей (Maven)
xml
<!-- 1. Внутренние -->
<dependency>...</dependency>

<!-- 2. Фреймворки -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>

<!-- 3. Утилиты -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>

🚨 Антипаттерны
Смешение стилей:

java
// Плохо:
@Data public class User {
    @JsonProperty("n") private String name;
}
Избыточные аннотации:

java
// Избыточно:
@Autowired @Setter(onMethod = @__(@Autowired)) 
private Service service;

