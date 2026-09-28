public class EditorApp {
        private TextEditor editor;
        private Command lastCommand;

        public EditorApp(TextEditor editor) {
            this.editor = editor;
        }

        public void executeCommand(Command command) {
            command.execute();
            lastCommand = command;
        }

        public void undo() {
            if (lastCommand != null) {
                lastCommand.undo();
            }
        }

        public TextEditor getEditor() {
            return editor;
        }
        
}
