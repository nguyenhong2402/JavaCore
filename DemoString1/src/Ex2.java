public enum Ex2 {
    MONDAY("thứ 2"), TUESDAY("thứ 3"), WEDNESDAY("thứ 4"),THURSDAY("thứ 5"),FRIDAY("thứ 6"),SATURDAY("thứ 7"),SUNDAY("chủ nhật");
    String weekdays;

    Ex2(String weekdays) {
        this.weekdays = weekdays;
    }

    public String getWeekdays() {
        return weekdays;
    }
}
