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
 * The type Location.
*/
public class Location extends ODataBaseEntity {

    public Location(){
        setODataType("#Microsoft.Graph.location");
    }

    private Double altitude;

    /**
    * Gets the altitude.
    *
    * @return the Double
    */
    public Double getAltitude() {
        return this.altitude; 
    }

    /**
    * Sets the altitude.
    *
    * @param value the Double
    */
    public void setAltitude(Double value) { 
        this.altitude = value;
        valueChanged("altitude", value);

    }

    private Double latitude;

    /**
    * Gets the latitude.
    *
    * @return the Double
    */
    public Double getLatitude() {
        return this.latitude; 
    }

    /**
    * Sets the latitude.
    *
    * @param value the Double
    */
    public void setLatitude(Double value) { 
        this.latitude = value;
        valueChanged("latitude", value);

    }

    private Double longitude;

    /**
    * Gets the longitude.
    *
    * @return the Double
    */
    public Double getLongitude() {
        return this.longitude; 
    }

    /**
    * Sets the longitude.
    *
    * @param value the Double
    */
    public void setLongitude(Double value) { 
        this.longitude = value;
        valueChanged("longitude", value);

    }
}
