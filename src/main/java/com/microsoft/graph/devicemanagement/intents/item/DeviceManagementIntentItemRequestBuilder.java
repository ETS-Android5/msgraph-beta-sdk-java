package microsoft.graph.devicemanagement.intents.item;

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
import microsoft.graph.devicemanagement.intents.item.assign.AssignRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.assignments.AssignmentsRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.assignments.item.DeviceManagementIntentAssignmentItemRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.categories.CategoriesRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.categories.item.DeviceManagementIntentSettingCategoryItemRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.comparewithtemplateid.CompareWithTemplateIdRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.createcopy.CreateCopyRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.devicesettingstatesummaries.DeviceSettingStateSummariesRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.devicesettingstatesummaries.item.DeviceManagementIntentDeviceSettingStateSummaryItemRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.devicestates.DeviceStatesRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.devicestates.item.DeviceManagementIntentDeviceStateItemRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.devicestatesummary.DeviceStateSummaryRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.migratetotemplate.MigrateToTemplateRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.settings.item.DeviceManagementSettingInstanceItemRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.settings.SettingsRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.updatesettings.UpdateSettingsRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.userstates.item.DeviceManagementIntentUserStateItemRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.userstates.UserStatesRequestBuilder;
import microsoft.graph.devicemanagement.intents.item.userstatesummary.UserStateSummaryRequestBuilder;
import microsoft.graph.models.DeviceManagementIntent;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the intents property of the microsoft.graph.deviceManagement entity. */
public class DeviceManagementIntentItemRequestBuilder {
    /** The assign property */
    @javax.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /** The assignments property */
    @javax.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The categories property */
    @javax.annotation.Nonnull
    public CategoriesRequestBuilder categories() {
        return new CategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createCopy property */
    @javax.annotation.Nonnull
    public CreateCopyRequestBuilder createCopy() {
        return new CreateCopyRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceSettingStateSummaries property */
    @javax.annotation.Nonnull
    public DeviceSettingStateSummariesRequestBuilder deviceSettingStateSummaries() {
        return new DeviceSettingStateSummariesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceStates property */
    @javax.annotation.Nonnull
    public DeviceStatesRequestBuilder deviceStates() {
        return new DeviceStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceStateSummary property */
    @javax.annotation.Nonnull
    public DeviceStateSummaryRequestBuilder deviceStateSummary() {
        return new DeviceStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /** The migrateToTemplate property */
    @javax.annotation.Nonnull
    public MigrateToTemplateRequestBuilder migrateToTemplate() {
        return new MigrateToTemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The settings property */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The updateSettings property */
    @javax.annotation.Nonnull
    public UpdateSettingsRequestBuilder updateSettings() {
        return new UpdateSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The userStates property */
    @javax.annotation.Nonnull
    public UserStatesRequestBuilder userStates() {
        return new UserStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The userStateSummary property */
    @javax.annotation.Nonnull
    public UserStateSummaryRequestBuilder userStateSummary() {
        return new UserStateSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.intents.item.assignments.item collection
     * @param id Unique identifier of the item
     * @return a deviceManagementIntentAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentAssignmentItemRequestBuilder assignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentAssignment%2Did", id);
        return new DeviceManagementIntentAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.intents.item.categories.item collection
     * @param id Unique identifier of the item
     * @return a deviceManagementIntentSettingCategoryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentSettingCategoryItemRequestBuilder categories(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentSettingCategory%2Did", id);
        return new DeviceManagementIntentSettingCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the compare method.
     * @param templateId Usage: templateId='{templateId}'
     * @return a compareWithTemplateIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public CompareWithTemplateIdRequestBuilder compareWithTemplateId(@javax.annotation.Nonnull final String templateId) {
        Objects.requireNonNull(templateId);
        return new CompareWithTemplateIdRequestBuilder(pathParameters, requestAdapter, templateId);
    }
    /**
     * Instantiates a new DeviceManagementIntentItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DeviceManagementIntentItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/intents/{deviceManagementIntent%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DeviceManagementIntentItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DeviceManagementIntentItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/intents/{deviceManagementIntent%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property intents for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property intents for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration requestConfig = new DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The device management intents
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The device management intents
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeviceManagementIntentItemRequestBuilderGetRequestConfiguration requestConfig = new DeviceManagementIntentItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementIntent body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceManagementIntent body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration requestConfig = new DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property intents for deviceManagement
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
     * Delete navigation property intents for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Delete navigation property intents for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
     * Gets an item from the Microsoft.Graph.deviceManagement.intents.item.deviceSettingStateSummaries.item collection
     * @param id Unique identifier of the item
     * @return a deviceManagementIntentDeviceSettingStateSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentDeviceSettingStateSummaryItemRequestBuilder deviceSettingStateSummaries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentDeviceSettingStateSummary%2Did", id);
        return new DeviceManagementIntentDeviceSettingStateSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.intents.item.deviceStates.item collection
     * @param id Unique identifier of the item
     * @return a deviceManagementIntentDeviceStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentDeviceStateItemRequestBuilder deviceStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentDeviceState%2Did", id);
        return new DeviceManagementIntentDeviceStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The device management intents
     * @return a CompletableFuture of deviceManagementIntent
     */
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The device management intents
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceManagementIntent
     */
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> get(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The device management intents
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of deviceManagementIntent
     */
    public java.util.concurrent.CompletableFuture<DeviceManagementIntent> get(@javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceManagementIntent::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property intents in deviceManagement
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceManagementIntent body) {
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
     * Update the navigation property intents in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceManagementIntent body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
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
     * Update the navigation property intents in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DeviceManagementIntent body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.intents.item.settings.item collection
     * @param id Unique identifier of the item
     * @return a deviceManagementSettingInstanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementSettingInstanceItemRequestBuilder settings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementSettingInstance%2Did", id);
        return new DeviceManagementSettingInstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.deviceManagement.intents.item.userStates.item collection
     * @param id Unique identifier of the item
     * @return a deviceManagementIntentUserStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementIntentUserStateItemRequestBuilder userStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementIntentUserState%2Did", id);
        return new DeviceManagementIntentUserStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new deviceManagementIntentItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public DeviceManagementIntentItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The device management intents */
    public class DeviceManagementIntentItemRequestBuilderGetQueryParameters {
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
    public class DeviceManagementIntentItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DeviceManagementIntentItemRequestBuilderGetQueryParameters queryParameters = new DeviceManagementIntentItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new deviceManagementIntentItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public DeviceManagementIntentItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new deviceManagementIntentItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public DeviceManagementIntentItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
