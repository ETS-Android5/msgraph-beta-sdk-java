// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Root;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Collection.
 */
public class SiteCollection implements IJsonBackedObject {

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
     * The Data Location Code.
     * The geographic region code for where this site collection resides. Read-only.
     */
    @SerializedName(value = "dataLocationCode", alternate = {"DataLocationCode"})
    @Expose
	@Nullable
    public String dataLocationCode;

    /**
     * The Hostname.
     * The hostname for the site collection. Read-only.
     */
    @SerializedName(value = "hostname", alternate = {"Hostname"})
    @Expose
	@Nullable
    public String hostname;

    /**
     * The Root.
     * If present, indicates that this is a root site collection in SharePoint. Read-only.
     */
    @SerializedName(value = "root", alternate = {"Root"})
    @Expose
	@Nullable
    public Root root;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
