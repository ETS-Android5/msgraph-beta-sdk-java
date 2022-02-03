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
 * The class for the Teamwork On Premises Calendar Sync Configuration.
 */
public class TeamworkOnPremisesCalendarSyncConfiguration implements IJsonBackedObject {

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
     * The Domain.
     * The fully qualified domain name (FQDN) of the Skype for Business Server. Use the Exchange domain if the Skype for Business SIP domain is different from the Exchange domain of the user.
     */
    @SerializedName(value = "domain", alternate = {"Domain"})
    @Expose
	@Nullable
    public String domain;

    /**
     * The Domain User Name.
     * The domain and username of the console device, for example, Seattle/RanierConf.
     */
    @SerializedName(value = "domainUserName", alternate = {"DomainUserName"})
    @Expose
	@Nullable
    public String domainUserName;

    /**
     * The Smtp Address.
     * The Simple Mail Transfer Protocol (SMTP) address of the user account. This is only required if a different user principal name (UPN) is used to sign in to Exchange other than Microsoft Teams and Skype for Business. This is a common scenario in a hybrid environment where an on-premises Exchange server is used.
     */
    @SerializedName(value = "smtpAddress", alternate = {"SmtpAddress"})
    @Expose
	@Nullable
    public String smtpAddress;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
