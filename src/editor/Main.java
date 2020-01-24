package editor;

public class Main {
    public static void main(String[] args) {
        HtmlDocument doc = new HtmlDocument();
        History history = new History();
        doc.setContent("Hello world");
        BoldCommand boldCommand = new BoldCommand(doc, history);
        boldCommand.execute();
        System.out.println(doc.getContent());
        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(doc.getContent());
    }
}
