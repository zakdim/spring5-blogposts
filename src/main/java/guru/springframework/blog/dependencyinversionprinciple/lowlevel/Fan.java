package guru.springframework.blog.dependencyinversionprinciple.lowlevel;

import guru.springframework.blog.dependencyinversionprinciple.highlevel.Switchable;

/**
 * Created by dmitri on 2018-12-24
 */
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
