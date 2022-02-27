package test.laba.client.commands;


import test.laba.client.console.Console;
import test.laba.client.console.ConsoleParsing;
import test.laba.client.mainClasses.Root;

public class InsertNull extends AbstractCommand {
    public InsertNull() {
        super("InsertNull", "добавить новый элемент с заданным ключом");
    }
    public void execute(Root root, String arg, Console console, ConsoleParsing consoleParsing) {
         consoleParsing.parsProductFromConsole(root, arg, console);
    }
}