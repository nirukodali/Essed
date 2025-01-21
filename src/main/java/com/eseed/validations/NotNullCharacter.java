package com.eseed.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CharacterNotNullValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNullCharacter {
    String message() default "Character must not be null";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

