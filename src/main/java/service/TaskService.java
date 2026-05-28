package service;

import nl.mikaildalli.studyplanner.model.Task;
import nl.mikaildalli.studyplanner.util.Database;

import java.time.LocalDate;
import java.util.List;


/*
TaskService is de tussenlaag tussen de UI en de database

 Dit maakt de code overzichtelijker:
 TaskView = scherm
 TaskService = taaklogica
 Database = SQL en databaseverbinding
 */
public class TaskService {
    private final Database database = new Database();

    public List<Task> getAllTasks() {
        return database.getAllTasksWithJoin();
    }
    public void addTask(String title, String description, LocalDate deadline,
                        int statusId, Integer categoryId) {
        database.insertTask(title, description, deadline, statusId, categoryId);
    }
    /*
     * Past een bestaande taak aan.
     */
    public void updateTask(int id, String title, String description, LocalDate deadline,
                           int statusId, Integer categoryId) {
        database.updateTask(id, title, description, deadline, statusId, categoryId);
    }
    /*
     * Verwijdert een taak.
     */
    public void deleteTask(int id) {
        database.deleteTaskById(id);
    }
    /*
     * Statussen ophalen voor de ComboBox.
     */
    public List<Database.IdName> getAllStatuses() {
        return database.getAllStatuses();
    }
    /*
     * Categorieën ophalen voor de ComboBox.
     */
    public List<Database.IdName> getALLCategories() {
        return database.getAllCategories();
    }
}
