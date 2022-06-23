import java.lang.*;

public class Start {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------");
        
        StoryBook sb1 = new StoryBook();
        StoryBook sb2 = new StoryBook("1001",
                            "Learn Java",
                            "Adam",
                            500.50,
                            10,
                            "Beginner");

        TextBook tb1 = new TextBook();
        TextBook tb2 = new TextBook("2001",
                                    "Learn C++",
                                    "Jennie",
                                    250,
                                    8,
                                    5);


        sb2.showDetails();
        tb2.showDetails();

        sb2.setIsbn("1001");
        sb2.setBookTitle("Expert C#");
        sb2.setAuthorName("John");
        sb2.setPrice(850.00);
        sb2.setAvailableQuantity(10);
        sb2.addQuantity(8);
        sb2.sellQuantity(4);

        sb2.setCategory("Learner");

        tb2.setIsbn("2001");
        tb2.setBookTitle("Expert Java");
        tb2.setAuthorName("Jennie");
        tb2.setPrice(350.00);
        tb2.setAvailableQuantity(15);
        tb2.addQuantity(8);
        tb2.sellQuantity(6);

        tb2.setStandard(7);


        System.out.println("\nGetting Details for StoryBook");
        System.out.println("ISBN                                  : "+sb2.getIsbn());
        System.out.println("Book Title                            : "+sb2.getBookTitle());
        System.out.println("Author Name                           : "+sb2.getAuthorName());
        System.out.println("Price including discount              : "+sb2.getPrice()+" Taka");
        System.out.println("Available Quantity                    : "+sb2.getAvailableQuantity());
        System.out.println("Category                              : "+sb2.getCategory());

        System.out.println("\nGetting Details for TextBook");
        System.out.println("ISBN                                  : "+tb2.getIsbn());
        System.out.println("Book Title                            : "+tb2.getBookTitle());
        System.out.println("Author Name                           : "+tb2.getAuthorName());
        System.out.println("Price including discount              : "+tb2.getPrice()+" Taka");
        System.out.println("Available Quantity                    : "+tb2.getAvailableQuantity());
        System.out.println("Standard                              : "+tb2.getStandard());
    }
}