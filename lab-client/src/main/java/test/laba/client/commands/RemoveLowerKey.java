package test.laba.client.commands;

import test.laba.client.console.ConsoleParsing;
import test.laba.client.mainClasses.Root;


public class RemoveLowerKey extends AbstractCommand {
    public RemoveLowerKey() {
        super("Remove_Lower_Key", "удалить из коллекции все элементы, ключ которых меньше, чем заданный");
    }
    public void execute(String arg, Root root, ConsoleParsing consoleParsing) {
        Long key;
        key = consoleParsing.toLongNumber(arg);
        root.removeIfKeyLess(key);
    }
}
