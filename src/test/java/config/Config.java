package config;


@org.aeonbits.owner.Config.Sources({"classpath:${deviceHost}.properties"})

public interface Config extends org.aeonbits.owner.Config {

    @Key("login")
    String getLogin();

    @Key("password")
    String getPassword();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("appUrl")
    String getAppUrl();

    @Key("device")
    String getDevice();

    @Key("os_version")
    String getOsVersion();

    @Key("project")
    String getProjectName();

    @Key("build")
    String getBuildName();

    @Key("name")
    String getTestName();

}
