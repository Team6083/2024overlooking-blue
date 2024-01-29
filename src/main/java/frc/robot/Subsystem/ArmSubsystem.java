package frc.robot.Subsystem;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
    private final CANSparkMax ArmMotor1;
    private final CANSparkMax ArmMotor2;

    public ArmSubsystem(){
        ArmMotor1 = new CANSparkMax(0, MotorType.kBrushless);
        ArmMotor2 = new CANSparkMax(0, MotorType.kBrushless);
    }

    public void setVoltage(){
        ArmMotor1.setVoltage(3);
        ArmMotor2.setVoltage(3);
    }

    @Override
  public void periodic() {
  } 
}
