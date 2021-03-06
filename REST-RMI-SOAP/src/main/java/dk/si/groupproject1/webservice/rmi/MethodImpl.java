package dk.si.groupproject1.webservice.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.Year;

public class MethodImpl extends UnicastRemoteObject implements Methods {
    public MethodImpl() throws RemoteException{}

    @Override
    public int calculateYourAge(long yearOfBirth) {
        return Year.now().getValue() - ((int) yearOfBirth);
    }
}
