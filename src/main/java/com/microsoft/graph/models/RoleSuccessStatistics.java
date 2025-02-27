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
 * The class for the Role Success Statistics.
 */
public class RoleSuccessStatistics implements IJsonBackedObject {

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
     * The Permanent Fail.
     * 
     */
    @SerializedName(value = "permanentFail", alternate = {"PermanentFail"})
    @Expose
	@Nullable
    public Long permanentFail;

    /**
     * The Permanent Success.
     * 
     */
    @SerializedName(value = "permanentSuccess", alternate = {"PermanentSuccess"})
    @Expose
	@Nullable
    public Long permanentSuccess;

    /**
     * The Remove Fail.
     * 
     */
    @SerializedName(value = "removeFail", alternate = {"RemoveFail"})
    @Expose
	@Nullable
    public Long removeFail;

    /**
     * The Remove Success.
     * 
     */
    @SerializedName(value = "removeSuccess", alternate = {"RemoveSuccess"})
    @Expose
	@Nullable
    public Long removeSuccess;

    /**
     * The Role Id.
     * 
     */
    @SerializedName(value = "roleId", alternate = {"RoleId"})
    @Expose
	@Nullable
    public String roleId;

    /**
     * The Role Name.
     * 
     */
    @SerializedName(value = "roleName", alternate = {"RoleName"})
    @Expose
	@Nullable
    public String roleName;

    /**
     * The Temporary Fail.
     * 
     */
    @SerializedName(value = "temporaryFail", alternate = {"TemporaryFail"})
    @Expose
	@Nullable
    public Long temporaryFail;

    /**
     * The Temporary Success.
     * 
     */
    @SerializedName(value = "temporarySuccess", alternate = {"TemporarySuccess"})
    @Expose
	@Nullable
    public Long temporarySuccess;

    /**
     * The Unknown Fail.
     * 
     */
    @SerializedName(value = "unknownFail", alternate = {"UnknownFail"})
    @Expose
	@Nullable
    public Long unknownFail;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
