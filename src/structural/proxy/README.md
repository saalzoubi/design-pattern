# 🛡️ Proxy Design Pattern

## 📘 Overview

The **Proxy Pattern** is a **structural design pattern** that provides a **surrogate or placeholder object** to control access to another object. This intermediary (proxy) implements the same interface as the real object and adds logic to control or enhance access to it.

---

## ✅ Definition

> **"Provide a surrogate or placeholder for another object to control access to it."**  
> — *Gang of Four (GoF)*

A **proxy** wraps the real object and intercepts client calls, either passing them through or modifying them based on logic like **access control**, **lazy loading**, or **remote invocation**.

---

## 🧠 Real-World Analogies

| Analogy              | Explanation |
|-----------------------|-------------|
| **Credit Card**       | A proxy for your bank account – lets you spend money without carrying cash. |
| **TV Remote Control** | You control the TV via a proxy (the remote), not by touching the device directly. |
| **Security Guard**    | Controls who can enter a building – a proxy for the building's internal operations. |

---

## 🧱 Common Types of Proxy

| Type               | Purpose |
|--------------------|---------|
| **Virtual Proxy**  | Lazily initializes and loads expensive objects only when needed. |
| **Protection Proxy** | Controls access based on user roles or privileges. |
| **Remote Proxy**   | Represents an object in a different address space (e.g., across a network). |
| **Smart Proxy**    | Adds extra behavior like logging, caching, or access counting. |

---

## 🎯 When to Use

- You want to **control access** to a sensitive or resource-heavy object.
- You want to **defer creation** of expensive objects until they're needed.
- You need **logging, caching, or auditing** around object usage.
- You’re working with **distributed systems or remote objects** (e.g., RMI, gRPC).

---

## ✅ Advantages

| Advantage                 | Description |
|---------------------------|-------------|
| **Encapsulates Access Logic** | Cleanly separates access concerns from business logic. |
| **Improves Performance**       | Virtual proxies prevent unnecessary object creation. |
| **Enhances Security**         | Protection proxies enforce permissions. |
| **Supports Distributed Systems** | Remote proxies enable communication across networks. |

---

## ❌ Disadvantages

| Disadvantage                 | Description |
|------------------------------|-------------|
| **Increased Complexity**     | Adds extra layers and classes. |
| **Maintenance Overhead**     | Multiple proxy variations require more upkeep. |
| **Potential Latency**        | Proxies can introduce performance overhead if overused. |

---

## 📚 Real-World Use Cases in Java

| Example                       | Description |
|-------------------------------|-------------|
| **Spring AOP / `@Transactional`** | Uses dynamic proxies to add behavior like transaction management. |
| **Hibernate Lazy Loading**    | Uses proxies to delay loading of entities from the database. |
| **Java RMI**                  | Remote Method Invocation wraps remote objects as local proxies. |
| **Java Dynamic Proxy API**    | `java.lang.reflect.Proxy` generates runtime proxies for interfaces. |

---

## 🧠 Summary

| Feature         | Value |
|------------------|-------|
| Pattern Type     | Structural |
| Key Concept      | Surrogate with controlled access |
| Focus            | Access management, lazy instantiation, remote interaction |
| Real-World Use   | Security, caching, lazy loading, remote communication |

---

## 📖 Further Reading

- *Design Patterns: Elements of Reusable Object-Oriented Software* — GoF
- [Refactoring.Guru – Proxy Pattern](https://refactoring.guru/design-patterns/proxy)
- [Baeldung – Java Proxy Pattern](https://www.baeldung.com/java-proxy-pattern)

---
