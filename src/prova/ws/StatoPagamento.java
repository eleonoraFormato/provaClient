/**
 * StatoPagamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package prova.ws;

public class StatoPagamento  implements java.io.Serializable {
    private java.lang.String codicePagamento;

    private int id;

    public StatoPagamento() {
    }

    public StatoPagamento(
           java.lang.String codicePagamento,
           int id) {
           this.codicePagamento = codicePagamento;
           this.id = id;
    }


    /**
     * Gets the codicePagamento value for this StatoPagamento.
     * 
     * @return codicePagamento
     */
    public java.lang.String getCodicePagamento() {
        return codicePagamento;
    }


    /**
     * Sets the codicePagamento value for this StatoPagamento.
     * 
     * @param codicePagamento
     */
    public void setCodicePagamento(java.lang.String codicePagamento) {
        this.codicePagamento = codicePagamento;
    }


    /**
     * Gets the id value for this StatoPagamento.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this StatoPagamento.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatoPagamento)) return false;
        StatoPagamento other = (StatoPagamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codicePagamento==null && other.getCodicePagamento()==null) || 
             (this.codicePagamento!=null &&
              this.codicePagamento.equals(other.getCodicePagamento()))) &&
            this.id == other.getId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodicePagamento() != null) {
            _hashCode += getCodicePagamento().hashCode();
        }
        _hashCode += getId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatoPagamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.prova", "StatoPagamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codicePagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.prova", "codicePagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.prova", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
