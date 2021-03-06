package com.google.api.services.testing.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class WindowsVersion extends GenericJson {
  @Key private String id;
  @Key private String versionString;

  public String getId() {
    return this.id;
  }

  public WindowsVersion setId(String id) {
    this.id = id;
    return this;
  }

  public String getVersionString() {
    return this.versionString;
  }

  public WindowsVersion setVersionString(String versionString) {
    this.versionString = versionString;
    return this;
  }

  public WindowsVersion set(String fieldName, Object value) {
    return (WindowsVersion) super.set(fieldName, value);
  }

  public WindowsVersion clone() {
    return (WindowsVersion) super.clone();
  }
}
