package org.example;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Получаем доступ к удаленному объекту ComputeEngine
            Registry registry = LocateRegistry.getRegistry("localhost");
            Compute compute = (Compute) registry.lookup("ComputeEngine");

            // Создаем и выполняем задачу
            Task<Integer> task = new SomeTask();
            int result = compute.executeTask(task);

            System.out.println("Результат: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}