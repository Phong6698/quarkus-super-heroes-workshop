package io.quarkus.workshop.superheroes.hero;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
class HeroApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(HeroApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("\n" +
            " __    __   _______ .______        ______           ___      .______    __  \n" +
            "|  |  |  | |   ____||   _  \\      /  __  \\         /   \\     |   _  \\  |  | \n" +
            "|  |__|  | |  |__   |  |_)  |    |  |  |  |       /  ^  \\    |  |_)  | |  | \n" +
            "|   __   | |   __|  |      /     |  |  |  |      /  /_\\  \\   |   ___/  |  | \n" +
            "|  |  |  | |  |____ |  |\\  \\----.|  `--'  |     /  _____  \\  |  |      |  | \n" +
            "|__|  |__| |_______|| _| `._____| \\______/     /__/     \\__\\ | _|      |__| \n" +
            "                                                                            \n");
        LOGGER.info("The application HERO is starting with profile " + ProfileManager.getActiveProfile());

    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application HERO is stopping...");
    }
}
