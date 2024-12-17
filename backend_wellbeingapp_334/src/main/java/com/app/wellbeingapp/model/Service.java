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

@Entity(name = "Service")
@Table(name = "\"Service\"", schema =  "\"wellbeingapp_492\"")
@Data
                        
public class Service {
	public Service () {   
  }
	  
  @Id
  @Column(name = "\"ServiceId\"", nullable = true )
  private String serviceId;
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"Description\"", nullable = true )
  private String description;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"Serviceslots\"",
            joinColumns = @JoinColumn( name="\"ServiceId\""),
            inverseJoinColumns = @JoinColumn( name="\"PractitionerId\""), schema = "\"wellbeingapp_492\"")
private List<Practitioner> slots = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Service [" 
  + "ServiceId= " + serviceId  + ", " 
  + "Name= " + name  + ", " 
  + "Description= " + description 
 + "]";
	}
	
}