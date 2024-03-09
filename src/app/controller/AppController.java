package app.controller;

import app.entity.User;
import app.model.AppModel;
import app.view.AppView;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class AppController {

    private final AppModel model = new AppModel();
    private final AppView view = new AppView();
    private final AtomicInteger counter = new AtomicInteger();

    public void runApp(){
        List<User> users = model.getData();
        users.forEach(getConsumer());
    }

    private Consumer<User> getConsumer(){
        return user ->
                view.getOutput(counter.incrementAndGet() + ") " + user.toString());
    }

}
