
# Распределенное приложение на Java

Это пример распределенного приложения на языке Java, которое использует Java RMI (Remote Method Invocation) для выполнения вычислений на нескольких узлах.

## Требования

- Java Development Kit (JDK) версии 8 или выше.

## Установка

1. Склонируйте репозиторий:
   
git clone https://github.com/ваш-username/ваш-репозиторий.git

2. Перейдите в директорию проекта:

cd ваш-репозиторий

3. Соберите проект с помощью команды:

javac -d bin src/*.java

Запуск
Запустите сервер:

java -classpath bin Server

Запустите клиентское приложение:

java -classpath bin Client

Пример использования

// Создаем и выполняем задачу
Task<Integer> task = new SomeTask();
int result = compute.executeTask(task);
System.out.println("Результат: " + result);

## Лицензия

[MIT License](LICENSE)
