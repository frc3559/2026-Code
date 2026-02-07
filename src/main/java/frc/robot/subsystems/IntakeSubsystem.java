package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class IntakeSubsystem {
    private SparkMax DriverController;

    public static final int  kIntakeMotorCanId = 20;

    public IntakeSubsystem() {
        final private intake = new SparkMax(kIntakeMotorCanId, MotorType.kBrushless);
    }
}
