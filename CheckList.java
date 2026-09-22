
import java.util.ArrayList;

public class CheckList{
    public static CheckList[] Active;

    public String Name;
    public ArrayList<Task> Tasks = new ArrayList<>();

    public CheckList(String ListName){
        this.Name = ListName;
    }

    public void AddTask(Task TargetTask){
        this.Tasks.add(TargetTask);
        System.out.println(this.Tasks);
    }

    public void RemoveTask(Task TargetTask){
        this.Tasks.remove(TargetTask);
        System.out.println(this.Tasks);
    }
}