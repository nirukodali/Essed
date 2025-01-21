package com.eseed.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MobileNumberValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MobileNumber {

    String message() default "Mobile number should be 10 digits";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}


