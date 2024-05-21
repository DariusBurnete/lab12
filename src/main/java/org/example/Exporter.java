package org.example;

import java.util.ArrayList;
import java.util.List;

public class Exporter {
    final ExportConfig config;
    final List<String> values;


    public Exporter(ExportConfig config,
        List<String>values){
        this.config = config;
        this.values = new ArrayList<>(values);
    }

    public ExportConfig getConfig() {
        return config;
    }

    public void export(){
        System.out.println(config.filename);
        System.out.println(config.title);
        for(String value:values){
            System.out.println(value);
        }
    }
}
