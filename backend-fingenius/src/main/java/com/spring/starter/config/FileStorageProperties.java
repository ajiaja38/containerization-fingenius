package com.spring.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
  
  private String uploadAvatarDir;
}
