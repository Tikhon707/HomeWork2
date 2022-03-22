package com.javarepos.javaproj;

public class HiringDepartment {
    private Development development;

    public HiringDepartment(Development development){
        this.development = development;
    }

    public void displayInfo(){
        System.out.println("Name: " + development.getName());
        System.out.println("Job: " + development.getJob());
    }
}
