// NewsAgency.java
import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers;

    public NewsAgency() {
        subscribers = new ArrayList<>();
    }

    // Subscribe a user
    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println(subscriber.getName() + " subscribed to the news service.");
        }
    }

    // Unsubscribe a user
    public void unsubscribe(Subscriber subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println(subscriber.getName() + " unsubscribed from the news service.");
        }
    }

    // Publish breaking news and notify all subscribers
    public void publishNews(String news) {
        System.out.println("\nNewsAgency published: " + news);
        notifySubscribers(news);
    }

    // Notify all subscribers
    private void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveNews(news);
        }
    }
}