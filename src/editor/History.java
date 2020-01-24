package editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    public Deque<UndoableCommand> commands = new ArrayDeque<UndoableCommand>();

    public void push(UndoableCommand command){
        commands.add(command);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }

    public int size(){
        return commands.size();
    }

}
