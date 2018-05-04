package com.trivadis.streamsets.stage.processor.headerdetailparser.config;

import com.streamsets.pipeline.api.GenerateResourceBundle;
import com.streamsets.pipeline.api.Label;

@GenerateResourceBundle
public enum HeaderType implements Label {
	  USE_HEADER("Use Header Line"),
	  IGNORE_HEADER("Ignore Header Line"),
	  NO_HEADER("No Header Line"),
	  ;

	  private final String label;

	  HeaderType(String label) {
	    this.label = label;
	  }

	  @Override
	  public String getLabel() {
	    return label;
	}
}
