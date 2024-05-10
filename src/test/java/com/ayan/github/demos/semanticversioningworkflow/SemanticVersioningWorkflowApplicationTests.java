package com.ayan.github.demos.semanticversioningworkflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SemanticVersioningWorkflowApplicationTests {

    @DisplayName(
            """
                    Given an application
                    When running it
                    Then the app must boot
                    """
    )
    @Test
    void shouldBootApp() {
        //Given
        //When
        //Then
        Assertions.assertDoesNotThrow(
                () -> SemanticVersioningWorkflowApplication.main(new String[]{}),
                "Application must boot."
        );
    }

}
