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
package com.microsoft.services.outlook;





/**
 * The type Contact Folder.
*/
public class ContactFolder extends Entity {

    public ContactFolder(){
        setODataType("#Microsoft.OutlookServices.ContactFolder");
    }
            
    private String ParentFolderId;
     
    /**
    * Gets the Parent Folder Id.
    *
    * @return the String
    */
    public String getParentFolderId() {
        return this.ParentFolderId; 
    }

    /**
    * Sets the Parent Folder Id.
    *
    * @param value the String
    */
    public void setParentFolderId(String value) { 
        this.ParentFolderId = value; 
        valueChanged("ParentFolderId", value);

    }
            
    private String DisplayName;
     
    /**
    * Gets the Display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.DisplayName; 
    }

    /**
    * Sets the Display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.DisplayName = value; 
        valueChanged("DisplayName", value);

    }
    
        
    private java.util.List<Contact> Contacts = null;
    
    
     
    /**
    * Gets the Contacts.
    *
    * @return the java.util.List<Contact>
    */
    public java.util.List<Contact> getContacts() {
        return this.Contacts; 
    }

    /**
    * Sets the Contacts.
    *
    * @param value the java.util.List<Contact>
    */
    public void setContacts(java.util.List<Contact> value) { 
        this.Contacts = value; 
        valueChanged("Contacts", value);

    }
    
        
    private java.util.List<ContactFolder> ChildFolders = null;
    
    
     
    /**
    * Gets the Child Folders.
    *
    * @return the java.util.List<ContactFolder>
    */
    public java.util.List<ContactFolder> getChildFolders() {
        return this.ChildFolders; 
    }

    /**
    * Sets the Child Folders.
    *
    * @param value the java.util.List<ContactFolder>
    */
    public void setChildFolders(java.util.List<ContactFolder> value) { 
        this.ChildFolders = value; 
        valueChanged("ChildFolders", value);

    }
}

