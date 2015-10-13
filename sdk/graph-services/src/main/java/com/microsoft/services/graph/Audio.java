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
 * The type Audio.
*/
public class Audio extends ODataBaseEntity {

    public Audio(){
        setODataType("#Microsoft.Graph.audio");
    }

    private String album;

    /**
    * Gets the album.
    *
    * @return the String
    */
    public String getAlbum() {
        return this.album; 
    }

    /**
    * Sets the album.
    *
    * @param value the String
    */
    public void setAlbum(String value) { 
        this.album = value;
        valueChanged("album", value);

    }

    private String albumArtist;

    /**
    * Gets the album Artist.
    *
    * @return the String
    */
    public String getAlbumArtist() {
        return this.albumArtist; 
    }

    /**
    * Sets the album Artist.
    *
    * @param value the String
    */
    public void setAlbumArtist(String value) { 
        this.albumArtist = value;
        valueChanged("albumArtist", value);

    }

    private String artist;

    /**
    * Gets the artist.
    *
    * @return the String
    */
    public String getArtist() {
        return this.artist; 
    }

    /**
    * Sets the artist.
    *
    * @param value the String
    */
    public void setArtist(String value) { 
        this.artist = value;
        valueChanged("artist", value);

    }

    private Long bitrate;

    /**
    * Gets the bitrate.
    *
    * @return the Long
    */
    public Long getBitrate() {
        return this.bitrate; 
    }

    /**
    * Sets the bitrate.
    *
    * @param value the Long
    */
    public void setBitrate(Long value) { 
        this.bitrate = value;
        valueChanged("bitrate", value);

    }

    private String composers;

    /**
    * Gets the composers.
    *
    * @return the String
    */
    public String getComposers() {
        return this.composers; 
    }

    /**
    * Sets the composers.
    *
    * @param value the String
    */
    public void setComposers(String value) { 
        this.composers = value;
        valueChanged("composers", value);

    }

    private String copyright;

    /**
    * Gets the copyright.
    *
    * @return the String
    */
    public String getCopyright() {
        return this.copyright; 
    }

    /**
    * Sets the copyright.
    *
    * @param value the String
    */
    public void setCopyright(String value) { 
        this.copyright = value;
        valueChanged("copyright", value);

    }

    private Int16 disc;

    /**
    * Gets the disc.
    *
    * @return the Int16
    */
    public Int16 getDisc() {
        return this.disc; 
    }

    /**
    * Sets the disc.
    *
    * @param value the Int16
    */
    public void setDisc(Int16 value) { 
        this.disc = value;
        valueChanged("disc", value);

    }

    private Int16 discCount;

    /**
    * Gets the disc Count.
    *
    * @return the Int16
    */
    public Int16 getDiscCount() {
        return this.discCount; 
    }

    /**
    * Sets the disc Count.
    *
    * @param value the Int16
    */
    public void setDiscCount(Int16 value) { 
        this.discCount = value;
        valueChanged("discCount", value);

    }

    private Long duration;

    /**
    * Gets the duration.
    *
    * @return the Long
    */
    public Long getDuration() {
        return this.duration; 
    }

    /**
    * Sets the duration.
    *
    * @param value the Long
    */
    public void setDuration(Long value) { 
        this.duration = value;
        valueChanged("duration", value);

    }

    private String genre;

    /**
    * Gets the genre.
    *
    * @return the String
    */
    public String getGenre() {
        return this.genre; 
    }

    /**
    * Sets the genre.
    *
    * @param value the String
    */
    public void setGenre(String value) { 
        this.genre = value;
        valueChanged("genre", value);

    }

    private Boolean hasDrm;

    /**
    * Gets the has Drm.
    *
    * @return the Boolean
    */
    public Boolean getHasDrm() {
        return this.hasDrm; 
    }

    /**
    * Sets the has Drm.
    *
    * @param value the Boolean
    */
    public void setHasDrm(Boolean value) { 
        this.hasDrm = value;
        valueChanged("hasDrm", value);

    }

    private Boolean isVariableBitrate;

    /**
    * Gets the is Variable Bitrate.
    *
    * @return the Boolean
    */
    public Boolean getIsVariableBitrate() {
        return this.isVariableBitrate; 
    }

    /**
    * Sets the is Variable Bitrate.
    *
    * @param value the Boolean
    */
    public void setIsVariableBitrate(Boolean value) { 
        this.isVariableBitrate = value;
        valueChanged("isVariableBitrate", value);

    }

    private String title;

    /**
    * Gets the title.
    *
    * @return the String
    */
    public String getTitle() {
        return this.title; 
    }

    /**
    * Sets the title.
    *
    * @param value the String
    */
    public void setTitle(String value) { 
        this.title = value;
        valueChanged("title", value);

    }

    private Integer track;

    /**
    * Gets the track.
    *
    * @return the Integer
    */
    public Integer getTrack() {
        return this.track; 
    }

    /**
    * Sets the track.
    *
    * @param value the Integer
    */
    public void setTrack(Integer value) { 
        this.track = value;
        valueChanged("track", value);

    }

    private Integer trackCount;

    /**
    * Gets the track Count.
    *
    * @return the Integer
    */
    public Integer getTrackCount() {
        return this.trackCount; 
    }

    /**
    * Sets the track Count.
    *
    * @param value the Integer
    */
    public void setTrackCount(Integer value) { 
        this.trackCount = value;
        valueChanged("trackCount", value);

    }

    private Integer year;

    /**
    * Gets the year.
    *
    * @return the Integer
    */
    public Integer getYear() {
        return this.year; 
    }

    /**
    * Sets the year.
    *
    * @param value the Integer
    */
    public void setYear(Integer value) { 
        this.year = value;
        valueChanged("year", value);

    }
}
