package com.example.simplejsontopojoexample;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "filename",
        "size",
        "directory",
        "properties"
})
public class File {

    @JsonProperty("filename")
    private String filename;

    @JsonProperty("size")
    private Integer size;

    @JsonProperty("directory")
    private String directory;

    @JsonProperty("properties")
    private Properties properties;



    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
