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
import com.microsoft.graph.models.ManagedDeviceCertificateState;
import com.microsoft.graph.models.AndroidForWorkCertificateProfileBase;
import com.microsoft.graph.requests.ManagedDeviceCertificateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Pkcs Certificate Profile.
 */
public class AndroidForWorkPkcsCertificateProfile extends AndroidForWorkCertificateProfileBase implements IJsonBackedObject {


    /**
     * The Certificate Template Name.
     * PKCS Certificate Template Name
     */
    @SerializedName(value = "certificateTemplateName", alternate = {"CertificateTemplateName"})
    @Expose
	@Nullable
    public String certificateTemplateName;

    /**
     * The Certification Authority.
     * PKCS Certification Authority
     */
    @SerializedName(value = "certificationAuthority", alternate = {"CertificationAuthority"})
    @Expose
	@Nullable
    public String certificationAuthority;

    /**
     * The Certification Authority Name.
     * PKCS Certification Authority Name
     */
    @SerializedName(value = "certificationAuthorityName", alternate = {"CertificationAuthorityName"})
    @Expose
	@Nullable
    public String certificationAuthorityName;

    /**
     * The Subject Alternative Name Format String.
     * Custom String that defines the AAD Attribute.
     */
    @SerializedName(value = "subjectAlternativeNameFormatString", alternate = {"SubjectAlternativeNameFormatString"})
    @Expose
	@Nullable
    public String subjectAlternativeNameFormatString;

    /**
     * The Managed Device Certificate States.
     * Certificate state for devices
     */
    @SerializedName(value = "managedDeviceCertificateStates", alternate = {"ManagedDeviceCertificateStates"})
    @Expose
	@Nullable
    public ManagedDeviceCertificateStateCollectionPage managedDeviceCertificateStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("managedDeviceCertificateStates")) {
            managedDeviceCertificateStates = serializer.deserializeObject(json.get("managedDeviceCertificateStates"), ManagedDeviceCertificateStateCollectionPage.class);
        }
    }
}
