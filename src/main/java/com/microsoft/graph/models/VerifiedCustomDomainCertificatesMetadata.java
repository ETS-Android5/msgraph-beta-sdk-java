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
 * The class for the Verified Custom Domain Certificates Metadata.
 */
public class VerifiedCustomDomainCertificatesMetadata implements IJsonBackedObject {

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
     * The Expiry Date.
     * The expiry date of the custom domain certificate. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "expiryDate", alternate = {"ExpiryDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expiryDate;

    /**
     * The Issue Date.
     * The issue date of the custom domain. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "issueDate", alternate = {"IssueDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime issueDate;

    /**
     * The Issuer Name.
     * The issuer name of the custom domain certificate.
     */
    @SerializedName(value = "issuerName", alternate = {"IssuerName"})
    @Expose
	@Nullable
    public String issuerName;

    /**
     * The Subject Name.
     * The subject name of the custom domain certificate.
     */
    @SerializedName(value = "subjectName", alternate = {"SubjectName"})
    @Expose
	@Nullable
    public String subjectName;

    /**
     * The Thumbprint.
     * The thumbprint associated with the custom domain certificate.
     */
    @SerializedName(value = "thumbprint", alternate = {"Thumbprint"})
    @Expose
	@Nullable
    public String thumbprint;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
