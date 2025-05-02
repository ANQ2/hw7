# 🚗 Car Showroom App

Android-приложение, реализующее список автомобилей с использованием принципов **SOLID** и архитектурного паттерна **MVVM**.

## 📌 Функциональность
- Отображение списка автомобилей с изображениями и названиями
- Использование `RecyclerView`, `DataBinding`, `ViewModel`, `LiveData`
- Локальные ресурсы изображений (без интернета)

## 📐 Архитектура
- **Model**: `Car.kt`, `CarRepository`
- **ViewModel**: `CarViewModel.kt`
- **View**: `CarFragment`, `CarAdapter`, `item_car.xml`
- **BindingAdapter**: Подключение изображения из ресурсов

## ✅ SOLID-принципы
- **S**: Разделение обязанностей по слоям (UI, логика, данные)
- **O**: Использование интерфейса `CarRepository`
- **L**: `CarRepositoryImpl` корректно заменяет интерфейс
- **I**: Узкие интерфейсы (1 метод)
- **D**: Частичное внедрение зависимостей через ViewModel

## 💼 Стек
- Kotlin
- MVVM
- LiveData
- ViewModel
- DataBinding
- RecyclerView

## 🛠️ Как запустить
1. Клонируй репозиторий:
   ```bash
   git clone https://github.com/ТВОЙ_НИК/CarShowroomApp.git
