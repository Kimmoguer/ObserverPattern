// Subscriber.java
public interface Subscriber {
    void receiveNews(String news); // Called when news is published
    String getName();              // Subscriber's name
}