# 🤖 AI Chatbot – Version 2 (Spring AI + OpenAI)

A Spring Boot application integrating OpenAI using Spring AI.

This version uses Spring AI's auto-configuration instead of manually calling the OpenAI REST API.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot 3.3.x (This supports Spring AI, higher version like 4 does not support it now)
- Spring AI (1.0.0-M3)
- OpenAI API
- Maven

---

## 🧠 What’s Different from Version 1?

| Version 1 | Version 2 |
|------------|------------|
| Manual REST call to OpenAI | Uses Spring AI starter |
| Explicit API URL required | No URL needed |
| Custom HTTP handling | Auto-configured |
| More boilerplate | Cleaner & abstracted |

---

## 📦 Dependencies Used

```xml
<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-openai-spring-boot-starter</artifactId>
</dependency>
