package nl.mikaildalli.studyplanner.model;

public class Routine extends PlannerItem {
    private final String frequency;
    private final boolean active;

    public Routine(int id, String title, String description, String frequency, boolean active)
    {
        super(id, title,description);
        this.frequency = frequency;
        this.active = active;
    }
    public String getFrequency() {
        return frequency;
    }
    public boolean isActive() {
        return active;
    }
    @Override
    public String getType() {
        return "Routine";
    }





}
