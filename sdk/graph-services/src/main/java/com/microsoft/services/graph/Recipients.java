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

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Recipients.
*/
public class Recipients extends ODataBaseEntity {

    public Recipients(){
        setODataType("#Microsoft.Graph.recipients");
    }

    private String email;

    /**
    * Gets the email.
    *
    * @return the String
    */
    public String getEmail() {
        return this.email; 
    }

    /**
    * Sets the email.
    *
    * @param value the String
    */
    public void setEmail(String value) { 
        this.email = value;
        valueChanged("email", value);

    }

    private String alias;

    /**
    * Gets the alias.
    *
    * @return the String
    */
    public String getAlias() {
        return this.alias; 
    }

    /**
    * Sets the alias.
    *
    * @param value the String
    */
    public void setAlias(String value) { 
        this.alias = value;
        valueChanged("alias", value);

    }

    private String objectId;

    /**
    * Gets the object Id.
    *
    * @return the String
    */
    public String getObjectId() {
        return this.objectId; 
    }

    /**
    * Sets the object Id.
    *
    * @param value the String
    */
    public void setObjectId(String value) { 
        this.objectId = value;
        valueChanged("objectId", value);

    }

    private String permissionIdentityType;

    /**
    * Gets the permission Identity Type.
    *
    * @return the String
    */
    public String getPermissionIdentityType() {
        return this.permissionIdentityType; 
    }

    /**
    * Sets the permission Identity Type.
    *
    * @param value the String
    */
    public void setPermissionIdentityType(String value) { 
        this.permissionIdentityType = value;
        valueChanged("permissionIdentityType", value);

    }
}
