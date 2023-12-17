package org.example;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) {
        try {
            // Создаем удаленный объект ComputeEngine
            Compute engine = new ComputeEngine();
            Compute stub = (Compute) UnicastRemoteObject.exportObject(engine, 0);

            // Регистрируем удаленный объект в реестре
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("ComputeEngine", stub);

            System.out.println("Сервер запущен");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
