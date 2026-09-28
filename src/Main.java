public class Main {
    static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp(editor);

        app.executeCommand(new InsertCommand(editor, 0, "hello"));
        app.executeCommand(new InsertCommand(editor, 6, "world"));
        app.executeCommand(new InsertCommand(editor, 11, "!"));


        System.out.println("after insert " + editor.getText());

        app.undo();
        System.out.println("after undo 1 " + editor.getText()) ;

        app.undo();
        System.out.println("after undo 2 " + editor.getText() );

        app.undo();
        System.out.println("after undo 3 " + editor.getText());
    } 
}
