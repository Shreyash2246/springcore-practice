package com.springcore.CollectionInjection.usingConstructorInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class employeeCollectionClass {

    // properties or attributes or fields
    private String empName;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties props;

    // default constructor
    public employeeCollectionClass() {
        super();
    }
    
    // parameterized constructor
    public employeeCollectionClass(String empName, List<String> phones, Set<String> addresses,
            Map<String, String> courses, Properties props) {
        this.empName = empName;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.props = props;
    }

    // getters and setters
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "employeeCollectionClass [empName=" + empName + ", phones=" + phones + ", addresses=" + addresses
                + ", courses=" + courses + ", props=" + props + "]";
    }
 
}