# 🎯 Java Design Patterns Guide

Design patterns are **proven, reusable solutions to common software design problems**. They are not code you simply copy and paste, but templates you adapt to specific situations in your software.

---

## 📚 What Are Design Patterns?

Design Patterns provide **best practices for object-oriented design**. They help you:
- Write clean and maintainable code
- Communicate design ideas effectively
- Prepare for interviews and system design discussions

---

## 🧱 Categories of Design Patterns

| Category       | Purpose                                   | Examples                                |
|----------------|-------------------------------------------|-----------------------------------------|
| **Creational** | Object creation mechanisms                | Singleton, Factory, Builder, Prototype  |
| **Structural** | Composition of classes and objects        | Adapter, Decorator, Proxy, Composite    |
| **Behavioral** | Communication between objects             | Strategy, Observer, Command, State      |

---

## 🧠 Design Patterns in Java

### ✅ Creational Patterns

| Pattern            | Description                                      | Java Example                       |
|--------------------|--------------------------------------------------|------------------------------------|
| **Singleton**      | Ensures a class has only one instance            | `Runtime.getRuntime()`             |
| **Factory Method** | Delegates object creation to subclasses          | `Calendar.getInstance()`           |
| **Abstract Factory**| Creates families of related objects             | `DocumentBuilderFactory`           |
| **Builder**        | Constructs complex objects step-by-step          | `StringBuilder`, Lombok `@Builder` |
| **Prototype**      | Clones an existing object                        | `Object.clone()`                   |

---

### 🧩 Structural Patterns

| Pattern        | Description                                         | Java Example                           |
|----------------|-----------------------------------------------------|----------------------------------------|
| **Adapter**    | Converts one interface into another                 | `InputStreamReader`                    |
| **Decorator**  | Adds behavior dynamically                           | `BufferedReader` wraps `FileReader`    |
| **Proxy**      | Controls access using a placeholder                 | `java.lang.reflect.Proxy`              |
| **Composite**  | Treats a group of objects as a single object        | `JPanel` in Swing                      |
| **Facade**     | Provides a unified interface to a set of interfaces| `javax.faces.context.FacesContext`     |

---

### 🔄 Behavioral Patterns

| Pattern               | Description                                          | Java Example                        |
|------------------------|------------------------------------------------------|-------------------------------------|
| **Strategy**           | Selects algorithm at runtime                         | `Comparator`, `Collections.sort()`  |
| **Observer**           | One-to-many dependency between objects               | `Observer`, `Observable` (legacy)   |
| **Command**            | Encapsulates a request as an object                  | `Runnable`                          |
| **State**              | Changes behavior based on internal state             | `Thread` states                     |
| **Chain of Responsibility** | Passes request through a chain of handlers     | `Servlet Filter Chain`              |
| **Template Method**    | Defines skeleton of an algorithm                     | `AbstractList`                      |
| **Iterator**           | Sequential access to elements                        | `Iterator` interface                |

---

## 💡 Learning Tips

- **Use real Java library examples** to see how patterns are applied.
- **Implement each pattern** manually with a small project or use case.
- Visualize relationships using **UML diagrams**.
- Practice interview problems on **LeetCode**, **GeeksforGeeks**, or **Refactoring Guru**.

---

## 📘 Recommended Resources

| Type        | Resource |
|-------------|----------|
| 📙 Book     | *Head First Design Patterns* (Java-focused, interactive) |
| 📕 Book     | *Effective Java* by Joshua Bloch |
| 🌐 Website  | [Refactoring Guru - Java Patterns](https://refactoring.guru/design-patterns/java) |
| 🌐 Website  | [Baeldung - Design Patterns](https://www.baeldung.com/java-design-patterns) |
| ▶️ YouTube  | Search: “Java Design Patterns Tutorial” for practical videos |

---
