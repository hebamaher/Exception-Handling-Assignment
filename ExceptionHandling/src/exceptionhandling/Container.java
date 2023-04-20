/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author Eng Heba
 */
public class Container implements Comparable<Container> {
    private String UUID;
    private String Short_Name;
    private String Long_Name;
    
    public Container(){
        
    }
    public String getUUID(){
        return UUID;
    }
    public String getShort_Name() {
        return Short_Name;
    }
    public String getLong_Name() {
        return Long_Name;
    }
    public void setUUID(String uuid){
        this.UUID= uuid;
    }
    public void setShort_Name(String sn) {
        this.Short_Name = sn;
    }
    public void setLong_Name(String ln) {
        this.Long_Name = ln;
    }
    public int compareTo(Container c) {
        return Short_Name.compareToIgnoreCase(c.Short_Name);
    }
    public String toString() {
     return "\nid is: "+UUID+"\nshort name: "+Short_Name+"\nLong name is: "+Long_Name;
    }
}

