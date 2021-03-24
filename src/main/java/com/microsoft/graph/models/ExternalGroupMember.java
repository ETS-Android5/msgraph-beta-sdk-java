// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IdentitySourceType;
import com.microsoft.graph.models.ExternalGroupMemberType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Group Member.
 * @deprecated The OData type annotation for this entity is being deprecated by Aug 2021. Please strip the @odata.type annotations for this specific entity from your request payloads before the deprecation date.
 */
@Deprecated
public class ExternalGroupMember extends Entity implements IJsonBackedObject {


    /**
     * The Identity Source.
     * The identity source that the member belongs to. Possible values are: azureActiveDirectory, external.
     */
    @SerializedName(value = "identitySource", alternate = {"IdentitySource"})
    @Expose
	@Nullable
    public IdentitySourceType identitySource;

    /**
     * The Type.
     * The type of member added to the external group. Possible values are: user or group when the identitySource is azureActiveDirectory and just group when the identitySource is external.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public ExternalGroupMemberType type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
