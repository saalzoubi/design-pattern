# 🔒 Singleton Design Pattern (Java)

## ✅ Definition

The **Singleton Pattern** ensures that a class has **only one instance** and provides a **global point of access** to it. It is one of the most commonly used design patterns in object-oriented software development.

---

## 🎯 When to Use

- When only **one instance** of a class is needed to coordinate actions across the system.
- When managing **shared resources** like configuration, logging, caching, or device access.
- When controlling **global application state**.

---

## 🌍 Real-World Analogies

- **Printer Spooler**: Only one spooler is needed to manage print jobs in a network.
- **Configuration Manager**: Load application configuration once and reuse everywhere.
- **Logger**: A centralized logging service used by all classes.

---

## 🧱 Types of Singleton in Java

### 1️⃣ Eager Initialization
- Instance is created at **class loading time**.
- Simple and thread-safe.
- **Drawback**: Wastes memory if the instance is never used.

---

### 2️⃣ Lazy Initialization (Not Thread-Safe)
- Instance is created **only when requested**.
- Not thread-safe by default, suitable for single-threaded apps.

---

### 3️⃣ Thread-Safe Singleton (Synchronized Method)
- Adds synchronization to lazy initialization.
- Safe in multi-threaded environments.
- **Drawback**: Synchronized method causes performance overhead.

---

### 4️⃣ Double-Checked Locking
- Checks instance twice (before and after synchronization).
- Balances **thread safety** with **performance efficiency**.
- Requires `volatile` to ensure correct visibility of changes.

---

### 5️⃣ Enum-Based Singleton
- The **most robust** way to implement Singleton in Java.
- Automatically handles **serialization**, **reflection safety**, and **thread safety**.
- Recommended by **Joshua Bloch**, author of *Effective Java*.

---

### 6️⃣ Static Inner Class Singleton ✅ ✅ ✅

- Uses a private static inner class to hold the Singleton instance.
- The inner class is **not loaded** until it is referenced — achieving **lazy initialization**.
- Leverages the JVM's **class loading** mechanism to ensure **thread safety** without synchronization.

#### ✅ Advantages:
- Lazy-loaded
- Thread-safe
- No synchronization overhead
- Clean and readable code

#### 🔐 How It Works:
- Outer class provides a `getInstance()` method.
- The Singleton instance is stored in a private static nested class (`Holder`).
- The instance is created only when `getInstance()` is first called.

This approach is often considered **best practice** for implementing Singleton in Java when not using enums.

---

## ✅ Advantages

- Saves memory — only one instance is created.
- Global point of access to the object.
- Prevents multiple instances in concurrent environments (if implemented properly).
- Lazy initialization improves performance when applicable.

---

## ❌ Disadvantages

- Can introduce **hidden dependencies** (tight coupling).
- Can become a **bottleneck** if overused or used with heavy synchronization.
- Difficult to **unit test** due to global state.
- May lead to **anti-patterns** if misused (e.g., acting as a global variable store).

---

## 📌 Best Practices

- Use **Enum Singleton** for most robust scenarios (serialization + reflection safe).
- Use **Static Inner Class** Singleton for clean, lazy, thread-safe loading.
- If lazy initialization is required and complexity is acceptable, use **double-checked locking**.
- Avoid using Singleton for everything — only use when it makes architectural sense.
- Always ensure the constructor is **private** to prevent external instantiation.

---

## 🧠 Summary

| Implementation Style      | Lazy | Thread-Safe | Recommended |
|---------------------------|------|-------------|-------------|
| Eager Initialization      | ❌    | ✅           | ❌ (memory waste) |
| Lazy (Not Thread-Safe)    | ✅    | ❌           | ❌              |
| Synchronized Method       | ✅    | ✅           | ❌ (slow)         |
| Double-Checked Locking    | ✅    | ✅           | ✅ (complex)      |
| **Static Inner Class**    | ✅    | ✅           | ✅✅✅ (best combo)  |
| Enum                      | ❌ (eager) | ✅     | ✅✅ (robust & simple) |

---

## 📚 Further Reading

- *Effective Java* by Joshua Bloch
- [Refactoring.Guru - Singleton Pattern](https://refactoring.guru/design-patterns/singleton)
- [Baeldung - Singleton in Java](https://www.baeldung.com/java-singleton)

---
