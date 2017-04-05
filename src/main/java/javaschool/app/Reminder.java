package javaschool.app;

import asg.cliche.Command;

public class Reminder extends Note {
    private String time;

    public String getTime() {
        return time;
    }

    @Command
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() + " " + time;
    }
}
