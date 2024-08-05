package com.revature;

import com.revature.exceptions.ItemNotFoundException;
import com.revature.models.Dream;
import com.revature.repositories.DreamRepo;
import com.revature.repositories.UserRepo;
import com.revature.services.DreamServiceImpl;
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

    LocalDateTime now = LocalDateTime.now();
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
                new Dream(
                        Arrays.asList("Falling", "Helplessness", "Uncertainty"),
                        Arrays.asList(3, 6, 8),
                        "I was falling from a great height, spiraling through the air with no control over my descent. " +
                                "The ground seemed to rush towards me, but I never reached it. " +
                                "The sensation was terrifying yet strangely fascinating.",
                        3,
                        "Falling dreams often reflect feelings of losing control or uncertainty in one's life.",
                        "This dream might signify my fear of failure in my current projects.",
                        3,
                        now,
                        103
                ),
                new Dream(
                        Arrays.asList("Chasing", "Fear", "Anxiety"),
                        Arrays.asList(2, 5, 9),
                        "In my dream, I was being pursued by a shadowy figure through a dark forest. " +
                                "No matter how fast I ran, it seemed to always be right behind me. " +
                                "The fear was overwhelming, and I couldn't find a way out.",
                        2,
                        "Chasing dreams may indicate unresolved fears or anxieties in waking life.",
                        "I think being chased represents my worries about the challenges I'm currently facing.",
                        2,
                        now,
                        102
                )
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
        Dream expectedDream = new Dream(
                Arrays.asList("Flying", "Adventure", "Freedom"),
                Arrays.asList(1, 4, 7),
                "I was soaring through the sky, high above the mountains, feeling the wind beneath my wings. " +
                        "It was exhilarating and liberating, like nothing I've ever felt before. " +
                        "The world below looked so peaceful, and I felt like I could fly forever.",
                1,
                "Flying often symbolizes a desire for freedom and escape from the constraints of daily life.",
                "Flying represents my wish to break free from my current situation and explore new horizons.",
                1,
                now,
                101
        );
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
        int dreamId = 1;
        int userId = 1;
        Dream newDream = new Dream(
                Arrays.asList("Water", "Emotions", "Subconscious"),
                Arrays.asList(4, 7, 10),
                "I was swimming in a serene ocean, surrounded by vibrant marine life. " +
                        "The water was clear and warm, and I felt completely at ease. " +
                        "It was as if the ocean was communicating with me, revealing hidden truths.",
                4,
                "Water often represents the emotional and subconscious aspects of the self.",
                "Swimming in the ocean reflects my desire to explore my feelings and understand myself better.",
                dreamId,
                now,
                userId
        );
        Dream savedDream = new Dream(
                Arrays.asList("Water", "Emotions", "Subconscious"),
                Arrays.asList(4, 7, 10),
                "I was swimming in a serene ocean, surrounded by vibrant marine life. " +
                        "The water was clear and warm, and I felt completely at ease. " +
                        "It was as if the ocean was communicating with me, revealing hidden truths.",
                4,
                "Water often represents the emotional and subconscious aspects of the self.",
                "Swimming in the ocean reflects my desire to explore my feelings and understand myself better.",
                dreamId,
                now,
                userId
        );
        when(dreamRepo.save(newDream)).thenReturn(savedDream);

        // Act
        Dream result = dreamService.addDream(userId, newDream);

        // Assert
        assertEquals(savedDream, result);
        verify(dreamRepo, times(1)).save(newDream);
    }

    @Test
    void testUpdateDream_Found() {
        // Arrange
        int dreamId = 1;
        int userId = 1;
        Dream currentDream = new Dream(
                Arrays.asList("Family", "Connection", "Nurturing"),
                Arrays.asList(8, 11, 14),
                "I was spending quality time with my family, gathered around a table for a meal. " +
                        "The laughter and warmth filled the room, and I felt a deep sense of belonging and love.",
                8,
                "Family dreams often reflect one's feelings about relationships and emotional support.",
                "This dream might symbolize my appreciation for the connections I have with my loved ones.",
                dreamId,
                now,
                userId
        );
        Dream updatedDream = new Dream(
                Arrays.asList("Travel", "Exploration", "New Beginnings"),
                Arrays.asList(7, 10, 13),
                "I was on a train journey through picturesque landscapes, each scene more beautiful than the last. " +
                        "The journey felt like a metaphor for my life, constantly moving forward and discovering new possibilities.",
                8,
                "Family dreams often reflect one's feelings about relationships and emotional support.",
                "I think this dream represents my eagerness to embrace change and seek out new adventures.",
                dreamId,
                now,
                userId
        );
        when(dreamRepo.findById(dreamId)).thenReturn(Optional.of(currentDream));
        when(dreamRepo.save(updatedDream)).thenReturn(updatedDream);

        // Act
        Dream result = dreamService.updateDream(userId, dreamId, updatedDream);

        // Assert
        assertEquals(updatedDream, result);
        verify(dreamRepo, times(1)).findById(dreamId);
        verify(dreamRepo, times(1)).save(updatedDream);
    }

    @Test
    void testUpdateDream_DreamExists_UpdateFields() {
        // Arrange
        int dreamId = 1;
        int userId = 1;
        Dream existingDream = new Dream(
                Arrays.asList("Conflict", "Resolution", "Relationships"),
                Arrays.asList(6, 9, 12),
                "I found myself in the middle of a heated argument with a close friend. " +
                        "Despite the intensity, we managed to reach a resolution and hug it out. " +
                        "It felt like a breakthrough moment, clearing the air between us.",
                6,
                "Dreams of conflict often highlight unresolved issues that need attention and healing.",
                "This dream might indicate my need to address ongoing tensions with friends or family.",
                dreamId,
                now,
                userId
        );
        Dream updatedDream = new Dream(
                Arrays.asList("Animals", "Communication", "Instincts"),
                Arrays.asList(5, 8, 11),
                "In my dream, I was conversing with a wise old owl perched on a tree branch. " +
                        "The owl spoke to me in riddles, offering insights into my life that I hadn't considered before.",
                5,
                "Talking to animals in dreams can symbolize a connection with one's instincts and intuition.",
                "The owl's wisdom might be a reflection of my inner voice guiding me through decisions.",
                dreamId,
                now,
                userId
        );

        when(dreamRepo.findById(dreamId)).thenReturn(Optional.of(existingDream));
        when(dreamRepo.save(existingDream)).thenReturn(existingDream);

        // Act
        Dream result = dreamService.updateDream(userId, dreamId, updatedDream);

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
        final int dreamId = 1;
        final int userId = 1;
        final List<String> themesOld = List.of("Travel", "Exploration", "New Beginnings");
        final List<Integer> archetypesNew = List.of(7, 8, 9);
        final String descriptionNew = "I was on a train journey through picturesque landscapes, each scene more beautiful than the last. " +
                "The journey felt like a metaphor for my life, constantly moving forward and discovering new possibilities. " +
                "Then I got off the train and ran into an old friend I had not seen since college.";
        final String interpretationUserOld = "I think this dream represents my eagerness to embrace change and seek out new adventures.";
        final LocalDateTime timeStampNew = LocalDateTime.from(now).plusDays(1);
        Dream existingDream = new Dream(
                themesOld,
                Arrays.asList(7, 10, 13),
                "I was on a train journey through picturesque landscapes, each scene more beautiful than the last." +
                        " The journey felt like a metaphor for my life, constantly moving forward and discovering new possibilities.",
                7,
                "Travel dreams often signify a longing for new experiences and growth.",
                interpretationUserOld,
                dreamId,
                now,
                userId
        );
        Dream updatedDream = new Dream(
                null,
                archetypesNew,
                descriptionNew,
                7,
                null,
                null,
                dreamId,
                timeStampNew,
                userId
        );
        Dream combinedDream = new Dream();
        combinedDream.setThemes(themesOld);
        combinedDream.setArchetypes(archetypesNew);
        combinedDream.setDescription(descriptionNew);
        combinedDream.setImageName(existingDream.getImageName());
        combinedDream.setInterpretationAI(existingDream.getInterpretationAI());
        combinedDream.setInterpretationUser(interpretationUserOld);
        combinedDream.setId(dreamId);
        combinedDream.setTimeStamp(timeStampNew);
        combinedDream.setFk_userid(userId);

        when(dreamRepo.findById(dreamId)).thenReturn(Optional.of(existingDream));
        when(dreamRepo.save(combinedDream)).thenReturn(combinedDream);

        // Act
        Dream result = dreamService.updateDream(userId, dreamId, updatedDream);

        // Assert
        assertEquals(themesOld, result.getThemes()); // Should remain unchanged
        assertEquals(archetypesNew, result.getArchetypes()); // Should be updated
        assertEquals(descriptionNew, result.getDescription()); // Should be updated
        assertEquals(interpretationUserOld, result.getInterpretationUser()); // Should remain unchanged
        assertEquals(timeStampNew, result.getTimeStamp()); // Should be updated

        verify(dreamRepo, times(1)).findById(dreamId);
        verify(dreamRepo, times(1)).save(existingDream);
    }

    @Test
    void testUpdateDream_NotFound() {
        // Arrange
        final int dreamId = 1;
        final int userId = 1;
        Dream updatedDream = new Dream(
                Arrays.asList("Family", "Connection", "Nurturing"),
                Arrays.asList(8, 11, 14),
                "I was spending quality time with my family, gathered around a table for a meal. " +
                        "The laughter and warmth filled the room, and I felt a deep sense of belonging and love.",
                8,
                "Family dreams often reflect one's feelings about relationships and emotional support.",
                "This dream might symbolize my appreciation for the connections I have with my loved ones.",
                dreamId,
                now,
                userId);
        when(dreamRepo.findById(dreamId)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(ItemNotFoundException.class, () -> dreamService.updateDream(userId, dreamId, updatedDream));
        verify(dreamRepo, times(1)).findById(dreamId);
        verify(dreamRepo, never()).save(any(Dream.class));
    }
}
