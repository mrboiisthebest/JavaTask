public class Task {
    public String Name;
    public boolean IsCompleted;
    public String DateCreated;
    public String DateFinished;


    public Task(String Name){
        this.Name = Name;
        this.DateCreated = "NotMadeYet";
        this.IsCompleted = false;
    }

    public void Update(String name, boolean IsCompleted, String DateCreated, String DateFinished){
        this.Name = (name != null) ? name : this.Name;
        this.IsCompleted = IsCompleted || this.IsCompleted;
        this.DateCreated = (DateCreated != null) ? DateCreated : this.DateCreated;
        this.DateFinished = (DateFinished != null) ? DateFinished : this.DateFinished;

        System.out.println(this.Name + this.IsCompleted + this.DateCreated + this.DateFinished);
    }

    public void ToggleComplete(){
        this.IsCompleted = !IsCompleted;
        System.out.println(this.IsCompleted);
    }
}
