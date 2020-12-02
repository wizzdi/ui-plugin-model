package com.flexicore.ui.model;

import com.flexicore.model.Baseclass;
import com.flexicore.model.FileResource;
import com.flexicore.security.SecurityContext;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class UIPlugin extends Baseclass {

	@ManyToOne(targetEntity = FileResource.class)
	private FileResource content;

	private String version;
	private String associationReference;

	public UIPlugin() {
	}

	public UIPlugin(String name, SecurityContext securityContext) {
		super(name, securityContext);
	}

	@ManyToOne(targetEntity = FileResource.class)
	public FileResource getContent() {
		return content;
	}

	public <T extends UIPlugin> T setContent(FileResource content) {
		this.content = content;
		return (T) this;
	}

	public String getVersion() {
		return version;
	}

	public <T extends UIPlugin> T setVersion(String version) {
		this.version = version;
		return (T) this;
	}

	public String getAssociationReference() {
		return associationReference;
	}

	public <T extends UIPlugin> T setAssociationReference(
			String associationReference) {
		this.associationReference = associationReference;
		return (T) this;
	}
}
