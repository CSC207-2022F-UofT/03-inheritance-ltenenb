/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    String color;
    int numberOfContents;
    int capacity;
    String[] contents;

    /** Create a bag with the given color and capacity. */
    Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[capacity];
    }

    /** @return the color of the bag */
    String getColor() {
        return color;
    }

    /** @return the number of items in the bag */
    int getNumberOfContents() {
        return numberOfContents;
    }

    /** @return the capacity of the bag */
    int getCapacity() {
        return capacity;
    }

    /** set the color of the bag to color. */
    void setColor(String color) {
        this.color = color;
    }



    /**  Add a new item to the bag if the number of items is less than the capacity.
     *   @return true if the item was added and false otherwise.
     */
    boolean addItem(String item) {
        if (numberOfContents < capacity) {
            contents[numberOfContents] = item;
            numberOfContents++;
            return true;
        } else {
            return false;
        }
    }




    /**
     * Remove the last item added to the bag.
     * @return the last item added to the bag, or null if the bag is empty.
     */
    String popItem() {
        if (numberOfContents == 0) {
            return null;
        } else {
            String item = contents[numberOfContents - 1];
            --numberOfContents;
            return item;
        }
    }




    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        int newCapacity = capacity + n;
        String[] newContents = new String[newCapacity];
        for (int i = 0; i < numberOfContents; i++) {
            newContents[i] = contents[i];
        }
        contents = newContents;
        capacity = newCapacity;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return the details of this Bag.
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}