package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credential.properties")

public interface CredConfig extends Config {
    @Config.Key("login")
    String login();

    @Config.Key("password")
    String password();

    @Config.Key("app")
    String app();
}
