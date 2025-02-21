package com.devmaster.lesson02.IOC;
class IoCService{
    public void serve(){
        System.out.println("Serving Ioc Service");
    }
}
class IOCClient{
    private IoCService ioCService;
    // dung DI de truyeen vao service thay vi tu tao no
    public IOCClient(IoCService service){
        this.ioCService = service;
    }
    public void doSomething(){
        ioCService.serve();
    }
}
public class IocWithDI {
    public static void main(String[] args) {
        // tao doi tuong Service va truyen no vao client
        IoCService service = new IoCService();
        IOCClient client = new IOCClient(service);
        client.doSomething();
    }
}
