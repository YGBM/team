package com.xdt.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigResolveOptions;
import com.xdt.apis.BaseFilter;

import java.io.File;
import java.util.List;

public class ConfigBuilder {

    Config config ;

    public ConfigBuilder(String configFile){
         config = ConfigFactory
                .parseFile(new File(configFile))
                .resolve(ConfigResolveOptions.defaults().setAllowUnresolved(true))
                .resolveWith(ConfigFactory.systemProperties(), ConfigResolveOptions.defaults().setAllowUnresolved(true));
        ConfigRenderOptions options = ConfigRenderOptions.concise().setFormatted(true);

        System.out.println("[INFO] parsed config file: "+config.root().render(options));
    }

    public void createFilter(){
        List<BaseFilter> filters = (List<BaseFilter>) config.getConfigList("filter");
        for (BaseFilter filter : filters) {
            //TODO
//            filter.process()
        }
    }
}
