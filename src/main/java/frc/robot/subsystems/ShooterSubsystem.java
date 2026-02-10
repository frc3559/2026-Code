package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ShooterSubsystem extends SubsystemBase {
    public SparkMax shooter;
    public static final int  kShooterMotorCanId = 21;

    public ShooterSubsystem() {
        shooter = new SparkMax(kShooterMotorCanId, MotorType.kBrushless);

    }

    public void ShooterOn() {
        shooter.set(-1);
    }
    public void ShooterOff() {
        shooter.set(0);
    }
    /*
    public void shooter(double speed){
        shooter.set(speed);
    }
    */
}