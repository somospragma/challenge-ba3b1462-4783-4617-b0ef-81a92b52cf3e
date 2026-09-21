package com.pragma.cache.service;

import com.pragma.cache.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CacheService {
    private final Map<String, User> userCache = new HashMap<>();

    @Cacheable("users")
    public User getUserById(String id) {
        return userCache.getOrDefault(id, new User(id, "default@email.com", "Default User"));
    }

    public void addUser(User user) {
        userCache.put(user.id(), user);
    }
}