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
import com.microsoft.graph.models.CrossTenantAccessPolicyConfigurationDefault;
import com.microsoft.graph.models.CrossTenantAccessPolicyConfigurationPartner;
import com.microsoft.graph.models.TenantRelationshipAccessPolicyBase;
import com.microsoft.graph.requests.CrossTenantAccessPolicyConfigurationPartnerCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cross Tenant Access Policy.
 */
public class CrossTenantAccessPolicy extends TenantRelationshipAccessPolicyBase implements IJsonBackedObject {


    /**
     * The Default.
     * Defines the default configuration for how your organization interacts with external Azure Active Directory organizations.
     */
    @SerializedName(value = "default", alternate = {"Default"})
    @Expose
	@Nullable
    public CrossTenantAccessPolicyConfigurationDefault msgraphDefault;

    /**
     * The Partners.
     * Defines partner-specific configurations for external Azure Active Directory organizations.
     */
    @SerializedName(value = "partners", alternate = {"Partners"})
    @Expose
	@Nullable
    public CrossTenantAccessPolicyConfigurationPartnerCollectionPage partners;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("partners")) {
            partners = serializer.deserializeObject(json.get("partners"), CrossTenantAccessPolicyConfigurationPartnerCollectionPage.class);
        }
    }
}
