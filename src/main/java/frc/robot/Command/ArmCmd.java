package frc.robot.Command;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.ArmSubsystem;


public class ArmCmd extends Command{
    /** Creates a new ArmCmd. */
    private final ArmSubsystem arm;

  public ArmCmd(ArmSubsystem arm) {
    this.arm = arm;
    addRequirements(this.arm);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
