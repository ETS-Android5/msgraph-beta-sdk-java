// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ContactRelationship;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Related Contact.
 */
public class RelatedContact implements IJsonBackedObject {

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
     * The Access Consent.
     * Indicates whether the user has been consented to access student data.
     */
    @SerializedName(value = "accessConsent", alternate = {"AccessConsent"})
    @Expose
	@Nullable
    public Boolean accessConsent;

    /**
     * The Display Name.
     * Name of the contact. Required.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Email Address.
     * Email address of the contact.
     */
    @SerializedName(value = "emailAddress", alternate = {"EmailAddress"})
    @Expose
	@Nullable
    public String emailAddress;

    /**
     * The Id.
     * 
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Mobile Phone.
     * Mobile phone number of the contact.
     */
    @SerializedName(value = "mobilePhone", alternate = {"MobilePhone"})
    @Expose
	@Nullable
    public String mobilePhone;

    /**
     * The Relationship.
     * Relationship to the user. Possible values are: parent, relative, aide, doctor, guardian, child, other, unknownFutureValue.
     */
    @SerializedName(value = "relationship", alternate = {"Relationship"})
    @Expose
	@Nullable
    public ContactRelationship relationship;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
