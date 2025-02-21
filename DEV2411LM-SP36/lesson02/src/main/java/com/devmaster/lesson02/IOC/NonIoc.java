package com.devmaster.lesson02.IOC;
class Service{
    public void serve(){
        System.out.println("Service is serving");
    }
}
class Client{
    private Service service;
    public Client(){
        // Client tu tao doi tuong Service
        service = new Service();
    }
    public void doSomething(){
        service.serve();
    }
}
public class NonIoc {
    public static void main(String[] args) {
        Client client = new Client();
        client.doSomething();
    }
}
