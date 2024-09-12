package DesignPatternLab;

import java.util.ArrayList;
import java.util.List;

public class QueueVetScheduler implements VetScheduler{
    @Override
    public List<Pet> schedule(List<Pet> pets) {
        return new ArrayList<>(pets);
    }

//    Schedules the appointments in the order they queued for an appointment.
}
