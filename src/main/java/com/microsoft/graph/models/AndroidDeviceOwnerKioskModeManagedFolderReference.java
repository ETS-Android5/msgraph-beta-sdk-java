// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AndroidDeviceOwnerKioskModeHomeScreenItem;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Kiosk Mode Managed Folder Reference.
 */
public class AndroidDeviceOwnerKioskModeManagedFolderReference extends AndroidDeviceOwnerKioskModeHomeScreenItem implements IJsonBackedObject {


    /**
     * The Folder Identifier.
     * Unique identifier for the folder
     */
    @SerializedName(value = "folderIdentifier", alternate = {"FolderIdentifier"})
    @Expose
	@Nullable
    public String folderIdentifier;

    /**
     * The Folder Name.
     * Name of the folder
     */
    @SerializedName(value = "folderName", alternate = {"FolderName"})
    @Expose
	@Nullable
    public String folderName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
