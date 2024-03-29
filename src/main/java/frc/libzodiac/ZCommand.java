package frc.libzodiac;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;

/**
 * Not that necessary.
 * It is here just to improve coding experience.
 */
public class ZCommand extends Command {
    protected <T extends Subsystem> T require(T subsys) {
        this.addRequirements(subsys);
        return subsys;
    }
}
