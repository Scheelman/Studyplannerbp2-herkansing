package nl.mikaildalli.studyplanner.test;

import nl.mikaildalli.studyplanner.model.PlannerItem;
import nl.mikaildalli.studyplanner.model.Routine;
import nl.mikaildalli.studyplanner.model.Task;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
Deze test laat polymorfisme zien
Task en Routine zijn verschillende klassen, maar ze erven allebei van PlannerItem
Ze staan dan samen in een ArrayList<PlannerItem> staan.
 */
public class PlannerItemTest {
    @Test
    void planner_item_can_have_different_types() {
//        Algemene lijst van PlannerItem objecten
        ArrayList<PlannerItem> items = new ArrayList<>();
// Task is een PlannerItem, omdat Task extends PlannerItem gebruikt
        items.add(new Task(1, "BP2", "Code verbeteren",
                LocalDate.of(2026,5,27), 1, null,"TODO", null));
// Routine is een ook een Planneritem, omdat Routine extends Planneritem gebruikt
   items.add(new Routine(2, "Studeren", "Elke avond oefenen", "DAILY", true));

//   Hier controleer ik of de juiste getType methode wordt uitgevoerd
   assertEquals("Task", items.get(0).getType());
   assertEquals("Routine", items.get(1).getType());
    }

}
