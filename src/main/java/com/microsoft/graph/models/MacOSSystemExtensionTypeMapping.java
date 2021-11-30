// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MacOSSystemExtensionType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSystem Extension Type Mapping.
 */
public class MacOSSystemExtensionTypeMapping implements IJsonBackedObject {

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
     * The Allowed Types.
     * Gets or sets the allowed macOS system extension types. Possible values are: driverExtensionsAllowed, networkExtensionsAllowed, endpointSecurityExtensionsAllowed.
     */
    @SerializedName(value = "allowedTypes", alternate = {"AllowedTypes"})
    @Expose
	@Nullable
    public EnumSet<MacOSSystemExtensionType> allowedTypes;

    /**
     * The Team Identifier.
     * Gets or sets the team identifier used to sign the system extension.
     */
    @SerializedName(value = "teamIdentifier", alternate = {"TeamIdentifier"})
    @Expose
	@Nullable
    public String teamIdentifier;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
