package week_10.assigments;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        long totalSecond = System.currentTimeMillis() / 1000;
        second = (int) (totalSecond % 60);
        minute = (int) ((totalSecond / 60) % 60);
        hour = (int) ((totalSecond / 3600) % 24);
    }

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time(long elapsedTime) {
        long totalSecond = elapsedTime / 1000;
        second = (int) (elapsedTime % 60);
        minute = (int) ((elapsedTime / 60) % 60);
        hour = (int) ((elapsedTime / 3600) % 24);
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        new Time(elapsedTime);
    }
}
