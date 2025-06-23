# 🔌 Adapter Design Pattern

## 📘 Overview

The **Adapter Pattern** is a **structural design pattern** that enables objects with incompatible interfaces to collaborate. It acts as a bridge between two interfaces, allowing legacy or third-party code to be integrated seamlessly into new systems.

---

## ✅ Definition

> **"Convert the interface of a class into another interface that clients expect."**  
> — *Gang of Four (GoF)*

The Adapter Pattern wraps an existing class with a new interface so that it becomes compatible with the client’s expectations — without modifying the original code.

---

## 🎯 When to Use

- You want to use an existing class but its interface does not match what the client expects.
- You need to integrate legacy code into a modern system.
- You are working with a third-party library or API that you cannot modify.
- You want to follow the **Open/Closed Principle**: extend behavior without changing the source.

---

## 🔧 Types of Adapter

1. **Object Adapter (Composition)**
    - Uses composition (holds a reference to the adaptee).
    - Most commonly used.

2. **Class Adapter (Inheritance)**
    - Uses multiple inheritance (extends adaptee and implements target).
    - Not supported in Java directly (single inheritance only).

---

## 🧠 Real-World Analogies

- **Power Adapter**: Allows a device with a US plug to work in a European socket.
- **Card Reader**: Converts SD card interface to USB.
- **Translator**: Converts spoken words from one language to another so two people can communicate.

---

## ✅ Advantages

| Advantage                          | Explanation |
|------------------------------------|-------------|
| **Reusability**                    | You can reuse existing incompatible classes without modifying them. |
| **Decoupling**                     | Clients remain unaware of the adaptee’s concrete implementation. |
| **Promotes Open/Closed Principle** | Extend behavior without touching existing code. |
| **Bridges Legacy and Modern Code** | Perfect for modernizing systems with old interfaces. |

---

## ❌ Disadvantages

| Disadvantage                        | Explanation |
|-------------------------------------|-------------|
| **Added Complexity**                | Introduces extra classes and layers. |
| **Overuse Leads to Fragility**      | Too many adapters can clutter architecture and reduce maintainability. |
| **Only Adapts Interface**           | Cannot change behavior beyond what the adaptee provides. |

---

## 📚 Related Patterns

- **Facade**: Simplifies a subsystem, whereas Adapter focuses on compatibility.
- **Decorator**: Adds responsibilities dynamically, not for interface conversion.
- **Bridge**: Separates abstraction from implementation but both may evolve independently.

---

## 🧠 Summary

| Feature     | Value                          |
|-------------|--------------------------------|
| Pattern Type | Structural                    |
| Purpose      | Convert one interface to another |
| Usage        | Legacy integration, interface mismatch resolution |
| Real-world   | Power plug adapter, language translator |

---

## 📖 Further Reading

- *Design Patterns: Elements of Reusable Object-Oriented Software* — GoF
- [Refactoring.Guru – Adapter Pattern](https://refactoring.guru/design-patterns/adapter)
- [Baeldung – Adapter Design Pattern in Java](https://www.baeldung.com/java-adapter-pattern)

---
