# 🎁 Decorator Design Pattern

## 📘 Overview

The **Decorator Pattern** is a **structural design pattern** that allows behavior to be added to individual objects, either statically or dynamically, without modifying the original class.

---

## ✅ Definition

> **"Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality."**  
> — *Gang of Four (GoF)*

The pattern uses **composition** over inheritance to extend behavior. It wraps an object and adds new functionality before or after delegating to the original object.

---

## 🎯 When to Use

- You want to add responsibilities to individual objects, not all instances of a class.
- You want to use composition rather than inheritance for flexibility.
- You need to extend behavior **at runtime** and **layer multiple enhancements**.
- Modifying the original class is **not allowed** (e.g., it's in a third-party library or is sealed).

---

## 🧠 Real-World Analogies

- **Coffee Shop**: You start with a basic coffee and then decorate it with milk, sugar, caramel, etc.
- **Gift Wrapping**: The core gift is wrapped with multiple layers (boxes, ribbons, papers).
- **Text Editor**: Add formatting (bold, italic, underline) dynamically to selected text.

---

## 🧱 Pattern Components

| Component   | Description |
|-------------|-------------|
| **Component** | The base interface or abstract class |
| **ConcreteComponent** | The core object being decorated |
| **Decorator** | Abstract class that implements the component and holds a reference to it |
| **ConcreteDecorator** | Adds additional behavior to the component |

---

## ✅ Advantages

| Advantage                     | Explanation |
|-------------------------------|-------------|
| **Flexible Behavior Addition** | Enhances objects without touching source code |
| **Avoids Class Explosion**     | Reduces the need for too many subclasses |
| **Follows Open/Closed Principle** | Add new features without modifying existing code |
| **Supports Composition**      | Dynamically combine features in different orders |

---

## ❌ Disadvantages

| Disadvantage                      | Explanation |
|-----------------------------------|-------------|
| **Complex Object Chains**         | Too many layers of wrappers can become hard to debug |
| **Difficult to Configure**        | Dynamic behavior composition may confuse developers |
| **Not Ideal for Global Behavior** | Behavior only applies to the specific object, not all instances |

---

## 🧠 Summary

| Feature     | Value |
|-------------|-------|
| Pattern Type | Structural |
| Purpose      | Add behavior dynamically |
| Key Principle| Favor composition over inheritance |
| Analogy      | Toppings on a base pizza or coffee |

---

## 📚 Related Patterns

- **Adapter**: Converts interface, not behavior.
- **Proxy**: Controls access rather than adding behavior.
- **Composite**: Works on hierarchical tree structures, while decorator works linearly.

---

## 📖 Further Reading

- *Design Patterns: Elements of Reusable Object-Oriented Software* — GoF
- [Refactoring.Guru – Decorator Pattern](https://refactoring.guru/design-patterns/decorator)
- [Baeldung – Decorator in Java](https://www.baeldung.com/java-decorator-pattern)

---
