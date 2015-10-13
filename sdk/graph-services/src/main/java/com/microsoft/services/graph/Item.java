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

import com.microsoft.services.orc.core.ODataStream;



/**
 * The type Item.
*/
public class Item extends ODataBaseEntity {

    public Item(){
        setODataType("#Microsoft.Graph.item");
    }
            
    private ODataStream content;
     
    /**
    * Gets the content.
    *
    * @return the ODataStream
    */
    public ODataStream getContent() {
        return this.content; 
    }

    /**
    * Sets the content.
    *
    * @param value the ODataStream
    */
    public void setContent(ODataStream value) { 
        this.content = value; 
        valueChanged("content", value);

    }
            
    private IdentitySet createdBy;
     
    /**
    * Gets the created By.
    *
    * @return the IdentitySet
    */
    public IdentitySet getCreatedBy() {
        return this.createdBy; 
    }

    /**
    * Sets the created By.
    *
    * @param value the IdentitySet
    */
    public void setCreatedBy(IdentitySet value) { 
        this.createdBy = value; 
        valueChanged("createdBy", value);

    }
            
    private java.util.Calendar createdDateTime;
     
    /**
    * Gets the created Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getCreatedDateTime() {
        return this.createdDateTime; 
    }

    /**
    * Sets the created Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setCreatedDateTime(java.util.Calendar value) { 
        this.createdDateTime = value; 
        valueChanged("createdDateTime", value);

    }
            
    private String cTag;
     
    /**
    * Gets the c Tag.
    *
    * @return the String
    */
    public String getCTag() {
        return this.cTag; 
    }

    /**
    * Sets the c Tag.
    *
    * @param value the String
    */
    public void setCTag(String value) { 
        this.cTag = value; 
        valueChanged("cTag", value);

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
            
    private String eTag;
     
    /**
    * Gets the e Tag.
    *
    * @return the String
    */
    public String getETag() {
        return this.eTag; 
    }

    /**
    * Sets the e Tag.
    *
    * @param value the String
    */
    public void setETag(String value) { 
        this.eTag = value; 
        valueChanged("eTag", value);

    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getId() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.id = value; 
        valueChanged("id", value);

    }
            
    private IdentitySet lastModifiedBy;
     
    /**
    * Gets the last Modified By.
    *
    * @return the IdentitySet
    */
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy; 
    }

    /**
    * Sets the last Modified By.
    *
    * @param value the IdentitySet
    */
    public void setLastModifiedBy(IdentitySet value) { 
        this.lastModifiedBy = value; 
        valueChanged("lastModifiedBy", value);

    }
            
    private java.util.Calendar lastModifiedDateTime;
     
    /**
    * Gets the last Modified Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastModifiedDateTime() {
        return this.lastModifiedDateTime; 
    }

    /**
    * Sets the last Modified Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastModifiedDateTime(java.util.Calendar value) { 
        this.lastModifiedDateTime = value; 
        valueChanged("lastModifiedDateTime", value);

    }
            
    private String name;
     
    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getName() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.name = value; 
        valueChanged("name", value);

    }
            
    private ItemReference parentReference;
     
    /**
    * Gets the parent Reference.
    *
    * @return the ItemReference
    */
    public ItemReference getParentReference() {
        return this.parentReference; 
    }

    /**
    * Sets the parent Reference.
    *
    * @param value the ItemReference
    */
    public void setParentReference(ItemReference value) { 
        this.parentReference = value; 
        valueChanged("parentReference", value);

    }
            
    private Long size;
     
    /**
    * Gets the size.
    *
    * @return the Long
    */
    public Long getSize() {
        return this.size; 
    }

    /**
    * Sets the size.
    *
    * @param value the Long
    */
    public void setSize(Long value) { 
        this.size = value; 
        valueChanged("size", value);

    }
            
    private String webDavUrl;
     
    /**
    * Gets the web Dav Url.
    *
    * @return the String
    */
    public String getWebDavUrl() {
        return this.webDavUrl; 
    }

    /**
    * Sets the web Dav Url.
    *
    * @param value the String
    */
    public void setWebDavUrl(String value) { 
        this.webDavUrl = value; 
        valueChanged("webDavUrl", value);

    }
            
    private String webUrl;
     
    /**
    * Gets the web Url.
    *
    * @return the String
    */
    public String getWebUrl() {
        return this.webUrl; 
    }

    /**
    * Sets the web Url.
    *
    * @param value the String
    */
    public void setWebUrl(String value) { 
        this.webUrl = value; 
        valueChanged("webUrl", value);

    }
            
    private Audio audio;
     
    /**
    * Gets the audio.
    *
    * @return the Audio
    */
    public Audio getAudio() {
        return this.audio; 
    }

    /**
    * Sets the audio.
    *
    * @param value the Audio
    */
    public void setAudio(Audio value) { 
        this.audio = value; 
        valueChanged("audio", value);

    }
            
    private Deleted deleted;
     
    /**
    * Gets the deleted.
    *
    * @return the Deleted
    */
    public Deleted getDeleted() {
        return this.deleted; 
    }

    /**
    * Sets the deleted.
    *
    * @param value the Deleted
    */
    public void setDeleted(Deleted value) { 
        this.deleted = value; 
        valueChanged("deleted", value);

    }
            
    private File file;
     
    /**
    * Gets the file.
    *
    * @return the File
    */
    public File getFile() {
        return this.file; 
    }

    /**
    * Sets the file.
    *
    * @param value the File
    */
    public void setFile(File value) { 
        this.file = value; 
        valueChanged("file", value);

    }
            
    private FileSystemInfo fileSystemInfo;
     
    /**
    * Gets the file System Info.
    *
    * @return the FileSystemInfo
    */
    public FileSystemInfo getFileSystemInfo() {
        return this.fileSystemInfo; 
    }

    /**
    * Sets the file System Info.
    *
    * @param value the FileSystemInfo
    */
    public void setFileSystemInfo(FileSystemInfo value) { 
        this.fileSystemInfo = value; 
        valueChanged("fileSystemInfo", value);

    }
            
    private Folder folder;
     
    /**
    * Gets the folder.
    *
    * @return the Folder
    */
    public Folder getFolder() {
        return this.folder; 
    }

    /**
    * Sets the folder.
    *
    * @param value the Folder
    */
    public void setFolder(Folder value) { 
        this.folder = value; 
        valueChanged("folder", value);

    }
            
    private Image image;
     
    /**
    * Gets the image.
    *
    * @return the Image
    */
    public Image getImage() {
        return this.image; 
    }

    /**
    * Sets the image.
    *
    * @param value the Image
    */
    public void setImage(Image value) { 
        this.image = value; 
        valueChanged("image", value);

    }
            
    private Location location;
     
    /**
    * Gets the location.
    *
    * @return the Location
    */
    public Location getLocation() {
        return this.location; 
    }

    /**
    * Sets the location.
    *
    * @param value the Location
    */
    public void setLocation(Location value) { 
        this.location = value; 
        valueChanged("location", value);

    }
            
    private OpenWithSet openWith;
     
    /**
    * Gets the open With.
    *
    * @return the OpenWithSet
    */
    public OpenWithSet getOpenWith() {
        return this.openWith; 
    }

    /**
    * Sets the open With.
    *
    * @param value the OpenWithSet
    */
    public void setOpenWith(OpenWithSet value) { 
        this.openWith = value; 
        valueChanged("openWith", value);

    }
            
    private Photo photo;
     
    /**
    * Gets the photo.
    *
    * @return the Photo
    */
    public Photo getPhoto() {
        return this.photo; 
    }

    /**
    * Sets the photo.
    *
    * @param value the Photo
    */
    public void setPhoto(Photo value) { 
        this.photo = value; 
        valueChanged("photo", value);

    }
            
    private SearchResult searchResult;
     
    /**
    * Gets the search Result.
    *
    * @return the SearchResult
    */
    public SearchResult getSearchResult() {
        return this.searchResult; 
    }

    /**
    * Sets the search Result.
    *
    * @param value the SearchResult
    */
    public void setSearchResult(SearchResult value) { 
        this.searchResult = value; 
        valueChanged("searchResult", value);

    }
            
    private Shared shared;
     
    /**
    * Gets the shared.
    *
    * @return the Shared
    */
    public Shared getShared() {
        return this.shared; 
    }

    /**
    * Sets the shared.
    *
    * @param value the Shared
    */
    public void setShared(Shared value) { 
        this.shared = value; 
        valueChanged("shared", value);

    }
            
    private SpecialFolder specialFolder;
     
    /**
    * Gets the special Folder.
    *
    * @return the SpecialFolder
    */
    public SpecialFolder getSpecialFolder() {
        return this.specialFolder; 
    }

    /**
    * Sets the special Folder.
    *
    * @param value the SpecialFolder
    */
    public void setSpecialFolder(SpecialFolder value) { 
        this.specialFolder = value; 
        valueChanged("specialFolder", value);

    }
            
    private Video video;
     
    /**
    * Gets the video.
    *
    * @return the Video
    */
    public Video getVideo() {
        return this.video; 
    }

    /**
    * Sets the video.
    *
    * @param value the Video
    */
    public void setVideo(Video value) { 
        this.video = value; 
        valueChanged("video", value);

    }
            
    private User createdByUser;
     
    /**
    * Gets the created By User.
    *
    * @return the User
    */
    public User getCreatedByUser() {
        return this.createdByUser; 
    }

    /**
    * Sets the created By User.
    *
    * @param value the User
    */
    public void setCreatedByUser(User value) { 
        this.createdByUser = value; 
        valueChanged("createdByUser", value);

    }
            
    private User lastModifiedByUser;
     
    /**
    * Gets the last Modified By User.
    *
    * @return the User
    */
    public User getLastModifiedByUser() {
        return this.lastModifiedByUser; 
    }

    /**
    * Sets the last Modified By User.
    *
    * @param value the User
    */
    public void setLastModifiedByUser(User value) { 
        this.lastModifiedByUser = value; 
        valueChanged("lastModifiedByUser", value);

    }
    
        
    private java.util.List<Permission> permissions = null;
    
    
     
    /**
    * Gets the permissions.
    *
    * @return the java.util.List<Permission>
    */
    public java.util.List<Permission> getPermissions() {
        return this.permissions; 
    }

    /**
    * Sets the permissions.
    *
    * @param value the java.util.List<Permission>
    */
    public void setPermissions(java.util.List<Permission> value) { 
        this.permissions = value; 
        valueChanged("permissions", value);

    }
    
        
    private java.util.List<Item> versions = null;
    
    
     
    /**
    * Gets the versions.
    *
    * @return the java.util.List<Item>
    */
    public java.util.List<Item> getVersions() {
        return this.versions; 
    }

    /**
    * Sets the versions.
    *
    * @param value the java.util.List<Item>
    */
    public void setVersions(java.util.List<Item> value) { 
        this.versions = value; 
        valueChanged("versions", value);

    }
    
        
    private java.util.List<Item> children = null;
    
    
     
    /**
    * Gets the children.
    *
    * @return the java.util.List<Item>
    */
    public java.util.List<Item> getChildren() {
        return this.children; 
    }

    /**
    * Sets the children.
    *
    * @param value the java.util.List<Item>
    */
    public void setChildren(java.util.List<Item> value) { 
        this.children = value; 
        valueChanged("children", value);

    }
    
        
    private java.util.List<ThumbnailSet> thumbnails = null;
    
    
     
    /**
    * Gets the thumbnails.
    *
    * @return the java.util.List<ThumbnailSet>
    */
    public java.util.List<ThumbnailSet> getThumbnails() {
        return this.thumbnails; 
    }

    /**
    * Sets the thumbnails.
    *
    * @param value the java.util.List<ThumbnailSet>
    */
    public void setThumbnails(java.util.List<ThumbnailSet> value) { 
        this.thumbnails = value; 
        valueChanged("thumbnails", value);

    }
}

