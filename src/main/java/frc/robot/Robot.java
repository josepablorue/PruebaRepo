// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  //Motores chasis
  CANSparkMax motorDerecho1 = new CANSparkMax(1, MotorType.kBrushless);
  CANSparkMax motorDerecho2 = new CANSparkMax(2, MotorType.kBrushless);
  CANSparkMax motorIzquierdo1 = new CANSparkMax(3, MotorType.kBrushless);
  CANSparkMax motorIzquierdo2 = new CANSparkMax(4, MotorType.kBrushless);
  DifferentialDrive chasis = new DifferentialDrive(motorIzquierdo1, motorDerecho1);
  //NavX
  

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}

  //FUNCIÓN DE INIT
    public void inicio(){
      motorDerecho2.follow(motorDerecho1);
      motorIzquierdo2.follow(motorIzquierdo1);
      chasis.tankDrive(0.6, 0.6);
      
    }
}
