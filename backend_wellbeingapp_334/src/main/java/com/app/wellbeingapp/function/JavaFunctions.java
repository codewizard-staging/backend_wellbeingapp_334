package com.app.wellbeingapp.function;

import com.app.wellbeingapp.model.Service;
import com.app.wellbeingapp.model.Practitioner;
import com.app.wellbeingapp.model.Appointment;
import com.app.wellbeingapp.model.User;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.wellbeingapp.repository.PractitionerRepository;
import com.app.wellbeingapp.repository.AppointmentRepository;
import com.app.wellbeingapp.repository.UserRepository;
import com.app.wellbeingapp.repository.ServiceRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
