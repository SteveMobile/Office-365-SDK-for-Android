/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.fileservices;

/**
 * The type Current User Request Context.
*/
public class CurrentUserRequestContext extends ODataBaseEntity {

    public CurrentUserRequestContext(){
        setODataType("#Microsoft.CoreServices.CurrentUserRequestContext");
    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getid() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setid(String value) { 
        this.id = value; 
    }
            
    private Drive drive;
     
    /**
    * Gets the drive.
    *
    * @return the Drive
    */
    public Drive getdrive() {
        return this.drive; 
    }

    /**
    * Sets the drive.
    *
    * @param value the Drive
    */
    public void setdrive(Drive value) { 
        this.drive = value; 
    }
    
        
    private java.util.List<Item> files = null;
    
    
     
    /**
    * Gets the files.
    *
    * @return the java.util.List<Item>
    */
    public java.util.List<Item> getfiles() {
        return this.files; 
    }

    /**
    * Sets the files.
    *
    * @param value the java.util.List<Item>
    */
    public void setfiles(java.util.List<Item> value) { 
        this.files = value; 
    }
}

