package com.revature;

import com.revature.models.Dream;
import com.revature.services.DreamServiceImpl;
import com.revature.exceptions.ItemNotFoundException;
import com.revature.repositories.DreamRepo;
import com.revature.repositories.UserRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DreamServiceImplTests {

    private final List<String> themes1 = List.of("Theme1a", "Theme1b", "Theme1c");
    private final List<String> themes2 = List.of("Theme2a", "Theme2b", "Theme2c");
    private final List<String> themesNew = List.of("ThemeNew", "ThemeNew", "ThemeNew");
    private final List<Integer> archetypes1 = List.of(1, 2, 3);
    private final List<Integer> archetypes2 = List.of(4, 5, 6);
    private final List<Integer> archetypesNew = List.of(7, 8, 9);

    @Mock
    private DreamRepo dreamRepo;
    @Mock
    private UserRepo userRepo;
    @InjectMocks
    private DreamServiceImpl dreamService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllDreams() {
        // Arrange
        List<Dream> expectedDreams = Arrays.asList(
                new Dream(1, themes1, archetypes1, "Description1", "InterpretationUser1", LocalDateTime.now()),
                new Dream(2, themes2, archetypes2, "Description2", "InterpretationUser2", LocalDateTime.now())
        );
        when(dreamRepo.findAll()).thenReturn(expectedDreams);

        // Act
        List<Dream> actualDreams = dreamService.getAllDreams();

        // Assert
        assertEquals(expectedDreams, actualDreams);
        verify(dreamRepo, times(1)).findAll();
    }

    @Test
    void testGetDream_Found() {
        // Arrange
        Dream expectedDream = new Dream(1, themes1, archetypes1, "Description", "InterpretationUser", LocalDateTime.now());
        when(dreamRepo.findById(1)).thenReturn(Optional.of(expectedDream));

        // Act
        Dream actualDream = dreamService.getDream(1);

        // Assert
        assertEquals(expectedDream, actualDream);
        verify(dreamRepo, times(1)).findById(1);
    }

    @Test
    void testGetDream_NotFound() {
        // Arrange
        when(dreamRepo.findById(1)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(ItemNotFoundException.class, () -> dreamService.getDream(1));
        verify(dreamRepo, times(1)).findById(1);
    }

    @Test
    void testAddDream() {
        // Arrange
        Dream newDream = new Dream(0, themes1, archetypes1, "Description", "InterpretationUser", LocalDateTime.now());
        Dream savedDream = new Dream(1, themes1, archetypes1, "Description", "InterpretationUser", LocalDateTime.now());
        when(dreamRepo.save(newDream)).thenReturn(savedDream);

        // Act
        Dream result = dreamService.addDream(newDream);

        // Assert
        assertEquals(savedDream, result);
        verify(dreamRepo, times(1)).save(newDream);
    }

    @Test
    void testUpdateDream_Found() {
        // Arrange
        int dreamId = 1;
        Dream currentDream = new Dream(dreamId, themes1, archetypes1, "Description", "InterpretationUser", LocalDateTime.now());
        Dream updatedDream = new Dream(dreamId, themesNew, archetypesNew, "NewDescription", "NewInterpretationUser", LocalDateTime.now().plusDays(1));

        when(dreamRepo.findById(dreamId)).thenReturn(Optional.of(currentDream));
        when(dreamRepo.save(updatedDream)).thenReturn(updatedDream);

        // Act
        Dream result = dreamService.updateDream(dreamId, updatedDream);

        // Assert
        assertEquals(updatedDream, result);
        verify(dreamRepo, times(1)).findById(dreamId);
        verify(dreamRepo, times(1)).save(updatedDream);
    }

    @Test
    void testUpdateDream_DreamExists_UpdateFields() {
        // Arrange
        int dreamId = 1;
        Dream existingDream = new Dream(dreamId, themes1, archetypes1, "OldDescription", "OldInterpretationUser", LocalDateTime.now());
        Dream updatedDream = new Dream(dreamId, themesNew, archetypesNew, "NewDescription", "NewInterpretationUser", LocalDateTime.now().plusDays(1));

        when(dreamRepo.findById(dreamId)).thenReturn(Optional.of(existingDream));
        when(dreamRepo.save(existingDream)).thenReturn(existingDream);

        // Act
        Dream result = dreamService.updateDream(dreamId, updatedDream);

        // Assert
        assertEquals(updatedDream.getThemes(), result.getThemes());
        assertEquals(updatedDream.getArchetypes(), result.getArchetypes());
        assertEquals(updatedDream.getDescription(), result.getDescription());
        assertEquals(updatedDream.getInterpretationUser(), result.getInterpretationUser());
        assertEquals(updatedDream.getTimeStamp(), result.getTimeStamp());

        verify(dreamRepo, times(1)).findById(dreamId);
        verify(dreamRepo, times(1)).save(existingDream);
    }

    @Test
    void testUpdateDream_DreamExists_PartialUpdate() {
        // Arrange
        int dreamId = 2;
        LocalDateTime now = LocalDateTime.now();
        Dream existingDream = new Dream(dreamId, themes1, archetypes1, "OldDescription", "OldInterpretationUser", now);
        Dream updatedDream = new Dream(dreamId, null, archetypesNew, null, null, now.plusDays(1));
        Dream combinedDream = new Dream(dreamId, themes1, archetypesNew, "OldDescription","OldInterpretationUser",now.plusDays(1));
        when(dreamRepo.findById(dreamId)).thenReturn(Optional.of(existingDream));
        when(dreamRepo.save(combinedDream)).thenReturn(combinedDream);

        // Act
        Dream result = dreamService.updateDream(dreamId, updatedDream);

        // Assert
        assertEquals(themes1, result.getThemes()); // Should remain unchanged
        assertEquals(archetypesNew, result.getArchetypes()); // Should be updated
        assertEquals("OldDescription", result.getDescription()); // Should remain unchanged
        assertEquals("OldInterpretationUser", result.getInterpretationUser()); // Should remain unchanged
        assertEquals(updatedDream.getTimeStamp(), result.getTimeStamp()); // Should be updated

        verify(dreamRepo, times(1)).findById(dreamId);
        verify(dreamRepo, times(1)).save(existingDream);
    }
    @Test
    void testUpdateDream_NotFound() {
        // Arrange
        int dreamId = 1;
        Dream updatedDream = new Dream(dreamId, themesNew, archetypesNew, "NewDescription", "NewInterpretationUser", LocalDateTime.now().plusDays(1));

        when(dreamRepo.findById(dreamId)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(ItemNotFoundException.class, () -> dreamService.updateDream(dreamId, updatedDream));
        verify(dreamRepo, times(1)).findById(dreamId);
        verify(dreamRepo, never()).save(any(Dream.class));
    }
}
