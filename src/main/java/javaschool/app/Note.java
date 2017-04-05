package javaschool.app;

import asg.cliche.Command;

public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    @Command
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean contains(String str) {
        String strLow = str.toLowerCase();
        String noteLow = note.toLowerCase();
        return super.contains(str) || noteLow.contains(strLow);
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + note;
    }
}
