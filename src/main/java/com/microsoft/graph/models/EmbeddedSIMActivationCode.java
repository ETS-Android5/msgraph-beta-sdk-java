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
 * The class for the Embedded SIMActivation Code.
 */
public class EmbeddedSIMActivationCode implements IJsonBackedObject {

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
     * The Integrated Circuit Card Identifier.
     * The input must match the following regular expression: '^[0-9]{19}[0-9]?$'.
     */
    @SerializedName(value = "integratedCircuitCardIdentifier", alternate = {"IntegratedCircuitCardIdentifier"})
    @Expose
	@Nullable
    public String integratedCircuitCardIdentifier;

    /**
     * The Matching Identifier.
     * The input must match the following regular expression: '^[a-zA-Z0-9&#92;-]*$'.
     */
    @SerializedName(value = "matchingIdentifier", alternate = {"MatchingIdentifier"})
    @Expose
	@Nullable
    public String matchingIdentifier;

    /**
     * The Smdp Plus Server Address.
     * The input must match the following regular expression: '^([a-zA-Z0-9]+(-[a-zA-Z0-9]+)*&#92;.)+[a-zA-Z]{2,}$'.
     */
    @SerializedName(value = "smdpPlusServerAddress", alternate = {"SmdpPlusServerAddress"})
    @Expose
	@Nullable
    public String smdpPlusServerAddress;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
