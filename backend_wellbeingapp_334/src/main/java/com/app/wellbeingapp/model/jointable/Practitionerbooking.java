package com.app.wellbeingapp.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.wellbeingapp.model.Service;
import com.app.wellbeingapp.model.Practitioner;
import com.app.wellbeingapp.model.Appointment;
import com.app.wellbeingapp.model.User;

@Entity(name = "Practitionerbooking")
@Table(schema = "\"wellbeingapp_492\"", name = "\"Practitionerbooking\"")
@Data
public class Practitionerbooking{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PractitionerId\"")
	private String practitionerId;

    
    @Column(name = "\"AppointmentId\"")
    private String appointmentId;
 
}