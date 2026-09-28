public class InsertCommand implements Command{
    private TextEditor editor;
    private int position;
    private String text;

    public InsertCommand(TextEditor editor, int position, String text) {
        this.editor = editor;
        this.position = position;
        this.text = text;
    }

    @Override 
    public void execute() {
        editor.insert(position, text);
    }

    @Override 
    public void undo() {
        editor.delete(position, text.length());
    }
    
}
