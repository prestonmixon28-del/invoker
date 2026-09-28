public class Main {
    static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp(editor);

        Command command = new InsertCommand(editor, 0, "hello world");

        app.executeCommand(command);

        System.out.println("after insert " + editor.getText());

        app.undo();

        System.out.println("after undo " + editor.getText());
    } 
}
