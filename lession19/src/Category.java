public enum Category {
    TVSHOW("Chương trình truyền hình"), MOVIE("Phim");

    private String value;

    Category(String value) {
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}