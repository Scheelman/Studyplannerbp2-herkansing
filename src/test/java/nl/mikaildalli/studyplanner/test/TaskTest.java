package nl.mikaildalli.studyplanner.test;

import nl.mikaildalli.studyplanner.model.Task;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    /*
     * Unit tests voor het Task model.
     * Ik test hier alleen het object zelf, dus zonder database.
     * Daardoor blijven de tests simpel en snel.
     */

    @Test
    void task_constructor_sets_values() {
        // Testdatum voor de deadline
        LocalDate d = LocalDate.of(2026, 2, 15);

        // Nieuwe Task aanmaken met alle belangrijke waarden
        Task t = new Task(1, "BP300", "Test", d, 1, null, "TODO", null);

        // Controleren of de constructor de waarden goed heeft opgeslagen
        assertEquals(1, t.getId());
        assertEquals("BP300", t.getTitle());
        assertEquals("Test", t.getDescription());
        assertEquals(d, t.getDeadline());

        // Controleren of status en categorie goed terugkomen
        assertEquals(1, t.getStatusId());
        assertNull(t.getCategoryId());
        assertEquals("TODO", t.getStatusName());
        assertNull(t.getCategoryName());
    }

    @Test
    void deadline_can_be_null() {
        // Deadline is optioneel, dus null moet toegestaan zijn
        Task t = new Task(1, "X", "", null, 1, null, "TODO", null);

        assertNull(t.getDeadline());
    }

    @Test
    void category_can_be_null() {
        // Categorie is optioneel, dus categoryId en categoryName mogen null zijn
        Task t = new Task(1, "BP2", "Geen categorie", null, 1, null, "TODO", null);

        assertNull(t.getCategoryId());
        assertNull(t.getCategoryName());
    }

    @Test
    void category_can_have_value() {
        // Categorie kan ook wel ingevuld zijn
        Task t = new Task(1, "BP2", "Met categorie", null, 1, 2, "TODO", "School");

        assertEquals(2, t.getCategoryId());
        assertEquals("School", t.getCategoryName());
    }

    @Test
    void task_type_is_task() {
        // getType() komt uit PlannerItem en wordt overschreven in Task
        Task t = new Task(1, "BP2", "Type test", null, 1, null, "TODO", null);

        assertEquals("Task", t.getType());
    }
}