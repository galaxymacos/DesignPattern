package state;

import java.util.Stack;

public class History {
    public static Stack<EditorState> prevContent = new Stack<>();
    public static Stack<EditorState> futureContent = new Stack<>();

    public void Push(EditorState state){
        prevContent.push(state);
    }

    public EditorState Pop(){
        prevContent.pop();
        return prevContent.peek();
    }

}
