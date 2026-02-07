package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class IntakeSubsystem {
    private SparkMax mainController;

    public static final int  kIntakeMotorCanId = 20;

    public IntakeSubsystem() {
        mainController = new SparkMax(kIntakeMotorCanId, MotorType.kBrushless);
    }
}
