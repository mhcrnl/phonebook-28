package javaschool.app;

import asg.cliche.Command;

public abstract class Record {
    private static int count = 0;
    private int id;
    private String name;

    public Record() {
        count++;
        id = count;
    }

    public boolean contains(String str) {
        String strLow = str.toLowerCase();
        String nameLow = name.toLowerCase();
        return nameLow.contains(strLow);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Command
    public void setName(String name) {
        this.name = name;
    }

}
