package org.launchcode.studio7;

public class DVD extends BaseDisk implements CoolDisk {
    public DVD(String name, Double capacity, String contents, String diskType) {
        super(name, capacity, contents, diskType);
    }

    @Override
    public void spinDisk() {
        System.out.println("the did spins faster??");

    }

    @Override
    public void readData() {
        System.out.println("that movie you really like");

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
