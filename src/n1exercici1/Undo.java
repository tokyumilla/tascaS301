package n1exercici1;

import java.util.ArrayList;

public class Undo {
    private static Undo instance;
    private ArrayList<Object> actions;
    private Undo() {}
    public static Undo getInstance (){
        if (instance ==null) {
            instance= new Undo();
        }
        return instance;
    }
    public void trackAction (Object action){
        actions.add(action);
    }

    public void deleteAction (){
        actions.remove(actions.size()-1);
    }
    
    public void listActions (){
       int s = actions.size();
       for (int i = s; i>=s-4;i--) {
           System.out.println(actions.get(i));
       }
    }

}
