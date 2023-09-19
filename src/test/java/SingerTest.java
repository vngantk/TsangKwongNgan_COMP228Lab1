import org.junit.Assert;
import org.junit.Test;

/**
 * Unit Test class for Singer.java.
 */
public class SingerTest {

    @Test
    public void test_constructor_with_no_arguments() {
        Singer singer = new Singer();
        Assert.assertNotNull(singer);
        Assert.assertEquals(0, singer.getId());
        Assert.assertNull(singer.getName());
        Assert.assertNull(singer.getAddress());
        Assert.assertNull(singer.getDateOfBirth());
        Assert.assertEquals(0, singer.getAlbumsPublished());
    }

    @Test
    public void test_constructor_with_one_argument() {
        Singer singer = new Singer(12345);
        Assert.assertNotNull(singer);
        Assert.assertEquals(12345, singer.getId());
        Assert.assertNull(singer.getName());
        Assert.assertNull(singer.getAddress());
        Assert.assertNull(singer.getDateOfBirth());
        Assert.assertEquals(0, singer.getAlbumsPublished());
    }

    @Test
    public void test_constructor_with_two_arguments() {
        Singer singer = new Singer(12345, "Justin Bieber");
        Assert.assertNotNull(singer);
        Assert.assertEquals(12345, singer.getId());
        Assert.assertEquals("Justin Bieber", singer.getName());
        Assert.assertNull(singer.getAddress());
        Assert.assertNull(singer.getDateOfBirth());
        Assert.assertEquals(0, singer.getAlbumsPublished());
    }

    @Test
    public void test_constructor_with_three_arguments() {
        Singer singer = new Singer(12345, "Justin Bieber", "1234 Hollywood Blvd, Los Angeles, CA 90027");
        Assert.assertNotNull(singer);
        Assert.assertEquals(12345, singer.getId());
        Assert.assertEquals("Justin Bieber", singer.getName());
        Assert.assertEquals("1234 Hollywood Blvd, Los Angeles, CA 90027", singer.getAddress());
        Assert.assertNull(singer.getDateOfBirth());
        Assert.assertEquals(0, singer.getAlbumsPublished());
    }

    @Test
    public void test_constructor_with_four_arguments() {
        Singer singer = new Singer(12345, "Justin Bieber", "1234 Hollywood Blvd, Los Angeles, CA 90027", "1994-03-01");
        Assert.assertNotNull(singer);
        Assert.assertEquals(12345, singer.getId());
        Assert.assertEquals("Justin Bieber", singer.getName());
        Assert.assertEquals("1234 Hollywood Blvd, Los Angeles, CA 90027", singer.getAddress());
        Assert.assertEquals("1994-03-01", singer.getDateOfBirth());
        Assert.assertEquals(0, singer.getAlbumsPublished());
    }

    @Test
    public void test_constructor_with_five_arguments() {
        Singer singer = new Singer(12345, "Justin Bieber", "1234 Hollywood Blvd, Los Angeles, CA 90027", "1994-03-01", 5);
        Assert.assertNotNull(singer);
        Assert.assertEquals(12345, singer.getId());
        Assert.assertEquals("Justin Bieber", singer.getName());
        Assert.assertEquals("1234 Hollywood Blvd, Los Angeles, CA 90027", singer.getAddress());
        Assert.assertEquals("1994-03-01", singer.getDateOfBirth());
        Assert.assertEquals(5, singer.getAlbumsPublished());
    }

    @Test
    public void test_setter_and_getter_for_id() {
        Singer singer = new Singer();
        singer.setId(12345);
        Assert.assertEquals(12345, singer.getId());
    }

    @Test
    public void test_setter_and_getter_for_name() {
        Singer singer = new Singer();
        singer.setName("Justin Bieber");
        Assert.assertEquals("Justin Bieber", singer.getName());
    }

    @Test
    public void test_setter_and_getter_for_address() {
        Singer singer = new Singer();
        singer.setAddress("1234 Hollywood Blvd, Los Angeles, CA 90027");
        Assert.assertEquals("1234 Hollywood Blvd, Los Angeles, CA 90027", singer.getAddress());
    }

    @Test
    public void test_setter_and_getter_for_dateOfBirth() {
        Singer singer = new Singer();
        singer.setDateOfBirth("1994-03-01");
        Assert.assertEquals("1994-03-01", singer.getDateOfBirth());
    }

    @Test
    public void test_setter_and_getter_for_albumsPublished() {
        Singer singer = new Singer();
        singer.setAlbumsPublished(5);
        Assert.assertEquals(5, singer.getAlbumsPublished());
    }

    @Test
    public void test_setDetails() {
        Singer singer = new Singer();
        singer.setDetails(12345, "Justin Bieber", "1234 Hollywood Blvd, Los Angeles, CA 90027", "1994-03-01", 5);
        Assert.assertEquals(12345, singer.getId());
        Assert.assertEquals("Justin Bieber", singer.getName());
        Assert.assertEquals("1234 Hollywood Blvd, Los Angeles, CA 90027", singer.getAddress());
        Assert.assertEquals("1994-03-01", singer.getDateOfBirth());
        Assert.assertEquals(5, singer.getAlbumsPublished());
    }
}
