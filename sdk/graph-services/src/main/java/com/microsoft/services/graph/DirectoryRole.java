/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;





/**
 * The type Directory Role.
*/
public class DirectoryRole extends DirectoryObject {

    public DirectoryRole(){
        setODataType("#Microsoft.Graph.DirectoryRole");
    }
            
    private String description;
     
    /**
    * Gets the description.
    *
    * @return the String
    */
    public String getDescription() {
        return this.description; 
    }

    /**
    * Sets the description.
    *
    * @param value the String
    */
    public void setDescription(String value) { 
        this.description = value; 
        valueChanged("description", value);

    }
            
    private String displayName;
     
    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.displayName = value; 
        valueChanged("displayName", value);

    }
            
    private Boolean isSystem;
     
    /**
    * Gets the is System.
    *
    * @return the Boolean
    */
    public Boolean getIsSystem() {
        return this.isSystem; 
    }

    /**
    * Sets the is System.
    *
    * @param value the Boolean
    */
    public void setIsSystem(Boolean value) { 
        this.isSystem = value; 
        valueChanged("isSystem", value);

    }
            
    private Boolean roleDisabled;
     
    /**
    * Gets the role Disabled.
    *
    * @return the Boolean
    */
    public Boolean getRoleDisabled() {
        return this.roleDisabled; 
    }

    /**
    * Sets the role Disabled.
    *
    * @param value the Boolean
    */
    public void setRoleDisabled(Boolean value) { 
        this.roleDisabled = value; 
        valueChanged("roleDisabled", value);

    }
            
    private String roleTemplateId;
     
    /**
    * Gets the role Template Id.
    *
    * @return the String
    */
    public String getRoleTemplateId() {
        return this.roleTemplateId; 
    }

    /**
    * Sets the role Template Id.
    *
    * @param value the String
    */
    public void setRoleTemplateId(String value) { 
        this.roleTemplateId = value; 
        valueChanged("roleTemplateId", value);

    }
    
        
    private java.util.List<DirectoryObject> members = null;
    
    
     
    /**
    * Gets the members.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getMembers() {
        return this.members; 
    }

    /**
    * Sets the members.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setMembers(java.util.List<DirectoryObject> value) { 
        this.members = value; 
        valueChanged("members", value);

    }
    
        
    private java.util.List<DirectoryObject> memberOf = null;
    
    
     
    /**
    * Gets the member Of.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.memberOf; 
    }

    /**
    * Sets the member Of.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setMemberOf(java.util.List<DirectoryObject> value) { 
        this.memberOf = value; 
        valueChanged("memberOf", value);

    }
    
        
    private java.util.List<DirectoryObject> owners = null;
    
    
     
    /**
    * Gets the owners.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getOwners() {
        return this.owners; 
    }

    /**
    * Sets the owners.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setOwners(java.util.List<DirectoryObject> value) { 
        this.owners = value; 
        valueChanged("owners", value);

    }
    
        
    private java.util.List<DirectoryObject> ownedObjects = null;
    
    
     
    /**
    * Gets the owned Objects.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getOwnedObjects() {
        return this.ownedObjects; 
    }

    /**
    * Sets the owned Objects.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setOwnedObjects(java.util.List<DirectoryObject> value) { 
        this.ownedObjects = value; 
        valueChanged("ownedObjects", value);

    }
}

