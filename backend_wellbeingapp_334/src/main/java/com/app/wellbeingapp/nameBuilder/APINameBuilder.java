package com.app.wellbeingapp.nameBuilder;


import com.sap.olingo.jpa.metadata.core.edm.mapper.api.JPAEdmNameBuilder;
import com.sap.olingo.jpa.metadata.core.edm.mapper.impl.JPADefaultEdmNameBuilder;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.EmbeddableType;
import javax.persistence.metamodel.EntityType;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Date;

public class APINameBuilder implements JPAEdmNameBuilder {
    private final JPAEdmNameBuilder defaultNameBuilder;

    public APINameBuilder(final String punit) {
        defaultNameBuilder = new JPADefaultEdmNameBuilder(punit);
    }

    @Override
    public String buildComplexTypeName(final EmbeddableType<?> jpaEmbeddedType) {
        return defaultNameBuilder.buildComplexTypeName(jpaEmbeddedType);
    }

    @Override
    public String buildContainerName() {
        return defaultNameBuilder.buildContainerName();
    }

    @Override
	public String buildEntitySetName(final String entityTypeName) {
    	String eSetName = null;
    	
    	eSetName = "Practitioner".equals(entityTypeName) ? "Practitioners" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "Appointment".equals(entityTypeName) ? "Appointments" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "User".equals(entityTypeName) ? "Users" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "Service".equals(entityTypeName) ? "Services" : defaultNameBuilder.buildEntitySetName(entityTypeName);
        return eSetName;
    }

    @Override
    public String buildEntityTypeName(final EntityType<?> jpaEntityType) {
        return defaultNameBuilder.buildEntityTypeName(jpaEntityType);
    }

    @Override
    public String buildEnumerationTypeName(final Class<? extends Enum<?>> javaEnum) {
        return defaultNameBuilder.buildEnumerationTypeName(javaEnum);
    }

    @Override
    public String buildNaviPropertyName(final Attribute<?, ?> jpaAttribute) {
        return defaultNameBuilder.buildNaviPropertyName(jpaAttribute);
    }

    @Override
    public String buildOperationName(final String internalOperationName) {
        return defaultNameBuilder.buildOperationName(internalOperationName);
    }

    @Override
    public String buildPropertyName(final String jpaAttributeName) {
        return defaultNameBuilder.buildPropertyName(jpaAttributeName);
    }

    @Override
    public String getNamespace() {
        return defaultNameBuilder.getNamespace();
    }
}
