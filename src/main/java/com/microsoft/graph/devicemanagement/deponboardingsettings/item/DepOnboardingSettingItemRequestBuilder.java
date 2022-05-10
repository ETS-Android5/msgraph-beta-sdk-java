package microsoft.graph.devicemanagement.deponboardingsettings.item;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.devicemanagement.deponboardingsettings.item.defaultiosenrollmentprofile.DefaultIosEnrollmentProfileRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.defaultmacosenrollmentprofile.DefaultMacOsEnrollmentProfileRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.enrollmentprofiles.EnrollmentProfilesRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.enrollmentprofiles.item.EnrollmentProfileItemRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.generateencryptionpublickey.GenerateEncryptionPublicKeyRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.getencryptionpublickey.GetEncryptionPublicKeyRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.importedappledeviceidentities.ImportedAppleDeviceIdentitiesRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.importedappledeviceidentities.item.ImportedAppleDeviceIdentityItemRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.shareforschooldatasyncservice.ShareForSchoolDataSyncServiceRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.syncwithappledeviceenrollmentprogram.SyncWithAppleDeviceEnrollmentProgramRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.unshareforschooldatasyncservice.UnshareForSchoolDataSyncServiceRequestBuilder;
import microsoft.graph.devicemanagement.deponboardingsettings.item.uploaddeptoken.UploadDepTokenRequestBuilder;
import microsoft.graph.models.DepOnboardingSetting;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the depOnboardingSettings property of the microsoft.graph.deviceManagement entity. */
public class DepOnboardingSettingItemRequestBuilder {
    /** The defaultIosEnrollmentProfile property */
    @javax.annotation.Nonnull
    public DefaultIosEnrollmentProfileRequestBuilder defaultIosEnrollmentProfile() {
        return new DefaultIosEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /** The defaultMacOsEnrollmentProfile property */
    @javax.annotation.Nonnull
    public DefaultMacOsEnrollmentProfileRequestBuilder defaultMacOsEnrollmentProfile() {
        return new DefaultMacOsEnrollmentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /** The enrollmentProfiles property */
    @javax.annotation.Nonnull
    public EnrollmentProfilesRequestBuilder enrollmentProfiles() {
        return new EnrollmentProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The generateEncryptionPublicKey property */
    @javax.annotation.Nonnull
    public GenerateEncryptionPublicKeyRequestBuilder generateEncryptionPublicKey() {
        return new GenerateEncryptionPublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** The importedAppleDeviceIdentities property */
    @javax.annotation.Nonnull
    public ImportedAppleDeviceIdentitiesRequestBuilder importedAppleDeviceIdentities() {
        return new ImportedAppleDeviceIdentitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The shareForSchoolDataSyncService property */
    @javax.annotation.Nonnull
    public ShareForSchoolDataSyncServiceRequestBuilder shareForSchoolDataSyncService() {
        return new ShareForSchoolDataSyncServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The syncWithAppleDeviceEnrollmentProgram property */
    @javax.annotation.Nonnull
    public SyncWithAppleDeviceEnrollmentProgramRequestBuilder syncWithAppleDeviceEnrollmentProgram() {
        return new SyncWithAppleDeviceEnrollmentProgramRequestBuilder(pathParameters, requestAdapter);
    }
    /** The unshareForSchoolDataSyncService property */
    @javax.annotation.Nonnull
    public UnshareForSchoolDataSyncServiceRequestBuilder unshareForSchoolDataSyncService() {
        return new UnshareForSchoolDataSyncServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The uploadDepToken property */
    @javax.annotation.Nonnull
    public UploadDepTokenRequestBuilder uploadDepToken() {
        return new UploadDepTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new DepOnboardingSettingItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DepOnboardingSettingItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DepOnboardingSettingItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DepOnboardingSettingItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DepOnboardingSettingItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DepOnboardingSettingItemRequestBuilderDeleteRequestConfiguration requestConfig = new DepOnboardingSettingItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DepOnboardingSettingItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DepOnboardingSettingItemRequestBuilderGetRequestConfiguration requestConfig = new DepOnboardingSettingItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DepOnboardingSetting body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DepOnboardingSetting body, @javax.annotation.Nullable final java.util.function.Consumer<DepOnboardingSettingItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DepOnboardingSettingItemRequestBuilderPatchRequestConfiguration requestConfig = new DepOnboardingSettingItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DepOnboardingSettingItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property depOnboardingSettings for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DepOnboardingSettingItemRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.depOnboardingSettings.item.enrollmentProfiles.item collection
     * @param id Unique identifier of the item
     * @return a enrollmentProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EnrollmentProfileItemRequestBuilder enrollmentProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("enrollmentProfile%2Did", id);
        return new EnrollmentProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @return a CompletableFuture of depOnboardingSetting
     */
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of depOnboardingSetting
     */
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> get(@javax.annotation.Nullable final java.util.function.Consumer<DepOnboardingSettingItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * This collections of multiple DEP tokens per-tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of depOnboardingSetting
     */
    public java.util.concurrent.CompletableFuture<DepOnboardingSetting> get(@javax.annotation.Nullable final java.util.function.Consumer<DepOnboardingSettingItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DepOnboardingSetting::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Provides operations to call the getEncryptionPublicKey method.
     * @return a getEncryptionPublicKeyRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEncryptionPublicKeyRequestBuilder getEncryptionPublicKey() {
        return new GetEncryptionPublicKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.depOnboardingSettings.item.importedAppleDeviceIdentities.item collection
     * @param id Unique identifier of the item
     * @return a importedAppleDeviceIdentityItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ImportedAppleDeviceIdentityItemRequestBuilder importedAppleDeviceIdentities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("importedAppleDeviceIdentity%2Did", id);
        return new ImportedAppleDeviceIdentityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DepOnboardingSetting body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DepOnboardingSetting body, @javax.annotation.Nullable final java.util.function.Consumer<DepOnboardingSettingItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property depOnboardingSettings in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DepOnboardingSetting body, @javax.annotation.Nullable final java.util.function.Consumer<DepOnboardingSettingItemRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DepOnboardingSettingItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new depOnboardingSettingItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public DepOnboardingSettingItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** This collections of multiple DEP tokens per-tenant. */
    public class DepOnboardingSettingItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DepOnboardingSettingItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DepOnboardingSettingItemRequestBuilderGetQueryParameters queryParameters = new DepOnboardingSettingItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new depOnboardingSettingItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public DepOnboardingSettingItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DepOnboardingSettingItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new depOnboardingSettingItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public DepOnboardingSettingItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
