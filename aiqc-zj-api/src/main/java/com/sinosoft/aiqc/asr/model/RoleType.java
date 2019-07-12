
package com.sinosoft.aiqc.asr.model;

import javax.xml.bind.annotation.*;


/**
 * <p>RoleType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndPoint" type="{}EndPointType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleType", propOrder = {
    "endPoint"
})
public class RoleType {

    @XmlElement(name = "EndPoint", required = true)
    protected EndPointType endPoint;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Channel")
    protected String channel;

    /**
     * ��ȡendPoint���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link EndPointType }
     *
     */
    public EndPointType getEndPoint() {
        return endPoint;
    }

    /**
     * ����endPoint���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link EndPointType }
     *
     */
    public void setEndPoint(EndPointType value) {
        this.endPoint = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡchannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * ����channel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

}
