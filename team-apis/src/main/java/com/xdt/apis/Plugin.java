package com.xdt.apis;

import com.typesafe.config.Config;

public interface Plugin {


    public void setConfig(Config config);

    public Config getConfig();

    public void prepare();


}
