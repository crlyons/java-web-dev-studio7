package org.launchcode.studio7;

public class FloppyDisk extends BaseDisk implements CoolDisk{
    public FloppyDisk(String name, Double capacity, String contents, String diskType) {
        super(name, capacity, contents, diskType);
    }

    @Override
    public void spinDisk() {

    }

    @Override
    public void readData() {

    }
}
