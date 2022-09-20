package org.launchcode.studio7;

public class CD extends BaseDisk implements CoolDisk {
    public CD(String name, Double capacity, String contents, String diskType) {
        super(name, capacity, contents, diskType);
    }

    @Override
    public void spinDisk() {
        System.out.println("the cd spins slower?");

    }

    @Override
    public void readData() {
        System.out.println("autumn mix of all your fav tracks");

    }

    // TODO: Implement your custom interface.


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
