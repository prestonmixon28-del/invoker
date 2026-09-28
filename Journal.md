# Journal
The editorapp uses Command objects instead of directly changing the text. This makes the code easier to change and maintain becasue the commands handles the actions.

The command object knows how to undo its own action. This keeps the undo code out of EditorApp, making EditorApp simpler.

When I test it, it gives me at exception in thread "main" with alot of java.base/jdk...