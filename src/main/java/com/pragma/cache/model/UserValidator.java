package com.pragma.cache.model;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserValidator implements ConstraintValidator<User, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        return user!= null && user.id()!= null &&!user.id().isBlank();
    }
}