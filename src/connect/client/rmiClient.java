package connect.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import connect.server.interfaceServer;;
public class rmiClient {
	 public static void main(String args[]){ 
	        try { 
	            //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法 
	        	interfaceServer rhello =(interfaceServer) Naming.lookup("rmi://localhost:8888/RHello"); 
	            System.out.println(rhello.helloWorld()); 
	            System.out.println(rhello.sayHelloToSomeBody("hello,")); 
	        } catch (NotBoundException e) { 
	            e.printStackTrace(); 
	        } catch (MalformedURLException e) { 
	            e.printStackTrace(); 
	        } catch (RemoteException e) { 
	            e.printStackTrace();   
	        } 
	    } 
}
