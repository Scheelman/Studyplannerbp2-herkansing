package nl.mikaildalli.studyplanner.service;

import nl.mikaildalli.studyplanner.model.Task;
import nl.mikaildalli.studyplanner.util.Database;

import java.time.LocalDate;
import java.util.List;

public class TaskService {

    private final Database database = new Database();

    public List<Task> getAllTasks() {
        return database.getAllTasksWithJoin();
    }

    public void addTask(String title, String description, LocalDate deadline,
                        int statusId, Integer categoryId) {
        database.insertTask(title, description, deadline, statusId, categoryId);
    }

    public void updateTask(int id, String title, String description, LocalDate deadline,
                           int statusId, Integer categoryId) {
        database.updateTask(id, title, description, deadline, statusId, categoryId);
    }

    public void deleteTask(int id) {
        database.deleteTaskById(id);
    }

    public List<Database.IdName> getAllStatuses() {
        return database.getAllStatuses();
    }

    public List<Database.IdName> getAllCategories() {
        return database.getAllCategories();
    }
}