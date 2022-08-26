package duke.command;

import duke.errors.DukeException;
import duke.main.Storage;
import duke.main.Ui;
import duke.task.TaskList;

/**
 * Represents a command to exit the program. Command contains boolean to exit program.
 */
public class ExitCommand extends Command {

    /**
     * Executes the command
     * @param tasks TaskList object that stores tasks
     * @param ui Ui object deals with user interaction
     * @param storage Storage object that handles text file
     * @throws DukeException exception thrown in TaskList, Ui or Storage methods
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {

    }

    /**
     *
     * @return true for program to exit
     */
    @Override
    public boolean isExit() {
        return true;
    }
}