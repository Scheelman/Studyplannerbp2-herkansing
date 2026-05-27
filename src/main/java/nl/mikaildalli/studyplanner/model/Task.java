package nl.mikaildalli.studyplanner.model;

import java.time.LocalDate;

// Task Model:
// ID is nodig voor UPDATE/DELETE
// namen komen uit JOIN voor TableView
public class Task extends PlannerItem {

    private final LocalDate deadline;
    private final int statusId;
    private final Integer categoryId;
    private final String statusName;
    private final String categoryName;

    public Task(int id, String title, String description, LocalDate deadline,
                int statusId, Integer categoryId, String statusName, String categoryName) {

        super(id, title, description);

        this.deadline = deadline;
        this.statusId = statusId;
        this.categoryId = categoryId;
        this.statusName = statusName;
        this.categoryName = categoryName;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public int getStatusId() {
        return statusId;
    }
    public Integer getCategoryId() {
        return categoryId;
    }

    public String getStatusName() {
        return statusName;
    }

    public String getCategoryName() {
        return categoryName;
    }

@Override
    public  String getType() {
        return "Task";
}
}