
package com.person.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable
{

    public Long employeeId;
    public String role;
    public String team;
    public String activeProject;
    public String sex;
    public String race;
    private final static long serialVersionUID = 4201067082233164009L;

}
