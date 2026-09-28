import java.util.Stack;

public class EditorApp {
       private TextEditor editor;
       private Stack<Command> history = new Stack<>();

       public EditorApp(TextEditor editor) {
        this.editor = editor;
       }

       public void executeCommand(Command command) {
        command.execute();
        history.push(command);
       }

       public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
       }

       public TextEditor getEditor() {
        return editor;
       }

}
