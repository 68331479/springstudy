package src.main.java.com.kuang.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }

    //中介扩展出来的功能
    public void seeHouse(){
        System.out.println("中介带看房。。。");
    }

    public void fee(){
        System.out.println("中介收取中介费。。。");
    }

    public void hetong(){
        System.out.println("中介签订合同。。。");
    }

}


