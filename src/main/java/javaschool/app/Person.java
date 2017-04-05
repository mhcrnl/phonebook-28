package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person extends Record {
    private String email;
    private final List<String> phones = new ArrayList<>();

    public String getEmail() {
        return email;
    }

    @Command
    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhones() {
        return phones;
    }

    @Override
    public boolean contains(String str) {
        String strLow = str.toLowerCase();
        String emailLow = email.toLowerCase();
        boolean result = super.contains(str) || emailLow.contains(strLow);
        if (result) {
            return true;
        }
        for (String ph : phones) {
            String phLow = ph.toLowerCase();
            if (phLow.contains(strLow)) {
                return true;
            }
        }
        return false;
    }

    @Command
    public void addPhones(String... phones) {
        this.phones.addAll(Arrays.asList(phones));
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + email + " " + phones;
    }

}
