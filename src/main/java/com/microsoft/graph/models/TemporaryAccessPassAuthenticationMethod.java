// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AuthenticationMethod;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Temporary Access Pass Authentication Method.
 */
public class TemporaryAccessPassAuthenticationMethod extends AuthenticationMethod implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Is Usable.
     * 
     */
    @SerializedName(value = "isUsable", alternate = {"IsUsable"})
    @Expose
	@Nullable
    public Boolean isUsable;

    /**
     * The Is Usable Once.
     * 
     */
    @SerializedName(value = "isUsableOnce", alternate = {"IsUsableOnce"})
    @Expose
	@Nullable
    public Boolean isUsableOnce;

    /**
     * The Lifetime In Minutes.
     * 
     */
    @SerializedName(value = "lifetimeInMinutes", alternate = {"LifetimeInMinutes"})
    @Expose
	@Nullable
    public Integer lifetimeInMinutes;

    /**
     * The Method Usability Reason.
     * 
     */
    @SerializedName(value = "methodUsabilityReason", alternate = {"MethodUsabilityReason"})
    @Expose
	@Nullable
    public String methodUsabilityReason;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Temporary Access Pass.
     * 
     */
    @SerializedName(value = "temporaryAccessPass", alternate = {"TemporaryAccessPass"})
    @Expose
	@Nullable
    public String temporaryAccessPass;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
