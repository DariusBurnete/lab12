package org.example;

public class ExportConfig {
    final String title;
    final String filename;

    public ExportConfig(String title, String filename) {
        this.title = title;
        this.filename = filename;
    }

    public String getTitle() {
        return title;
    }

    public String getFilename() {
        return filename;
    }
}
