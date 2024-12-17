package com.app.wellbeingapp.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.wellbeingapp.model.Service;
import com.app.wellbeingapp.model.Practitioner;
import com.app.wellbeingapp.model.Appointment;
import com.app.wellbeingapp.model.User;
import com.app.wellbeingapp.converter.DurationConverter;
import com.app.wellbeingapp.converter.UUIDToByteConverter;
import com.app.wellbeingapp.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Appointment")
@Table(name = "\"Appointment\"", schema =  "\"wellbeingapp_492\"")
@Data
                        
public class Appointment {
	public Appointment () {   
  }
	  
  @Id
  @Column(name = "\"AppointmentId\"", nullable = true )
  private String appointmentId;
	  
  @Column(name = "\"Date\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date date;  
  
	  
  @Column(name = "\"Time\"", nullable = true )
  private String time;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"Appointmentservices\"", referencedColumnName = "\"UserId\"", insertable = false, updatable = false)
	private User services;
	
	@Column(name = "\"Appointmentservices\"")
	private String appointmentservices;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Appointment [" 
  + "AppointmentId= " + appointmentId  + ", " 
  + "Date= " + date  + ", " 
  + "Time= " + time 
 + "]";
	}
	
}