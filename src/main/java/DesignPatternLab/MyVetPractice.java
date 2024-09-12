package DesignPatternLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MyVetPractice implements VetPractice{
    private List<Owner> owners;
    private List<Pet> pets;
    private List<Pet> bookingQueue;

    public MyVetPractice(List<Owner> owners, List<Pet> pets, List<Pet> bookingQueue) {
        this.owners = owners;
        this.pets = pets;
        this.bookingQueue = bookingQueue;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Pet> getBookingQueue() {
        return bookingQueue;
    }

    public void setBookingQueue(List<Pet> bookingQueue) {
        this.bookingQueue = bookingQueue;
    }

    @Override
    public boolean registerPet(Pet p) {
        List<Pet> pet = new ArrayList<>();

        // Takes the Pet to register, returns true if successfully registered.
//        boolean registerPet(Pet p);
          for(Pet ps :pet){
              pet.add(p);

              System.out.println(pet);
          }
        return true;

//        when you add an object in java to an array list it auto generates boolean value
//        return false;

    }

    @Override
    public boolean registerOwner(Owner o) {
        return false;
    }

    @Override
    public List<Pet> getPets() {
        return List.of();
    }

    @Override
    public List<Owner> getOwners() {
        return List.of();
    }

    @Override
    public void queueBooking(Pet p) {

    }

    @Override
    public List<Pet> scheduleAppointments() {
        return List.of();
    }
}
