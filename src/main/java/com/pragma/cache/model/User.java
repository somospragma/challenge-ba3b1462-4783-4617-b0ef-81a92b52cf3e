package com.pragma.cache.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record User(
    @NotBlank @Size(min = 1, max = 50) String id,
    @NotBlank @Email String email,
    @NotBlank @Size(min = 1, max = 100) String name
) {}