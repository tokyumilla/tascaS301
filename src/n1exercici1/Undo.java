package n1exercici1;

import java.util.ArrayList;

public class Undo {
    private static Undo instance;
    private ArrayList<Object> actions = new ArrayList<>();

    private Undo() {
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void trackAction(Object action) {
        actions.add(action);
        System.out.println("Acción añadida");
    }

    public void deleteAction() {
        actions.remove(actions.size() - 1);
        System.out.println("Última acción eliminada eliminada");
    }

    public void listActions() {
        int s = actions.size();
        System.out.println("Estas son las últimas acciones realizadas");
        if (s <= 5) {
            for (int i = s; i > 0; i--) {
                System.out.println(actions.get(i - 1));
            }
        } else {
            for (int i = s; i > (s - 5); i--) {
                System.out.println(actions.get(i - 1));
            }
        }
    }

}
