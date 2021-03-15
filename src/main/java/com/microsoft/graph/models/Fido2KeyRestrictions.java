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
import com.microsoft.graph.models.Fido2RestrictionEnforcementType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Fido2Key Restrictions.
 */
public class Fido2KeyRestrictions implements IJsonBackedObject {

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
     * The Aa Guids.
     * A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers.
     */
    @SerializedName(value = "aaGuids", alternate = {"AaGuids"})
    @Expose
	@Nullable
    public java.util.List<String> aaGuids;

    /**
     * The Enforcement Type.
     * Enforcement type. Possible values are: allow, block.
     */
    @SerializedName(value = "enforcementType", alternate = {"EnforcementType"})
    @Expose
	@Nullable
    public Fido2RestrictionEnforcementType enforcementType;

    /**
     * The Is Enforced.
     * Determines if the configured key enforcement is enabled.
     */
    @SerializedName(value = "isEnforced", alternate = {"IsEnforced"})
    @Expose
	@Nullable
    public Boolean isEnforced;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
