package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("purple rain", 4.4, "quality music", "audio cd");
        DVD dvd = new DVD("office space", 1.0, "a funny movie", "movie dvd");

        cd.spinDisk();
        dvd.spinDisk();
        cd.readData();
        dvd.readData();

        System.out.println(cd.getName());
        System.out.println(dvd.getName());

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
