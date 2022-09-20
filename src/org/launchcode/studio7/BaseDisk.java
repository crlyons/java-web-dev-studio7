package org.launchcode.studio7;

public abstract class BaseDisk {
    private String name;
    private Double capacity;
    private String contents;
    private String diskType;

    public BaseDisk (String name, Double capacity, String contents, String diskType){
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.diskType = diskType;
    }
    public BaseDisk (String name, Double capacity, String diskType){
        this.name = name;
        this.capacity = capacity;
        this.diskType = diskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
