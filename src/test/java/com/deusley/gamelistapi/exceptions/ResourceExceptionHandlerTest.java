package com.deusley.gamelistapi.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ResourceExceptionHandlerTest {

    @InjectMocks
    private ResourceExceptionHandler exceptionTestes;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void objectNotFound() {
        ResponseEntity<StandardError> error = exceptionTestes.objectNotFound(
                new ObjectNotFoundException("Não Encontrado por esse Id"), new MockHttpServletRequest());

        assertNotNull(error.getBody());
        assertEquals(HttpStatus.NOT_FOUND, error.getStatusCode());
        assertNotNull(error);
        assertEquals("Não Encontrado por esse Id", error.getBody().getError());
        assertEquals(404, error.getBody().getStatus());
        assertNotEquals(LocalDateTime.now(), error.getBody().getTimestamp());
    }
}