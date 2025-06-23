# 💡 Strategy Design Pattern

## 📘 Overview

The **Strategy Pattern** is a **behavioral design pattern** that enables selecting an algorithm or behavior **at runtime**. It defines a family of algorithms, encapsulates each one, and makes them interchangeable.

This promotes flexibility and scalability by allowing the behavior of a class to vary without modifying its code.

---

## ✅ Definition

> **"Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it."**  
> — *Gang of Four (GoF)*

The key idea is to **delegate behavior** to strategy classes, avoiding conditional logic and hardcoding.

---

## 🧠 Real-World Analogies

| Analogy               | Description |
|------------------------|-------------|
| **Payment Methods**    | Choose between credit card, PayPal, or Apple Pay at checkout. Each method implements the same interface. |
| **Navigation Apps**    | Choose between fastest route, shortest path, or avoiding tolls — all are different route strategies. |
| **Compression Tools**  | ZIP, RAR, or GZIP are interchangeable compression algorithms. |

---

## 🧱 Pattern Structure

| Component             | Role |
|------------------------|------|
| **Strategy Interface** | Common interface for algorithms or behaviors |
| **Concrete Strategies**| Implementations of the behavior |
| **Context**            | Uses a strategy object and delegates behavior to it |
| **Client**             | Sets or changes the strategy dynamically |

---

## ✅ Advantages

| Advantage                    | Description |
|-------------------------------|-------------|
| **Eliminates Conditionals**   | Replaces `if-else` or `switch-case` with polymorphism |
| **Open/Closed Principle**     | Add new behaviors without modifying existing code |
| **Runtime Flexibility**       | Behavior can be selected and changed at runtime |
| **Encapsulation of Logic**    | Each strategy is isolated and independently testable |

---

## ❌ Disadvantages

| Disadvantage                  | Description |
|-------------------------------|-------------|
| **Increased Class Count**     | Each behavior requires a separate class |
| **Client Awareness**          | Client must be aware of different strategy options |
| **Overkill for Simple Logic** | Adds complexity when only a single behavior is used |

---

## 🎯 When to Use

- You have multiple **algorithms or behaviors** and want to choose one dynamically.
- You want to **avoid hardcoded logic** or **complex conditional statements**.
- You want to **decouple** the algorithm from the client using it.
- You need to support **future extensions** without modifying core logic.

---

## 📚 Real-World Java Use Cases

| Example                         | Description |
|----------------------------------|-------------|
| **`Comparator` Interface**       | Used in sorting collections with different criteria |
| **Spring `ConversionService`**  | Converts objects from one type to another via pluggable strategies |
| **Authentication Providers**    | Multiple authentication mechanisms (JWT, OAuth, LDAP) |
| **Payment Processing Systems**  | Stripe, PayPal, Apple Pay — all implement a common payment strategy |

---

## 💳 Example: Payment Strategy (E-Commerce)

**Context:** An online store allows users to choose their preferred payment method:
- `CreditCardPayment`
- `PayPalPayment`
- `ApplePayPayment`

Each implements a shared `PaymentStrategy` interface. The `CheckoutContext` uses this interface to process the transaction, allowing payment methods to be swapped at runtime with no change to the checkout code.

This example showcases:
- Loose coupling between payment logic and client
- Runtime behavior selection
- Scalability for future payment methods

---

## 🧠 Summary

| Feature         | Value |
|------------------|-------|
| Pattern Type     | Behavioral |
| Problem Solved   | Dynamically switch behaviors without altering client logic |
| Best For         | Runtime behavior selection, avoiding complex conditionals |
| Real-World Use   | Payment gateways, sorting, routing, AI behavior trees |

---

## 📖 Further Reading

- *Design Patterns: Elements of Reusable Object-Oriented Software* — GoF
- [Refactoring.Guru – Strategy Pattern](https://refactoring.guru/design-patterns/strategy)
- [Baeldung – Strategy Pattern in Java](https://www.baeldung.com/java-strategy-pattern)

---
