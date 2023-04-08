package com.fastcampus;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main() {
        String[] args = {"3", "1", "2"};

        Main.main(args);
    }
}