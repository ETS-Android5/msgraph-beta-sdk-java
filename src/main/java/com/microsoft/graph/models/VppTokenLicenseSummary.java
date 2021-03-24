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
 * The class for the Vpp Token License Summary.
 */
public class VppTokenLicenseSummary implements IJsonBackedObject {

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
     * The Apple Id.
     * The Apple Id associated with the given Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "appleId", alternate = {"AppleId"})
    @Expose
	@Nullable
    public String appleId;

    /**
     * The Available License Count.
     * The number of VPP licenses available.
     */
    @SerializedName(value = "availableLicenseCount", alternate = {"AvailableLicenseCount"})
    @Expose
	@Nullable
    public Integer availableLicenseCount;

    /**
     * The Organization Name.
     * The organization associated with the Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "organizationName", alternate = {"OrganizationName"})
    @Expose
	@Nullable
    public String organizationName;

    /**
     * The Used License Count.
     * The number of VPP licenses in use.
     */
    @SerializedName(value = "usedLicenseCount", alternate = {"UsedLicenseCount"})
    @Expose
	@Nullable
    public Integer usedLicenseCount;

    /**
     * The Vpp Token Id.
     * Identifier of the VPP token.
     */
    @SerializedName(value = "vppTokenId", alternate = {"VppTokenId"})
    @Expose
	@Nullable
    public String vppTokenId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
