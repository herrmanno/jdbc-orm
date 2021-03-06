package de.herrmanno.jdbcorm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import de.herrmanno.jdbcorm.constants.Constraint;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(ElementType.FIELD)
public @interface Field {
	//String value() default "";
	Constraint[] value() default {};
}
