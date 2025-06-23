# 🌳 Composite Design Pattern

## 📘 Overview

The **Composite Pattern** is a **structural design pattern** that allows you to **compose objects into tree-like structures** to represent part-whole hierarchies. This enables **clients to treat individual objects and groups of objects uniformly**, simplifying code that deals with complex nested structures.

---

## ✅ Definition

> **"Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly."**  
> — *Gang of Four (GoF)*

---

## 🧠 Real-World Analogies

| Analogy         | Description |
|------------------|-------------|
| **File System**  | Folders (directories) can contain files or other folders. You can perform operations like `delete`, `rename`, or `open` on either. |
| **Company Hierarchy** | A manager may supervise employees and other managers. All can be treated as employees. |
| **GUI Components** | UI containers like panels hold buttons, text boxes, and other panels. All are `Component`s.

---

## 🧱 Pattern Structure

### Participants

| Role             | Description |
|------------------|-------------|
| **Component**     | Defines the common interface for all objects in the hierarchy |
| **Leaf**          | Represents an individual object (e.g., a file) |
| **Composite**     | Represents a group of components (e.g., folder) that may contain leaves or other composites |
| **Client**        | Interacts with components using the common interface |

### UML-like Hierarchy

````
Component
├── Leaf
└── Composite
├── Leaf
└── Composite
````


---

## 🎯 When to Use

- You want to represent a **tree-like structure**.
- You want to **treat individual and group objects the same way**.
- You need to perform **recursive operations** (e.g., `printAll`, `deleteAll`, `calculateTotal`).
- You want to implement **polymorphic behavior** across a part-whole hierarchy.

---

## ✅ Advantages

| Advantage                  | Description |
|----------------------------|-------------|
| **Uniformity**             | Treat individual and group of objects in the same way |
| **Tree Structure Friendly**| Ideal for hierarchies like folders, UI, or organization charts |
| **Recursive Traversal**    | Enables easy recursive operations through the structure |
| **Open/Closed Principle**  | Easy to add new components without changing existing code |

---

## ❌ Disadvantages

| Disadvantage               | Description |
|----------------------------|-------------|
| **Increased Complexity**   | Can make the design harder to understand if overused |
| **Harder to Restrict Types** | You might need runtime checks if different child types are required |
| **Overhead for Simple Cases** | Not ideal for flat or simple structures with no nesting |

---

## 🧠 Summary

| Property        | Value |
|------------------|-------|
| Pattern Type     | Structural |
| Problem Solved   | Treating individual and grouped elements uniformly |
| Suitable For     | Tree structures, recursive operations, nested compositions |
| Common Use Cases | File systems, GUI trees, menu hierarchies, org charts |

---

## 📚 Related Patterns

- **Decorator**: Also uses recursive wrapping but focuses on adding behavior dynamically.
- **Composite**: Focuses on part-whole relationships and hierarchy.
- **Chain of Responsibility**: Also uses recursive delegation, but for processing requests.

---

## 📖 Further Reading

- *Design Patterns: Elements of Reusable Object-Oriented Software* — GoF
- [Refactoring.Guru – Composite Pattern](https://refactoring.guru/design-patterns/composite)
- [Baeldung – Composite Design Pattern in Java](https://www.baeldung.com/java-composite-pattern)

---
