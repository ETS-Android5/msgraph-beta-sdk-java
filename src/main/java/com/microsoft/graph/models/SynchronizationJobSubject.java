// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SynchronizationLinkedObjects;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Job Subject.
 */
public class SynchronizationJobSubject implements IJsonBackedObject {

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
     * The Links.
     * 
     */
    @SerializedName(value = "links", alternate = {"Links"})
    @Expose
	@Nullable
    public SynchronizationLinkedObjects links;

    /**
     * The Object Id.
     * The identifier of an object to which a synchronizationJob is to be applied. Can be one of the following: An onPremisesDistinguishedName for synchronization from Active Directory to Azure AD.The user ID for synchronization from Azure AD to a third-party.The Worker ID of the Workday worker for synchronization from Workday to either Active Directory or Azure AD.
     */
    @SerializedName(value = "objectId", alternate = {"ObjectId"})
    @Expose
	@Nullable
    public String objectId;

    /**
     * The Object Type Name.
     * The type of the object to which a synchronizationJob is to be applied. Can be one of the following: user for synchronization from Active Directory to Azure AD.User for synchronization from Azure AD to a third-party application. Worker for synchronization from Workday to either Active Directory or Azure AD.
     */
    @SerializedName(value = "objectTypeName", alternate = {"ObjectTypeName"})
    @Expose
	@Nullable
    public String objectTypeName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
