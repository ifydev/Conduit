package systems.conduit.main.plugin.config.annotation;

import systems.conduit.main.plugin.config.ConfigurationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Innectic
 * @since 10/17/2019
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ConfigFile {
    String name();
    ConfigurationType type();
}