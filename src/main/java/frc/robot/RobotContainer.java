// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Command.IntakeCmd;
import frc.robot.Command.ShooterCmd;
import frc.robot.Constants.XboxControllerPortConstants;
import frc.robot.Subsystem.ArmSubsystem;
import frc.robot.Subsystem.ClimbingSubsystem;
import frc.robot.Subsystem.IntakeSubsystem;
import frc.robot.Subsystem.ShooterSubsystem;

public class RobotContainer {
  CommandXboxController XboxController;

  ArmSubsystem armSubsystem;
  ClimbingSubsystem climbingSubsystem;
  IntakeSubsystem intakeSubsystem;
  ShooterSubsystem shooterSubsystem;

  public RobotContainer() {
    XboxController = new CommandXboxController(XboxControllerPortConstants.Xbox);

    armSubsystem = new ArmSubsystem();
    climbingSubsystem = new ClimbingSubsystem();
    intakeSubsystem = new IntakeSubsystem();
    shooterSubsystem = new ShooterSubsystem();

    configureBindings();
  }

  private void configureBindings() {
    XboxController.a().whileTrue(new IntakeCmd(intakeSubsystem));
    XboxController.x().whileTrue(new ShooterCmd(shooterSubsystem));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
