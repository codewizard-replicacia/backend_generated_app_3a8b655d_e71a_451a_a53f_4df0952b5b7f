package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.College;
import com.mycompany.group234.model.Department;
import com.mycompany.group234.model.Student;
import com.mycompany.group234.model.Course;
import com.mycompany.group234.model.Lecturer;

@Entity(name = "CollegeAdmissioned")
@Table(schema = "\"generated_app\"", name = "\"CollegeAdmissioned\"")
@Data
public class CollegeAdmissioned{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CollegeID\"")
	private Integer collegeID;

    
    @Column(name = "\"StudentID\"")
    private Integer studentID;
 
}