// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.KerberosSignOnMappingAttributeType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Kerberos Sign On Settings.
 */
public class KerberosSignOnSettings implements IJsonBackedObject {

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
     * The Kerberos Service Principal Name.
     * The Internal Application SPN of the application server. This SPN needs to be in the list of services to which the connector can present delegated credentials.
     */
    @SerializedName(value = "kerberosServicePrincipalName", alternate = {"KerberosServicePrincipalName"})
    @Expose
	@Nullable
    public String kerberosServicePrincipalName;

    /**
     * The Kerberos Sign On Mapping Attribute Type.
     * The Delegated Login Identity for the connector to use on behalf of your users. For more information, see Working with different on-premises and cloud identities . Possible values are: userPrincipalName, onPremisesUserPrincipalName, userPrincipalUsername, onPremisesUserPrincipalUsername, onPremisesSAMAccountName.
     */
    @SerializedName(value = "kerberosSignOnMappingAttributeType", alternate = {"KerberosSignOnMappingAttributeType"})
    @Expose
	@Nullable
    public KerberosSignOnMappingAttributeType kerberosSignOnMappingAttributeType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
