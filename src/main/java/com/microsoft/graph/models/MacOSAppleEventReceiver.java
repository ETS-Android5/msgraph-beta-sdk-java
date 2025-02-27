// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MacOSProcessIdentifierType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSApple Event Receiver.
 */
public class MacOSAppleEventReceiver implements IJsonBackedObject {

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
     * The Allowed.
     * Allow or block this app from receiving Apple events.
     */
    @SerializedName(value = "allowed", alternate = {"Allowed"})
    @Expose
	@Nullable
    public Boolean allowed;

    /**
     * The Code Requirement.
     * Code requirement for the app or binary that receives the Apple Event.
     */
    @SerializedName(value = "codeRequirement", alternate = {"CodeRequirement"})
    @Expose
	@Nullable
    public String codeRequirement;

    /**
     * The Identifier.
     * Bundle ID of the app or file path of the process or executable that receives the Apple Event.
     */
    @SerializedName(value = "identifier", alternate = {"Identifier"})
    @Expose
	@Nullable
    public String identifier;

    /**
     * The Identifier Type.
     * Use bundle ID for an app or path for a process or executable that receives the Apple Event. Possible values are: bundleID, path.
     */
    @SerializedName(value = "identifierType", alternate = {"IdentifierType"})
    @Expose
	@Nullable
    public MacOSProcessIdentifierType identifierType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
