package com.app.wellbeingapp.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.wellbeingapp.model.Service;
import com.app.wellbeingapp.model.Practitioner;
import com.app.wellbeingapp.model.Appointment;
import com.app.wellbeingapp.model.User;

@Entity(name = "Serviceslots")
@Table(schema = "\"wellbeingapp_492\"", name = "\"Serviceslots\"")
@Data
public class Serviceslots{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ServiceId\"")
	private String serviceId;

    
    @Column(name = "\"PractitionerId\"")
    private String practitionerId;
 
}