# 🏭 Factory Method Design Pattern (Java)

## ✅ Definition

The **Factory Method Pattern** is a creational design pattern that:
> Defines an **interface for creating an object**, but allows **subclasses to alter the type of objects** that will be created.

It provides a way to **delegate the instantiation logic** to child classes, making the code more flexible and easier to extend.

---

## 🎯 When to Use

- When the **exact class of the object** to be created is not known until runtime.
- When you want to delegate the **instantiation logic** to subclasses.
- When the object creation process is **complex** or must follow a specific rule.
- When you want to follow the **Open/Closed Principle** — allowing the code to be open for extension but closed for modification.

---

## 🌍 Real-World Analogies

- **Document Editor**: You select “New Document”, and it opens a Word, PDF, or Excel file editor — you don’t know or care which class is used.
- **Notification System**: Based on the user's preference, send an Email, SMS, or Push Notification — the client shouldn't know the class used.
- **Payment Gateway**: Depending on selected method (Card, PayPal, Apple Pay), instantiate the correct payment processor.

---

## 🧱 Participants

| Role             | Description |
|------------------|-------------|
| **Product**      | Interface or abstract class defining the object’s behavior |
| **Concrete Product** | Specific implementations of the product |
| **Creator**      | Abstract class or interface with the factory method |
| **Concrete Creator** | Subclass that overrides the factory method to create specific products |

---

## 🧠 Core Idea

Instead of doing this:

```java
Notification n = new EmailNotification();
```
Do this:

```java
NotificationFactory factory = new EmailNotificationFactory();
Notification n = factory.createNotification();

```
