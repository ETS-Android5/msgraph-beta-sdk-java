// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WindowsKioskAppType;
import com.microsoft.graph.models.WindowsAppStartLayoutTileSize;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Kiosk App Base.
 */
public class WindowsKioskAppBase implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The App Type.
     * The app type
     */
    @SerializedName(value = "appType", alternate = {"AppType"})
    @Expose
	@Nullable
    public WindowsKioskAppType appType;

    /**
     * The Auto Launch.
     * Allow the app to be auto-launched in multi-app kiosk mode
     */
    @SerializedName(value = "autoLaunch", alternate = {"AutoLaunch"})
    @Expose
	@Nullable
    public Boolean autoLaunch;

    /**
     * The Name.
     * Represents the friendly name of an app
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Start Layout Tile Size.
     * The app tile size for the start layout
     */
    @SerializedName(value = "startLayoutTileSize", alternate = {"StartLayoutTileSize"})
    @Expose
	@Nullable
    public WindowsAppStartLayoutTileSize startLayoutTileSize;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
