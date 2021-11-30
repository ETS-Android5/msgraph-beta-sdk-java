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
 * The class for the User Activation Counts.
 */
public class UserActivationCounts implements IJsonBackedObject {

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
     * The Activated On Shared Computer.
     * True if the user used the product on a shared computer before.
     */
    @SerializedName(value = "activatedOnSharedComputer", alternate = {"ActivatedOnSharedComputer"})
    @Expose
	@Nullable
    public Boolean activatedOnSharedComputer;

    /**
     * The Android.
     * The activation count on an Android device.
     */
    @SerializedName(value = "android", alternate = {"Android"})
    @Expose
	@Nullable
    public Long android;

    /**
     * The Ios.
     * The activation count on iOS.
     */
    @SerializedName(value = "ios", alternate = {"Ios"})
    @Expose
	@Nullable
    public Long ios;

    /**
     * The Last Activated Date.
     * The date of the latest activation.
     */
    @SerializedName(value = "lastActivatedDate", alternate = {"LastActivatedDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly lastActivatedDate;

    /**
     * The Mac.
     * The activation count on Mac OS.
     */
    @SerializedName(value = "mac", alternate = {"Mac"})
    @Expose
	@Nullable
    public Long mac;

    /**
     * The Product Type.
     * The product type, such as 'Microsoft 365 ProPlus'or 'Project Client'.
     */
    @SerializedName(value = "productType", alternate = {"ProductType"})
    @Expose
	@Nullable
    public String productType;

    /**
     * The Windows.
     * The activation count on Windows. This number includes every activation on any Windows computer.
     */
    @SerializedName(value = "windows", alternate = {"Windows"})
    @Expose
	@Nullable
    public Long windows;

    /**
     * The Windows10Mobile.
     * The activation count on Windows 10 mobile.
     */
    @SerializedName(value = "windows10Mobile", alternate = {"Windows10Mobile"})
    @Expose
	@Nullable
    public Long windows10Mobile;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
