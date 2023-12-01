/**
 * AppointmentsAvailable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class AppointmentsAvailable  implements java.io.Serializable {
    private java.lang.String[] appointments;

    private java.lang.String teacher;

    public AppointmentsAvailable() {
    }

    public AppointmentsAvailable(
           java.lang.String[] appointments,
           java.lang.String teacher) {
           this.appointments = appointments;
           this.teacher = teacher;
    }


    /**
     * Gets the appointments value for this AppointmentsAvailable.
     * 
     * @return appointments
     */
    public java.lang.String[] getAppointments() {
        return appointments;
    }


    /**
     * Sets the appointments value for this AppointmentsAvailable.
     * 
     * @param appointments
     */
    public void setAppointments(java.lang.String[] appointments) {
        this.appointments = appointments;
    }


    /**
     * Gets the teacher value for this AppointmentsAvailable.
     * 
     * @return teacher
     */
    public java.lang.String getTeacher() {
        return teacher;
    }


    /**
     * Sets the teacher value for this AppointmentsAvailable.
     * 
     * @param teacher
     */
    public void setTeacher(java.lang.String teacher) {
        this.teacher = teacher;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppointmentsAvailable)) return false;
        AppointmentsAvailable other = (AppointmentsAvailable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appointments==null && other.getAppointments()==null) || 
             (this.appointments!=null &&
              java.util.Arrays.equals(this.appointments, other.getAppointments()))) &&
            ((this.teacher==null && other.getTeacher()==null) || 
             (this.teacher!=null &&
              this.teacher.equals(other.getTeacher())));
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
        if (getAppointments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppointments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppointments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTeacher() != null) {
            _hashCode += getTeacher().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppointmentsAvailable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service", "AppointmentsAvailable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appointments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service", "appointments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teacher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service", "teacher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
