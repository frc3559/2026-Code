package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class ShooterSubsystem {
    private SparkMax DriverController;

    public static final int  kShooterMotorCanId = 21;

    public ShooterSubsystem() {
        final SparkMax shooter = new SparkMax(kShooterMotorCanId, MotorType.kBrushless);

    }
    /*
    public void shooter(double speed){
        shooter.set(speed);
    }
    */
}