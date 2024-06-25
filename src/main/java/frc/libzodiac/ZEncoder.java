package frc.libzodiac;

/**
 * A generic encoder.
 */
public abstract class ZEncoder {

    /**
     * The CAN ID.
     */
    public final int can_id;

    /**
     * Zero position of this encoder in radians. The adjustion is applied to output automatically by <code>ZEncoder</code>.
     */
    public double zero;

    public ZEncoder(int can_id) {
        this.can_id = can_id;
    }

    /**
     * Initialize this encoder.
     */
    public abstract ZEncoder init();

    /**
     * Configures the zero position of the encoder.
     */
    public ZEncoder set_zero(double pos) {
        this.zero = pos;
        return this;
    }

    /**
     * Get the current position in raw units.
     */
    public abstract double get_raw();

    /**
     * Get the current position in radians, regardless of zero position.
     */
    public abstract double get_rad();

    /**
     * Get the current position.
     */
    public double get() {
        return this.get_rad() - this.zero;
    }
}
