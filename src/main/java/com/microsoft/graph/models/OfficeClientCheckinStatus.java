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


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Checkin Status.
 */
public class OfficeClientCheckinStatus implements IJsonBackedObject {

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
     * The Applied Policies.
     * 
     */
    @SerializedName(value = "appliedPolicies", alternate = {"AppliedPolicies"})
    @Expose
	@Nullable
    public java.util.List<String> appliedPolicies;

    /**
     * The Checkin Date Time.
     * 
     */
    @SerializedName(value = "checkinDateTime", alternate = {"CheckinDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime checkinDateTime;

    /**
     * The Device Name.
     * 
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Device Platform.
     * 
     */
    @SerializedName(value = "devicePlatform", alternate = {"DevicePlatform"})
    @Expose
	@Nullable
    public String devicePlatform;

    /**
     * The Device Platform Version.
     * 
     */
    @SerializedName(value = "devicePlatformVersion", alternate = {"DevicePlatformVersion"})
    @Expose
	@Nullable
    public String devicePlatformVersion;

    /**
     * The Error Message.
     * 
     */
    @SerializedName(value = "errorMessage", alternate = {"ErrorMessage"})
    @Expose
	@Nullable
    public String errorMessage;

    /**
     * The User Id.
     * 
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The Was Successful.
     * 
     */
    @SerializedName(value = "wasSuccessful", alternate = {"WasSuccessful"})
    @Expose
	@Nullable
    public Boolean wasSuccessful;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
