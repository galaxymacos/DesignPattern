package client;

import state.Editor;
import state.History;

public class Tester {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setComment("abc");
        history.Push(editor.CreateState());

        editor.setComment("abcd");
        history.Push(editor.CreateState());

        editor.setComment("abcde");
        history.Push(editor.CreateState());


        editor.Restore(history.Pop());
        System.out.println(editor.getComment());

        editor.Restore(history.Pop());
        System.out.println(editor.getComment());

    }

}
