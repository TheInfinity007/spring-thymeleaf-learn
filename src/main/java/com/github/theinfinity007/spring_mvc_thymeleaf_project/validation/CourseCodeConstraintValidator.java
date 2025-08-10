package com.github.theinfinity007.spring_mvc_thymeleaf_project.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode courseCode) {
        // assign the value passed in from our annotation
        coursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;
        if (code != null) {
            result = code.startsWith(coursePrefix);
        }
        return result;
    }
}
