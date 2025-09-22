package com.kce.gym.util;

import com.kce.gym.exception.InvalidInputException;

public class ValidationUtil {
    public static void validateAge(int age) throws InvalidInputException {
        if(age < 15 || age > 100) {
            throw new InvalidInputException("❌ Invalid Age! Must be between 15 and 100.");
        }
    }
}
