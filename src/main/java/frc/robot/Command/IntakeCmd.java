package frc.robot.Command;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.IntakeSubsystem;

public class IntakeCmd extends Command{
    /** Creates a new IntakeCmd. */
    private final IntakeSubsystem intake;

  public IntakeCmd(IntakeSubsystem intake) {
    this.intake = intake;
    addRequirements(this.intake);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    intake.stop();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.setVoltage();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
