package org.firstinspires.ftc.teamcode.robolib.util;

import static org.firstinspires.ftc.teamcode.Constants.*;

public class Conversions {

    public static double ticksToInches(double ticks) {
        return WHEEL_RADIUS * GEAR_RATIO * PI * 2 * ticks / TICKS_PER_REVOLUTION;
    }

    public static double rpmToVelocity(double rpm) {
        return rpm * GEAR_RATIO * 2 * Math.PI * WHEEL_RADIUS / 60.0;
    }
}
