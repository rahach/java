import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2923201
 */

@ManagedBean
@ApplicationScoped
public class MainController {
    
    private ToDoTask curTask = new ToDoTask();
    
    private List<ToDoTask> tasks = new ArrayList<>();

    public ToDoTask getCurTask() {
        return curTask;
    }

    public void setCurTask(ToDoTask curTask) {
        this.curTask = curTask;
    }
    
    public List<ToDoTask> getTasks() {
        return tasks;
    }

    public void addTask(ToDoTask task) {
        this.tasks.add(task);
    }
    
    public void removeTask(ToDoTask task) {
        this.tasks.remove(task);
    }    
    
}