// NewsSubscriber.java
public class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void receiveNews(String news) {
        System.out.println("[" + name + "] received breaking news: " + news);
    }

    @Override
    public String getName() {
        return name;
    }
}