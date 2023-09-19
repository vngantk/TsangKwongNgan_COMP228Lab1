/**
 * Driver class that provides a main method which creates a Singer object and
 * prints its details. As this class contains only static methods, it is not
 * necessary to create an instance of this class, so the constructor is made
 * private.
 */
public class Driver {

    /**
     * Private constructor to prevent instantiation of this class.
     */
    private Driver() {
    }

    /**
     * Main method that creates a Singer object and prints its details.
     * @param args
     */
    public static void main(String[] args) {
        // Create a Singer object with the default constructor
        Singer singer = new Singer();

        // Print the details of the Singer object
        System.out.println("Details of Singer created with default constructor:");
        printSingerDetails(singer);

        // Set the values of the Singer object using the setter methods
        singer.setId(12345);
        singer.setName("Justin Bieber");
        singer.setAddress("1234 Hollywood Blvd, Los Angeles, CA 90027");
        singer.setDateOfBirth("1994-03-01");
        singer.setAlbumsPublished(5);

        // Print the details of the Singer object
        System.out.println("Details of Singer updated with setter methods:");
        printSingerDetails(singer);
    }

    /**
     * Print the details of a Singer object with each of its properties
     * on a separate line. It uses the getter methods to access the properties
     * of the Signer object.
     * This method is declared with package level access modifier so that it can be
     * accessed by the unit test classes for testing.
     * @param singer
     */
    static void printSingerDetails(Singer singer) {
        System.out.println("Singer ID: " + singer.getId());
        System.out.println("Singer Name: " + singer.getName());
        System.out.println("Singer Address: " + singer.getAddress());
        System.out.println("Singer Date of Birth: " + singer.getDateOfBirth());
        System.out.println("Singer Albums Published: " + singer.getAlbumsPublished());
        System.out.println();
    }
}
