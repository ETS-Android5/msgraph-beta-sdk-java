// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AppIdentity;
import com.microsoft.graph.models.AuditUserIdentity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Activity Initiator.
 */
public class AuditActivityInitiator implements IJsonBackedObject {

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
     * The App.
     * If the resource initiating the activity is an app, this property indicates all the app related information like appId, Name, servicePrincipalId, Name.
     */
    @SerializedName(value = "app", alternate = {"App"})
    @Expose
	@Nullable
    public AppIdentity app;

    /**
     * The User.
     * If the resource initiating the activity is a user, this property Indicates all the user related information like userId, Name, UserPrinicpalName.
     */
    @SerializedName(value = "user", alternate = {"User"})
    @Expose
	@Nullable
    public AuditUserIdentity user;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
