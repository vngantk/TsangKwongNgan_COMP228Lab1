/**
 * Singer class which represents a singer. It has these attributes:
 * id, name, address, dateOfBirth, albumsPublished.
 */
public class Singer {
    private int id;
    private String name;
    private String address;
    private String dateOfBirth;
    private int albumsPublished;

    /**
     * Constructor
     */
    public Singer() {
    }

    /**
     * Constructor
     * @param id
     */
    public Singer(int id) {
        this.id = id;
    }


    /**
     * Constructor
     * @param id
     * @param name
     */
    public Singer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Constructor
     * @param id
     * @param name
     * @param address
     */
    public Singer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    /**
     * Constructor
     * @param id
     * @param name
     * @param address
     * @param dateOfBirth
     */
    public Singer(int id, String name, String address, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Constructor
     * @param id
     * @param name
     * @param address
     * @param dateOfBirth
     * @param albumsPublished
     */
    public Singer(int id, String name, String address, String dateOfBirth, int albumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    /**
     * Get Singer's id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Get Singer's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get Singer's address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Get Singer's date of birth
     * @return dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Get Singer's albums published
     * @return albumsPublished
     */
    public int getAlbumsPublished() {
        return albumsPublished;
    }

    /**
     * Set Singer's id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set Singer's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set Singer's address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Set Singer's date of birth
     * @param dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Set Singer's albums published
     * @param albumsPublished
     */
    public void setAlbumsPublished(int albumsPublished) {
        this.albumsPublished = albumsPublished;
    }

    /**
     * Set all details for a Singer object.
     * @param id
     * @param name
     * @param address
     * @param dateOfBirth
     * @param albumsPublished
     */
    public void setDetails(int id, String name, String address, String dateOfBirth, int albumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

}
