public class Member {

    /**
     * Contrived member class with public properties
     */
    private Integer id;
    private String name;
    private Boolean isAttendingEvent;
    private String favouriteProgrammingLanguage;
    private String favouriteBeverage;
    private String favouriteTaco;

    public Member() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAttendingEvent() {
        return isAttendingEvent;
    }

    public void setAttendingEvent(Boolean attendingEvent) {
        isAttendingEvent = attendingEvent;
    }

    public String getFavouriteProgrammingLanguage() {
        return favouriteProgrammingLanguage;
    }

    public void setFavouriteProgrammingLanguage(String favouriteProgrammingLanguage) {
        this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
    }

    public String getFavouriteBeverage() {
        return favouriteBeverage;
    }

    public void setFavouriteBeverage(String favouriteBeverage) {
        this.favouriteBeverage = favouriteBeverage;
    }

    public String getFavouriteTaco() {
        return favouriteTaco;
    }

    public void setFavouriteTaco(String favouriteTaco) {
        this.favouriteTaco = favouriteTaco;
    }
}
