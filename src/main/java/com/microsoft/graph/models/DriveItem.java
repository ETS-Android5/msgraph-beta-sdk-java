// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.Audio;
import com.microsoft.graph.models.Bundle;
import com.microsoft.graph.models.Deleted;
import com.microsoft.graph.models.File;
import com.microsoft.graph.models.FileSystemInfo;
import com.microsoft.graph.models.Folder;
import com.microsoft.graph.models.Image;
import com.microsoft.graph.models.GeoCoordinates;
import com.microsoft.graph.models.Malware;
import com.microsoft.graph.models.Media;
import com.microsoft.graph.models.PendingOperations;
import com.microsoft.graph.models.Photo;
import com.microsoft.graph.models.PublicationFacet;
import com.microsoft.graph.models.RemoteItem;
import com.microsoft.graph.models.Root;
import com.microsoft.graph.models.SearchResult;
import com.microsoft.graph.models.Shared;
import com.microsoft.graph.models.SharepointIds;
import com.microsoft.graph.models.DriveItemSource;
import com.microsoft.graph.models.SpecialFolder;
import com.microsoft.graph.models.Video;
import com.microsoft.graph.models.Workbook;
import com.microsoft.graph.models.ItemActivityOLD;
import com.microsoft.graph.models.ItemAnalytics;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.ListItem;
import com.microsoft.graph.models.Permission;
import com.microsoft.graph.models.Subscription;
import com.microsoft.graph.models.ThumbnailSet;
import com.microsoft.graph.models.DriveItemVersion;
import com.microsoft.graph.models.BaseItem;
import com.microsoft.graph.requests.ItemActivityOLDCollectionPage;
import com.microsoft.graph.requests.DriveItemCollectionPage;
import com.microsoft.graph.requests.PermissionCollectionPage;
import com.microsoft.graph.requests.SubscriptionCollectionPage;
import com.microsoft.graph.requests.ThumbnailSetCollectionPage;
import com.microsoft.graph.requests.DriveItemVersionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item.
 */
public class DriveItem extends BaseItem implements IJsonBackedObject {


    /**
     * The Audio.
     * Audio metadata, if the item is an audio file. Read-only. Read-only. Only on OneDrive Personal.
     */
    @SerializedName(value = "audio", alternate = {"Audio"})
    @Expose
	@Nullable
    public Audio audio;

    /**
     * The Bundle.
     * Bundle metadata, if the item is a bundle. Read-only.
     */
    @SerializedName(value = "bundle", alternate = {"Bundle"})
    @Expose
	@Nullable
    public Bundle bundle;

    /**
     * The CTag.
     * An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.
     */
    @SerializedName(value = "cTag", alternate = {"CTag"})
    @Expose
	@Nullable
    public String cTag;

    /**
     * The Deleted.
     * Information about the deleted state of the item. Read-only.
     */
    @SerializedName(value = "deleted", alternate = {"Deleted"})
    @Expose
	@Nullable
    public Deleted deleted;

    /**
     * The File.
     * File metadata, if the item is a file. Read-only.
     */
    @SerializedName(value = "file", alternate = {"File"})
    @Expose
	@Nullable
    public File file;

    /**
     * The File System Info.
     * File system information on client. Read-write.
     */
    @SerializedName(value = "fileSystemInfo", alternate = {"FileSystemInfo"})
    @Expose
	@Nullable
    public FileSystemInfo fileSystemInfo;

    /**
     * The Folder.
     * Folder metadata, if the item is a folder. Read-only.
     */
    @SerializedName(value = "folder", alternate = {"Folder"})
    @Expose
	@Nullable
    public Folder folder;

    /**
     * The Image.
     * Image metadata, if the item is an image. Read-only.
     */
    @SerializedName(value = "image", alternate = {"Image"})
    @Expose
	@Nullable
    public Image image;

    /**
     * The Location.
     * Location metadata, if the item has location data. Read-only.
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
	@Nullable
    public GeoCoordinates location;

    /**
     * The Malware.
     * Malware metadata, if the item was detected to contain malware. Read-only.
     */
    @SerializedName(value = "malware", alternate = {"Malware"})
    @Expose
	@Nullable
    public Malware malware;

    /**
     * The Media.
     * Information about the media (audio or video) item. Read-write. Only on OneDrive for Business and SharePoint.
     */
    @SerializedName(value = "media", alternate = {"Media"})
    @Expose
	@Nullable
    public Media media;

    /**
     * The Package.
     * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     */
    @SerializedName(value = "package", alternate = {"Package"})
    @Expose
	@Nullable
    public com.microsoft.graph.models.Package msgraphPackage;

    /**
     * The Pending Operations.
     * If present, indicates that one or more operations that might affect the state of the driveItem are pending completion. Read-only.
     */
    @SerializedName(value = "pendingOperations", alternate = {"PendingOperations"})
    @Expose
	@Nullable
    public PendingOperations pendingOperations;

    /**
     * The Photo.
     * Photo metadata, if the item is a photo. Read-only.
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
	@Nullable
    public Photo photo;

    /**
     * The Publication.
     * Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only.
     */
    @SerializedName(value = "publication", alternate = {"Publication"})
    @Expose
	@Nullable
    public PublicationFacet publication;

    /**
     * The Remote Item.
     * Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
     */
    @SerializedName(value = "remoteItem", alternate = {"RemoteItem"})
    @Expose
	@Nullable
    public RemoteItem remoteItem;

    /**
     * The Root.
     * If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
     */
    @SerializedName(value = "root", alternate = {"Root"})
    @Expose
	@Nullable
    public Root root;

    /**
     * The Search Result.
     * Search metadata, if the item is from a search result. Read-only.
     */
    @SerializedName(value = "searchResult", alternate = {"SearchResult"})
    @Expose
	@Nullable
    public SearchResult searchResult;

    /**
     * The Shared.
     * Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     */
    @SerializedName(value = "shared", alternate = {"Shared"})
    @Expose
	@Nullable
    public Shared shared;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName(value = "sharepointIds", alternate = {"SharepointIds"})
    @Expose
	@Nullable
    public SharepointIds sharepointIds;

    /**
     * The Size.
     * Size of the item in bytes. Read-only.
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public Long size;

    /**
     * The Source.
     * Information about the drive item source. Read-only. Only on OneDrive for Business and SharePoint.
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public DriveItemSource source;

    /**
     * The Special Folder.
     * If the current item is also available as a special folder, this facet is returned. Read-only.
     */
    @SerializedName(value = "specialFolder", alternate = {"SpecialFolder"})
    @Expose
	@Nullable
    public SpecialFolder specialFolder;

    /**
     * The Video.
     * Video metadata, if the item is a video. Read-only.
     */
    @SerializedName(value = "video", alternate = {"Video"})
    @Expose
	@Nullable
    public Video video;

    /**
     * The Web Dav Url.
     * WebDAV compatible URL for the item.
     */
    @SerializedName(value = "webDavUrl", alternate = {"WebDavUrl"})
    @Expose
	@Nullable
    public String webDavUrl;

    /**
     * The Workbook.
     * For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     */
    @SerializedName(value = "workbook", alternate = {"Workbook"})
    @Expose
	@Nullable
    public Workbook workbook;

    /**
     * The Activities.
     * The list of recent activities that took place on this item.
     */
    @SerializedName(value = "activities", alternate = {"Activities"})
    @Expose
	@Nullable
    public ItemActivityOLDCollectionPage activities;

    /**
     * The Analytics.
     * Analytics about the view activities that took place on this item.
     */
    @SerializedName(value = "analytics", alternate = {"Analytics"})
    @Expose
	@Nullable
    public ItemAnalytics analytics;

    /**
     * The Children.
     * Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.
     */
    @SerializedName(value = "children", alternate = {"Children"})
    @Expose
	@Nullable
    public DriveItemCollectionPage children;

    /**
     * The List Item.
     * For drives in SharePoint, the associated document library list item. Read-only. Nullable.
     */
    @SerializedName(value = "listItem", alternate = {"ListItem"})
    @Expose
	@Nullable
    public ListItem listItem;

    /**
     * The Permissions.
     * The set of permissions for the item. Read-only. Nullable.
     */
    @SerializedName(value = "permissions", alternate = {"Permissions"})
    @Expose
	@Nullable
    public PermissionCollectionPage permissions;

    /**
     * The Subscriptions.
     * The set of subscriptions on the item. Only supported on the root of a drive.
     */
    @SerializedName(value = "subscriptions", alternate = {"Subscriptions"})
    @Expose
	@Nullable
    public SubscriptionCollectionPage subscriptions;

    /**
     * The Thumbnails.
     * Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.
     */
    @SerializedName(value = "thumbnails", alternate = {"Thumbnails"})
    @Expose
	@Nullable
    public ThumbnailSetCollectionPage thumbnails;

    /**
     * The Versions.
     * The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
     */
    @SerializedName(value = "versions", alternate = {"Versions"})
    @Expose
	@Nullable
    public DriveItemVersionCollectionPage versions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("activities")) {
            activities = serializer.deserializeObject(json.get("activities"), ItemActivityOLDCollectionPage.class);
        }

        if (json.has("children")) {
            children = serializer.deserializeObject(json.get("children"), DriveItemCollectionPage.class);
        }

        if (json.has("permissions")) {
            permissions = serializer.deserializeObject(json.get("permissions"), PermissionCollectionPage.class);
        }

        if (json.has("subscriptions")) {
            subscriptions = serializer.deserializeObject(json.get("subscriptions"), SubscriptionCollectionPage.class);
        }

        if (json.has("thumbnails")) {
            thumbnails = serializer.deserializeObject(json.get("thumbnails"), ThumbnailSetCollectionPage.class);
        }

        if (json.has("versions")) {
            versions = serializer.deserializeObject(json.get("versions"), DriveItemVersionCollectionPage.class);
        }
    }
}
