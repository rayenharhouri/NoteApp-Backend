package com.bezkoder.spring.jpa.h2.controller;

import com.bezkoder.spring.jpa.h2.model.Tutorial;
import com.bezkoder.spring.jpa.h2.repository.TutorialRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@SpringBootTest
class TutorialControllerTest {

    @Autowired
    TutorialController tutorialController;

    @Mock
    private TutorialRepository tutorialRepository;


    @Test
    void createTutorial() {
        Tutorial t = new Tutorial("First Tuto","This is a description", false);

        when(tutorialRepository.save(any(Tutorial.class))).thenReturn(new Tutorial("First Tuto", "This is a description", false));

        ResponseEntity<Tutorial> responseEntity = tutorialController.createTutorial(t);

        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());

        assertNotNull(responseEntity.getBody());

        Tutorial responseTutorial = responseEntity.getBody();
        assertEquals("First Tuto", responseTutorial.getTitle());
        assertEquals("This is a description", responseTutorial.getDescription());

    }
}