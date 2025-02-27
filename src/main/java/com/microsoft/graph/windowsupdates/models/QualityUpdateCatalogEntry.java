// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.windowsupdates.models.QualityUpdateClassification;
import com.microsoft.graph.windowsupdates.models.SoftwareUpdateCatalogEntry;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Quality Update Catalog Entry.
 */
public class QualityUpdateCatalogEntry extends SoftwareUpdateCatalogEntry implements IJsonBackedObject {


    /**
     * The Is Expeditable.
     * Indicates whether the content can be deployed as an expedited quality update. Read-only.
     */
    @SerializedName(value = "isExpeditable", alternate = {"IsExpeditable"})
    @Expose
	@Nullable
    public Boolean isExpeditable;

    /**
     * The Quality Update Classification.
     * The classification on the quality update. Possible values are: all, security, nonSecurity, unknownFutureValue. Read-only.
     */
    @SerializedName(value = "qualityUpdateClassification", alternate = {"QualityUpdateClassification"})
    @Expose
	@Nullable
    public QualityUpdateClassification qualityUpdateClassification;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
