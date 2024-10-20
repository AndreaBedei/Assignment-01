package sap.ass01.clean.infrastructure.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import sap.ass01.clean.domain.EBikeInfo;
import sap.ass01.clean.domain.UserInfo;

/**
 * Base interface for the application service.
 */
public interface AppService extends Remote {
    /**
     * Returns all available users. 
     * @return a list of user information
     * @throws RemoteException
     */
    List<UserInfo> getUsers() throws RemoteException;
    
    /**
     * Returns all available ebikes.
     * @return a list ebike information
     * @throws RemoteException
     */
    List<EBikeInfo> getEBikes() throws RemoteException;
}
