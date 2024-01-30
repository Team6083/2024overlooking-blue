package frc.robot.Subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private final CANSparkMax intakeMotor;

    public IntakeSubsystem(){
        intakeMotor = new CANSparkMax(0, MotorType.kBrushless);
    }

    public void setVoltage(){
        intakeMotor.setVoltage(3);
    }

    public void stop(){
        intakeMotor.setVoltage(0);
    }
    @Override
  public void periodic() {
  } 
}
