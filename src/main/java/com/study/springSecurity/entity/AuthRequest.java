package com.study.springSecurity.entity;

public record AuthRequest(
        String username,
        String password
) {
}
