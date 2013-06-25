//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Container consisting of details related to payment of an eBay order on an
 * 				external system such as PayPal. This container is only returned if payment has
 * 				been made on an order. For GetSellerTransaactions and GetItemTransactions, this
 * 				container is not returned for multiple line item orders.
 * 			
 * 
 * <p>Java class for ExternalTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalTransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FeeOrCreditAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentOrRefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalTransactionType", propOrder = {
    "externalTransactionID",
    "externalTransactionTime",
    "feeOrCreditAmount",
    "paymentOrRefundAmount"
})
public class ExternalTransactionType {

    @XmlElement(name = "ExternalTransactionID")
    protected String externalTransactionID;
    @XmlElement(name = "ExternalTransactionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar externalTransactionTime;
    @XmlElement(name = "FeeOrCreditAmount")
    protected AmountType feeOrCreditAmount;
    @XmlElement(name = "PaymentOrRefundAmount")
    protected AmountType paymentOrRefundAmount;

    /**
     * Gets the value of the externalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransactionID() {
        return externalTransactionID;
    }

    /**
     * Sets the value of the externalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransactionID(String value) {
        this.externalTransactionID = value;
    }

    /**
     * Gets the value of the externalTransactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExternalTransactionTime() {
        return externalTransactionTime;
    }

    /**
     * Sets the value of the externalTransactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExternalTransactionTime(XMLGregorianCalendar value) {
        this.externalTransactionTime = value;
    }

    /**
     * Gets the value of the feeOrCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFeeOrCreditAmount() {
        return feeOrCreditAmount;
    }

    /**
     * Sets the value of the feeOrCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFeeOrCreditAmount(AmountType value) {
        this.feeOrCreditAmount = value;
    }

    /**
     * Gets the value of the paymentOrRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentOrRefundAmount() {
        return paymentOrRefundAmount;
    }

    /**
     * Sets the value of the paymentOrRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentOrRefundAmount(AmountType value) {
        this.paymentOrRefundAmount = value;
    }

}