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
import com.microsoft.graph.models.CertificateStore;
import com.microsoft.graph.models.CustomSubjectAlternativeName;
import com.microsoft.graph.models.ManagedDeviceCertificateState;
import com.microsoft.graph.models.MacOSCertificateProfileBase;
import com.microsoft.graph.requests.ManagedDeviceCertificateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSPkcs Certificate Profile.
 */
public class MacOSPkcsCertificateProfile extends MacOSCertificateProfileBase implements IJsonBackedObject {


    /**
     * The Allow All Apps Access.
     * AllowAllAppsAccess setting
     */
    @SerializedName(value = "allowAllAppsAccess", alternate = {"AllowAllAppsAccess"})
    @Expose
	@Nullable
    public Boolean allowAllAppsAccess;

    /**
     * The Certificate Store.
     * Target store certificate
     */
    @SerializedName(value = "certificateStore", alternate = {"CertificateStore"})
    @Expose
	@Nullable
    public CertificateStore certificateStore;

    /**
     * The Certificate Template Name.
     * PKCS certificate template name.
     */
    @SerializedName(value = "certificateTemplateName", alternate = {"CertificateTemplateName"})
    @Expose
	@Nullable
    public String certificateTemplateName;

    /**
     * The Certification Authority.
     * PKCS certification authority FQDN.
     */
    @SerializedName(value = "certificationAuthority", alternate = {"CertificationAuthority"})
    @Expose
	@Nullable
    public String certificationAuthority;

    /**
     * The Certification Authority Name.
     * PKCS certification authority Name.
     */
    @SerializedName(value = "certificationAuthorityName", alternate = {"CertificationAuthorityName"})
    @Expose
	@Nullable
    public String certificationAuthorityName;

    /**
     * The Custom Subject Alternative Names.
     * Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "customSubjectAlternativeNames", alternate = {"CustomSubjectAlternativeNames"})
    @Expose
	@Nullable
    public java.util.List<CustomSubjectAlternativeName> customSubjectAlternativeNames;

    /**
     * The Subject Alternative Name Format String.
     * Format string that defines the subject alternative name.
     */
    @SerializedName(value = "subjectAlternativeNameFormatString", alternate = {"SubjectAlternativeNameFormatString"})
    @Expose
	@Nullable
    public String subjectAlternativeNameFormatString;

    /**
     * The Subject Name Format String.
     * Format string that defines the subject name. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     */
    @SerializedName(value = "subjectNameFormatString", alternate = {"SubjectNameFormatString"})
    @Expose
	@Nullable
    public String subjectNameFormatString;

    /**
     * The Managed Device Certificate States.
     * Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
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
