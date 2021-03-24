// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Object File.
 */
public class GroupPolicyObjectFile extends Entity implements IJsonBackedObject {


    /**
     * The Content.
     * The Group Policy Object file content.
     */
    @SerializedName(value = "content", alternate = {"Content"})
    @Expose
	@Nullable
    public String content;

    /**
     * The Created Date Time.
     * The date and time at which the GroupPolicy was first uploaded.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Group Policy Object Id.
     * The Group Policy Object GUID from GPO Xml content
     */
    @SerializedName(value = "groupPolicyObjectId", alternate = {"GroupPolicyObjectId"})
    @Expose
	@Nullable
    public java.util.UUID groupPolicyObjectId;

    /**
     * The Last Modified Date Time.
     * The date and time at which the GroupPolicyObjectFile was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Ou Distinguished Name.
     * The distinguished name of the OU.
     */
    @SerializedName(value = "ouDistinguishedName", alternate = {"OuDistinguishedName"})
    @Expose
	@Nullable
    public String ouDistinguishedName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
