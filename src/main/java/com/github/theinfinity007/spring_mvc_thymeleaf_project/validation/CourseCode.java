package com.github.theinfinity007.spring_mvc_thymeleaf_project.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    // default course code
    public String value() default "LUV";

    // default errors message
    public String message() default "must start with LUV";

    // default groups
    public Class<?>[] groups() default {};

    // default payload
    public Class<? extends Payload>[] payload() default {};
}
