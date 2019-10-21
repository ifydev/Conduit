package systems.conduit.main.events;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Innectic
 * @since 10/18/2019
 */
public abstract class Cancellable extends EventType {

    @Getter @Setter private boolean canceled;
}