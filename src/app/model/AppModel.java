package app.model;

import app.entity.User;

import java.util.Arrays;
import java.util.List;

public class AppModel {

    public List<User> getData(){
        return Arrays.asList(
                new User("Louis", "0972897709"),
                new User("Cheryl", "0913106417"),
                new User("Travis", "0952429034"),
                new User("Jane", "0968315677"),
                new User("Arthur", "0927166794")
        );
    }

}
