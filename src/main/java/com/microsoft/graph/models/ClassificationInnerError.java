// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Classification Inner Error.
 */
public class ClassificationInnerError implements IJsonBackedObject {

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
     * The Activity Id.
     * 
     */
    @SerializedName(value = "activityId", alternate = {"ActivityId"})
    @Expose
	@Nullable
    public String activityId;

    /**
     * The Client Request Id.
     * 
     */
    @SerializedName(value = "clientRequestId", alternate = {"ClientRequestId"})
    @Expose
	@Nullable
    public String clientRequestId;

    /**
     * The Code.
     * 
     */
    @SerializedName(value = "code", alternate = {"Code"})
    @Expose
	@Nullable
    public String code;

    /**
     * The Error Date Time.
     * 
     */
    @SerializedName(value = "errorDateTime", alternate = {"ErrorDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime errorDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
