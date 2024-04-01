package frc.libzodiac.hardware;

import com.ctre.phoenix6.hardware.Pigeon2;

import frc.libzodiac.Util;
import frc.libzodiac.ZGyro;

public class Pigeon extends ZGyro {

    protected Pigeon2 gyro;

    public Pigeon(int can_id) {
        super(can_id);
    }

    @Override
    public Pigeon init() {
        this.gyro = new Pigeon2(this.can_id);
        return this;
    }

    @Override
    protected double get_yaw() {
        return Util.rad(this.gyro.getYaw().getValue());
    }

    @Override
    protected double get_pitch() {
        return Util.rad(this.gyro.getPitch().getValue());
    }

    @Override
    protected double get_roll() {
        return Util.rad(this.gyro.getRoll().getValue());
    }

}
