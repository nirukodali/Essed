package com.eseed.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CharacterNotNullValidator implements ConstraintValidator<NotNullCharacter, Character> {
    @Override
    public void initialize(NotNullCharacter constraintAnnotation) {
    }

    @Override
    public boolean isValid(Character character, ConstraintValidatorContext constraintValidatorContext) {
        return character != null;
    }
}
