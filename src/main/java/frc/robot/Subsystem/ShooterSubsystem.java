package frc.robot.Subsystem;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
    private final TalonFX ShooterMotor1;
    private final TalonFX ShooterMotor2;

    public ShooterSubsystem(){
        ShooterMotor1 = new TalonFX(0);
        ShooterMotor2 = new TalonFX(0);
    }

    public void setVoltage(){
        ShooterMotor1.setVoltage(3);
        ShooterMotor2.setVoltage(3);
    }
    
    @Override
    public void periodic() {
    } 
}
