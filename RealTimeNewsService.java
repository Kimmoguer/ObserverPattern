// RealTimeNewsService.java
public class RealTimeNewsService {
    public static void main(String[] args) {
        // Create the news agency
        NewsAgency agency = new NewsAgency();

        // Create subscribers
        Subscriber alice = new NewsSubscriber("Alice");
        Subscriber bob = new NewsSubscriber("Bob");
        Subscriber charlie = new NewsSubscriber("Charlie");

        // Subscription management
        agency.subscribe(alice);
        agency.subscribe(bob);

        // Publish breaking news
        agency.publishNews("Breaking: New Java version released!");

        // Dynamic subscription updates
        agency.subscribe(charlie);  // New subscriber joins
        agency.publishNews("Breaking: Stock market hits record high!");

        agency.unsubscribe(bob);    // Subscriber leaves
        agency.publishNews("Breaking: Major sports event canceled due to weather!");
    }
}