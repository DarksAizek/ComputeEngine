package org.example;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ComputeEngine extends UnicastRemoteObject implements Compute {
    public ComputeEngine() throws RemoteException {
        super();
    }

    public <T> T executeTask(Task<T> task) throws RemoteException {
        return task.execute();
    }
}