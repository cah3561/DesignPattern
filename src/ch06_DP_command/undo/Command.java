package ch06_DP_command.undo;

public interface Command {
	public void execute();
	public void undo();
}
