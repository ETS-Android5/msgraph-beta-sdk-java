package microsoft.graph.devicemanagement.chromeosonboardingsettings.connect;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ChromeOSOnboardingStatus;
/** Provides operations to call the connect method. */
public class ConnectRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new ConnectRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ConnectRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/chromeOSOnboardingSettings/microsoft.graph.connect";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ConnectRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ConnectRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/chromeOSOnboardingSettings/microsoft.graph.connect";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke action connect
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final ConnectRequestBody body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Invoke action connect
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final ConnectRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<ConnectRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ConnectRequestBuilderPostRequestConfiguration requestConfig = new ConnectRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke action connect
     * @param body 
     * @return a CompletableFuture of connectResponse
     */
    public java.util.concurrent.CompletableFuture<ConnectResponse> post(@javax.annotation.Nonnull final ConnectRequestBody body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            return this.requestAdapter.sendAsync(requestInfo, ConnectResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke action connect
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of connectResponse
     */
    public java.util.concurrent.CompletableFuture<ConnectResponse> post(@javax.annotation.Nonnull final ConnectRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<ConnectRequestBuilderPostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ConnectResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke action connect
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of connectResponse
     */
    public java.util.concurrent.CompletableFuture<ConnectResponse> post(@javax.annotation.Nonnull final ConnectRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<ConnectRequestBuilderPostRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, ConnectResponse::createFromDiscriminatorValue, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ConnectRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new connectRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        public ConnectRequestBuilderPostRequestConfiguration() {
        }
    }
    /** Union type wrapper for classes chromeOSOnboardingStatus */
    public class ConnectResponse implements AdditionalDataHolder, Parsable {
        /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
        private Map<String, Object> _additionalData;
        /** Union type representation for type chromeOSOnboardingStatus */
        private ChromeOSOnboardingStatus _chromeOSOnboardingStatus;
        /**
         * Instantiates a new connectResponse and sets the default values.
         * @return a void
         */
        public ConnectResponse() {
            this.setAdditionalData(new HashMap<>());
        }
        @javax.annotation.Nonnull
        public static ConnectResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            return new ConnectResponse();
        }
        /**
         * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
         * @return a Map<String, Object>
         */
        @javax.annotation.Nonnull
        public Map<String, Object> getAdditionalData() {
            return this._additionalData;
        }
        /**
         * Gets the chromeOSOnboardingStatus property value. Union type representation for type chromeOSOnboardingStatus
         * @return a chromeOSOnboardingStatus
         */
        @javax.annotation.Nullable
        public ChromeOSOnboardingStatus getChromeOSOnboardingStatus() {
            return this._chromeOSOnboardingStatus;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, Consumer<ParseNode>>
         */
        @javax.annotation.Nonnull
        public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
            final ConnectResponse currentObject = this;
            return new HashMap<>(1) {{
                this.put("chromeOSOnboardingStatus", (n) -> { currentObject.setChromeOSOnboardingStatus(n.getEnumValue(ChromeOSOnboardingStatus.class)); });
            }};
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         * @return a void
         */
        public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            writer.writeEnumValue("chromeOSOnboardingStatus", this.getChromeOSOnboardingStatus());
            writer.writeAdditionalData(this.getAdditionalData());
        }
        /**
         * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
         * @param value Value to set for the AdditionalData property.
         * @return a void
         */
        public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
            this._additionalData = value;
        }
        /**
         * Sets the chromeOSOnboardingStatus property value. Union type representation for type chromeOSOnboardingStatus
         * @param value Value to set for the chromeOSOnboardingStatus property.
         * @return a void
         */
        public void setChromeOSOnboardingStatus(@javax.annotation.Nullable final ChromeOSOnboardingStatus value) {
            this._chromeOSOnboardingStatus = value;
        }
    }
}
