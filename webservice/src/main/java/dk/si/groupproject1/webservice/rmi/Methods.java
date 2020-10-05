package dk.si.groupproject1.webservice.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Methods extends Remote {
    int calculateYourAge(long yearOfBirth) throws RemoteException;
}
