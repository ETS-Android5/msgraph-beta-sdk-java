// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MicrosoftManagedDesktopType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Managed Desktop.
 */
public class MicrosoftManagedDesktop implements IJsonBackedObject {

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
     * The Profile.
     * The name of the Microsoft Managed Desktop profile that the Windows 365 Cloud PC is associated with.
     */
    @SerializedName(value = "profile", alternate = {"Profile"})
    @Expose
	@Nullable
    public String profile;

    /**
     * The Type.
     * Indicates whether the provisioning policy enables Microsoft Managed Desktop. It indicates the type of plan under which the device is managed if the provisioning policy is enabled. Possible values are: notManaged, premiumManaged, standardManaged, starterManaged, unknownFutureValue.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public MicrosoftManagedDesktopType type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
