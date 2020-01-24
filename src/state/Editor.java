package state;

public class Editor {
    private String comment;



    public String getComment() {
        return comment;
    }

    public void setComment(String newComment) {
        comment = newComment;

    }

    public void Restore(EditorState state) {
        comment = state.Content;
    }

    public EditorState CreateState(){
        EditorState editorState = new EditorState();
        editorState.Content = comment;
        return editorState;
    }



}
