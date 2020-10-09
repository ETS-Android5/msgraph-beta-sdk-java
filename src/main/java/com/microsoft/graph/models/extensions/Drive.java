// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.Quota;
import com.microsoft.graph.models.extensions.SharepointIds;
import com.microsoft.graph.models.extensions.SystemFacet;
import com.microsoft.graph.models.extensions.ItemActivityOLD;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.requests.extensions.ItemActivityOLDCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive.
 */
public class Drive extends BaseItem implements IJsonBackedObject {


    /**
     * The Drive Type.
     * Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
     */
    @SerializedName(value = "driveType", alternate = {"DriveType"})
    @Expose
    public String driveType;

    /**
     * The Owner.
     * Optional. The user account that owns the drive. Read-only.
     */
    @SerializedName(value = "owner", alternate = {"Owner"})
    @Expose
    public IdentitySet owner;

    /**
     * The Quota.
     * Optional. Information about the drive's storage space quota. Read-only.
     */
    @SerializedName(value = "quota", alternate = {"Quota"})
    @Expose
    public Quota quota;

    /**
     * The Share Point Ids.
     * 
     */
    @SerializedName(value = "sharePointIds", alternate = {"SharePointIds"})
    @Expose
    public SharepointIds sharePointIds;

    /**
     * The System.
     * If present, indicates that this is a system-managed drive. Read-only.
     */
    @SerializedName(value = "system", alternate = {"System"})
    @Expose
    public SystemFacet system;

    /**
     * The Activities.
     * 
     */
    @SerializedName(value = "activities", alternate = {"Activities"})
    @Expose
    public ItemActivityOLDCollectionPage activities;

    /**
     * The Bundles.
     * 
     */
    @SerializedName(value = "bundles", alternate = {"Bundles"})
    @Expose
    public DriveItemCollectionPage bundles;

    /**
     * The Following.
     * The list of items the user is following. Only in OneDrive for Business.
     */
    @SerializedName(value = "following", alternate = {"Following"})
    @Expose
    public DriveItemCollectionPage following;

    /**
     * The Items.
     * All items contained in the drive. Read-only. Nullable.
     */
    @SerializedName(value = "items", alternate = {"Items"})
    @Expose
    public DriveItemCollectionPage items;

    /**
     * The List.
     * For drives in SharePoint, the underlying document library list. Read-only. Nullable.
     */
    @SerializedName(value = "list", alternate = {"List"})
    @Expose
    public List list;

    /**
     * The Root.
     * The root folder of the drive. Read-only.
     */
    @SerializedName(value = "root", alternate = {"Root"})
    @Expose
    public DriveItem root;

    /**
     * The Special.
     * Collection of common folders available in OneDrive. Read-only. Nullable.
     */
    @SerializedName(value = "special", alternate = {"Special"})
    @Expose
    public DriveItemCollectionPage special;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("activities")) {
            activities = serializer.deserializeObject(json.get("activities").toString(), ItemActivityOLDCollectionPage.class);
        }

        if (json.has("bundles")) {
            bundles = serializer.deserializeObject(json.get("bundles").toString(), DriveItemCollectionPage.class);
        }

        if (json.has("following")) {
            following = serializer.deserializeObject(json.get("following").toString(), DriveItemCollectionPage.class);
        }

        if (json.has("items")) {
            items = serializer.deserializeObject(json.get("items").toString(), DriveItemCollectionPage.class);
        }

        if (json.has("special")) {
            special = serializer.deserializeObject(json.get("special").toString(), DriveItemCollectionPage.class);
        }
    }
}
