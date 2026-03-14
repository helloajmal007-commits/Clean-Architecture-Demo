# Clean Architecture Demo (Kotlin + Jetpack Compose)

This project demonstrates a **basic implementation of Clean Architecture in Android using Kotlin and Jetpack Compose**.  
It is designed for **freshers and beginners** who want to understand how Clean Architecture works in modern Android development.

The goal of this project is to show **how to structure an Android app properly** by separating responsibilities into different layers while keeping the code simple and easy to understand.

---

## 📱 Tech Stack

- Kotlin
- Jetpack Compose
- Hilt (Dependency Injection)
- Retrofit (API calls)
- Coroutines
- MVVM Architecture

---

## 🏗 Architecture Overview

The project follows **Clean Architecture principles**, separating the code into three main layers:

Presentation Layer
│
├── UI (Jetpack Compose)
├── ViewModel
│
Domain Layer
│
├── UseCases
├── Repository Interfaces
│
Data Layer
│
├── Repository Implementations
├── Remote API
├── Data Sources


### Layer Responsibilities

**Home-Features Layer**
- Handles UI using Jetpack Compose
- Contains ViewModels
- Observes state and displays data

**Domain Layer**
- Contains business logic
- Includes UseCases
- Defines repository interfaces

**Data Layer**
- Handles API calls and data sources
- Implements repository interfaces
- Converts API models to domain models

---

## 📂 Project Structure


app
│
├── data
│ ├── api
│ ├── datasource
│ ├── repository
│
├── domain
│ ├── model
│ ├── repository
│ ├── usecase
│
├── presentation
│ ├── screen
│ ├── viewmodel
│
├── di
│ ├── Hilt Modules 


---

## 🚀 Features in This Demo

- Clean Architecture structure
- Jetpack Compose UI
- MVVM pattern
- Dependency Injection using Hilt
- Retrofit API integration
- Simple UseCase implementation

---

## 🎯 Learning Purpose

This project helps beginners learn:

- How Clean Architecture works in Android
- How to separate concerns between layers
- How to use UseCases
- How to structure a scalable Android project
- How Compose fits into modern architecture

---

## 🧑‍💻 Who Is This For?

This project is helpful for:

- Android **freshers**
- Developers learning **Clean Architecture**
- Developers starting with **Jetpack Compose**
- Anyone who wants a **simple architecture reference project**

---

## 📌 Note

This is a **learning/demo project**, so the implementation is intentionally kept simple to focus on architecture concepts.

---

## ⭐ If This Helped You

If you found this project useful, consider giving it a **star ⭐ on GitHub**.
