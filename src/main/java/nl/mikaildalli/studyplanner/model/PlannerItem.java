package nl.mikaildalli.studyplanner.model;

public abstract class PlannerItem {
//    PlannerItem is een klasse voor onderdelen in de planner
//    Task en Routine hebben allebei een id, titel en omscrhijving
//    Daarom zet ik deze gezamenlijke eigenschapem hier.
    private final int id;
    private final String title;
    private final String description;

    public PlannerItem (int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }
    public String getDescription() {
        return description;
    }
// Elke subklasse geeft zelf aan welk type het is.
//    dus task geeft "Task" terug en Routine geeft "Routine" terug
public abstract String getType();



}
