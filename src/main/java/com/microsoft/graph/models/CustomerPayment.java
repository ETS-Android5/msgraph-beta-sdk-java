package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomerPayment extends Entity implements Parsable {
    /** The amount property */
    private BigDecimal _amount;
    /** The appliesToInvoiceId property */
    private String _appliesToInvoiceId;
    /** The appliesToInvoiceNumber property */
    private String _appliesToInvoiceNumber;
    /** The comment property */
    private String _comment;
    /** The contactId property */
    private String _contactId;
    /** The customer property */
    private Customer _customer;
    /** The customerId property */
    private String _customerId;
    /** The customerNumber property */
    private String _customerNumber;
    /** The description property */
    private String _description;
    /** The documentNumber property */
    private String _documentNumber;
    /** The externalDocumentNumber property */
    private String _externalDocumentNumber;
    /** The journalDisplayName property */
    private String _journalDisplayName;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The lineNumber property */
    private Integer _lineNumber;
    /** The postingDate property */
    private LocalDate _postingDate;
    /**
     * Instantiates a new customerPayment and sets the default values.
     * @return a void
     */
    public CustomerPayment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customerPayment
     */
    @javax.annotation.Nonnull
    public static CustomerPayment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerPayment();
    }
    /**
     * Gets the amount property value. The amount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getAmount() {
        return this._amount;
    }
    /**
     * Gets the appliesToInvoiceId property value. The appliesToInvoiceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppliesToInvoiceId() {
        return this._appliesToInvoiceId;
    }
    /**
     * Gets the appliesToInvoiceNumber property value. The appliesToInvoiceNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppliesToInvoiceNumber() {
        return this._appliesToInvoiceNumber;
    }
    /**
     * Gets the comment property value. The comment property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * Gets the contactId property value. The contactId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactId() {
        return this._contactId;
    }
    /**
     * Gets the customer property value. The customer property
     * @return a customer
     */
    @javax.annotation.Nullable
    public Customer getCustomer() {
        return this._customer;
    }
    /**
     * Gets the customerId property value. The customerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerId() {
        return this._customerId;
    }
    /**
     * Gets the customerNumber property value. The customerNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerNumber() {
        return this._customerNumber;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the documentNumber property value. The documentNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDocumentNumber() {
        return this._documentNumber;
    }
    /**
     * Gets the externalDocumentNumber property value. The externalDocumentNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalDocumentNumber() {
        return this._externalDocumentNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomerPayment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("amount", (n) -> { currentObject.setAmount(n.getBigDecimalValue()); });
            this.put("appliesToInvoiceId", (n) -> { currentObject.setAppliesToInvoiceId(n.getStringValue()); });
            this.put("appliesToInvoiceNumber", (n) -> { currentObject.setAppliesToInvoiceNumber(n.getStringValue()); });
            this.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
            this.put("contactId", (n) -> { currentObject.setContactId(n.getStringValue()); });
            this.put("customer", (n) -> { currentObject.setCustomer(n.getObjectValue(Customer::createFromDiscriminatorValue)); });
            this.put("customerId", (n) -> { currentObject.setCustomerId(n.getStringValue()); });
            this.put("customerNumber", (n) -> { currentObject.setCustomerNumber(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("documentNumber", (n) -> { currentObject.setDocumentNumber(n.getStringValue()); });
            this.put("externalDocumentNumber", (n) -> { currentObject.setExternalDocumentNumber(n.getStringValue()); });
            this.put("journalDisplayName", (n) -> { currentObject.setJournalDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lineNumber", (n) -> { currentObject.setLineNumber(n.getIntegerValue()); });
            this.put("postingDate", (n) -> { currentObject.setPostingDate(n.getLocalDateValue()); });
        }};
    }
    /**
     * Gets the journalDisplayName property value. The journalDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJournalDisplayName() {
        return this._journalDisplayName;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the lineNumber property value. The lineNumber property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLineNumber() {
        return this._lineNumber;
    }
    /**
     * Gets the postingDate property value. The postingDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getPostingDate() {
        return this._postingDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBigDecimalValue("amount", this.getAmount());
        writer.writeStringValue("appliesToInvoiceId", this.getAppliesToInvoiceId());
        writer.writeStringValue("appliesToInvoiceNumber", this.getAppliesToInvoiceNumber());
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("contactId", this.getContactId());
        writer.writeObjectValue("customer", this.getCustomer());
        writer.writeStringValue("customerId", this.getCustomerId());
        writer.writeStringValue("customerNumber", this.getCustomerNumber());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("documentNumber", this.getDocumentNumber());
        writer.writeStringValue("externalDocumentNumber", this.getExternalDocumentNumber());
        writer.writeStringValue("journalDisplayName", this.getJournalDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("lineNumber", this.getLineNumber());
        writer.writeLocalDateValue("postingDate", this.getPostingDate());
    }
    /**
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     * @return a void
     */
    public void setAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._amount = value;
    }
    /**
     * Sets the appliesToInvoiceId property value. The appliesToInvoiceId property
     * @param value Value to set for the appliesToInvoiceId property.
     * @return a void
     */
    public void setAppliesToInvoiceId(@javax.annotation.Nullable final String value) {
        this._appliesToInvoiceId = value;
    }
    /**
     * Sets the appliesToInvoiceNumber property value. The appliesToInvoiceNumber property
     * @param value Value to set for the appliesToInvoiceNumber property.
     * @return a void
     */
    public void setAppliesToInvoiceNumber(@javax.annotation.Nullable final String value) {
        this._appliesToInvoiceNumber = value;
    }
    /**
     * Sets the comment property value. The comment property
     * @param value Value to set for the comment property.
     * @return a void
     */
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the contactId property value. The contactId property
     * @param value Value to set for the contactId property.
     * @return a void
     */
    public void setContactId(@javax.annotation.Nullable final String value) {
        this._contactId = value;
    }
    /**
     * Sets the customer property value. The customer property
     * @param value Value to set for the customer property.
     * @return a void
     */
    public void setCustomer(@javax.annotation.Nullable final Customer value) {
        this._customer = value;
    }
    /**
     * Sets the customerId property value. The customerId property
     * @param value Value to set for the customerId property.
     * @return a void
     */
    public void setCustomerId(@javax.annotation.Nullable final String value) {
        this._customerId = value;
    }
    /**
     * Sets the customerNumber property value. The customerNumber property
     * @param value Value to set for the customerNumber property.
     * @return a void
     */
    public void setCustomerNumber(@javax.annotation.Nullable final String value) {
        this._customerNumber = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the documentNumber property value. The documentNumber property
     * @param value Value to set for the documentNumber property.
     * @return a void
     */
    public void setDocumentNumber(@javax.annotation.Nullable final String value) {
        this._documentNumber = value;
    }
    /**
     * Sets the externalDocumentNumber property value. The externalDocumentNumber property
     * @param value Value to set for the externalDocumentNumber property.
     * @return a void
     */
    public void setExternalDocumentNumber(@javax.annotation.Nullable final String value) {
        this._externalDocumentNumber = value;
    }
    /**
     * Sets the journalDisplayName property value. The journalDisplayName property
     * @param value Value to set for the journalDisplayName property.
     * @return a void
     */
    public void setJournalDisplayName(@javax.annotation.Nullable final String value) {
        this._journalDisplayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the lineNumber property value. The lineNumber property
     * @param value Value to set for the lineNumber property.
     * @return a void
     */
    public void setLineNumber(@javax.annotation.Nullable final Integer value) {
        this._lineNumber = value;
    }
    /**
     * Sets the postingDate property value. The postingDate property
     * @param value Value to set for the postingDate property.
     * @return a void
     */
    public void setPostingDate(@javax.annotation.Nullable final LocalDate value) {
        this._postingDate = value;
    }
}
