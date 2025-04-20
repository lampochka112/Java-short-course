# ❓ Mini-FAQ: Частые вопросы о Java-библиотеках

## 📌 Основные вопросы

### 1. "Какую библиотеку выбрать для JSON?"
**Ответ:**  
- Для простых проектов → **Gson** (проще в освоении)
- Для высоконагруженных систем → **Jackson** (быстрее, больше фич)
- Для новых проектов → **JSON-B** (стандарт Jakarta EE)

```java
// Пример: Gson vs Jackson
Gson gson = new Gson(); // Простота
ObjectMapper mapper = new ObjectMapper(); // Производительность

2. "Почему Lombok не работает в IDE?"
Решение:

Установите плагин Lombok для вашей IDE

Включите обработку аннотаций:

settings.gradle
plugins {
    id 'io.freefair.lombok' version '6.6.1'
}
Проверьте @Data перед классом, а не полем

🛠️ Технические проблемы
3. "Hibernate медленно работает"
Фикс:

# application.yml
spring:
  jpa:
    properties:
      hibernate:
        enable_lazy_load_no_trans: true
        batch_size: 30

▶ Используйте @EntityGraph вместо FetchType.EAGER

4. "Jackson не видит поля"
Причины:

Геттеры не соответствуют конвенции (getXxx для не-boolean)

Отсутствует @JsonProperty или ObjectMapper.registerModule()

Поля объявлены как final без конструктора

🔄 Миграция
5. "Как перейти с JUnit 4 на 5?"

- @RunWith(SpringRunner.class)
+ @ExtendWith(SpringExtension.class)

- @Before
+ @BeforeEach

- @Test(expected = Exception.class)
+ assertThrows(Exception.class, () -> {...})

6. "Замена Apache Commons"
java
// Вместо:
StringUtils.isEmpty(text);

// Java 11+:
text.isBlank();

 Советы
7. "Как узнать версию библиотеки?"
mvn dependency:tree | grep 'library-name'
# ИЛИ
./gradlew dependencies --configuration compileClasspath

8. "Лучшие практики Log4j 2"
<Configuration status="WARN">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss} [%t] %-5level %logger{36} - %msg%n"/>
        </Console>
    </Appenders>
</Configuration>


📚 Полезные ссылки
Официальная документация Lombok

Jackson Troubleshooting

Hibernate Performance Tuning

✨ Pro Tip: Всегда указывайте версии библиотек при asking вопросах!

Обновления: Нашли ошибку? Создайте Issue
Автор: [lampochka112] | 2025-20-04