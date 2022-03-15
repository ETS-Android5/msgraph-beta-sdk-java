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
import com.microsoft.graph.models.AppManagementConfiguration;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.PolicyBase;
import com.microsoft.graph.requests.DirectoryObjectCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Management Policy.
 */
public class AppManagementPolicy extends PolicyBase implements IJsonBackedObject {


    /**
     * The Is Enabled.
     * 
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
	@Nullable
    public Boolean isEnabled;

    /**
     * The Restrictions.
     * 
     */
    @SerializedName(value = "restrictions", alternate = {"Restrictions"})
    @Expose
	@Nullable
    public AppManagementConfiguration restrictions;

    /**
     * The Applies To.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage appliesTo;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("appliesTo")) {
            appliesTo = serializer.deserializeObject(json.get("appliesTo"), DirectoryObjectCollectionPage.class);
        }
    }
}
