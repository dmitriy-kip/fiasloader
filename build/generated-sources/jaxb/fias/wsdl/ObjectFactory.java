//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.05 at 02:39:19 PM NOVT 
//


package fias.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fias.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfDownloadFileInfo_QNAME = new QName("https://fias.nalog.ru/WebServices/Public/DownloadService.asmx/", "ArrayOfDownloadFileInfo");
    private final static QName _DownloadFileInfo_QNAME = new QName("https://fias.nalog.ru/WebServices/Public/DownloadService.asmx/", "DownloadFileInfo");
    private final static QName _GetAllDownloadFileInfoResponseGetAllDownloadFileInfoResult_QNAME = new QName("https://fias.nalog.ru/WebServices/Public/DownloadService.asmx/", "GetAllDownloadFileInfoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fias.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLastDownloadFileInfo }
     * 
     */
    public GetLastDownloadFileInfo createGetLastDownloadFileInfo() {
        return new GetLastDownloadFileInfo();
    }

    /**
     * Create an instance of {@link DownloadFileInfo }
     * 
     */
    public DownloadFileInfo createDownloadFileInfo() {
        return new DownloadFileInfo();
    }

    /**
     * Create an instance of {@link GetAllDownloadFileInfoResponse }
     * 
     */
    public GetAllDownloadFileInfoResponse createGetAllDownloadFileInfoResponse() {
        return new GetAllDownloadFileInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDownloadFileInfo }
     * 
     */
    public ArrayOfDownloadFileInfo createArrayOfDownloadFileInfo() {
        return new ArrayOfDownloadFileInfo();
    }

    /**
     * Create an instance of {@link GetLastDownloadFileInfoResponse }
     * 
     */
    public GetLastDownloadFileInfoResponse createGetLastDownloadFileInfoResponse() {
        return new GetLastDownloadFileInfoResponse();
    }

    /**
     * Create an instance of {@link GetAllDownloadFileInfo }
     * 
     */
    public GetAllDownloadFileInfo createGetAllDownloadFileInfo() {
        return new GetAllDownloadFileInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDownloadFileInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://fias.nalog.ru/WebServices/Public/DownloadService.asmx/", name = "ArrayOfDownloadFileInfo")
    public JAXBElement<ArrayOfDownloadFileInfo> createArrayOfDownloadFileInfo(ArrayOfDownloadFileInfo value) {
        return new JAXBElement<ArrayOfDownloadFileInfo>(_ArrayOfDownloadFileInfo_QNAME, ArrayOfDownloadFileInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFileInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://fias.nalog.ru/WebServices/Public/DownloadService.asmx/", name = "DownloadFileInfo")
    public JAXBElement<DownloadFileInfo> createDownloadFileInfo(DownloadFileInfo value) {
        return new JAXBElement<DownloadFileInfo>(_DownloadFileInfo_QNAME, DownloadFileInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDownloadFileInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://fias.nalog.ru/WebServices/Public/DownloadService.asmx/", name = "GetAllDownloadFileInfoResult", scope = GetAllDownloadFileInfoResponse.class)
    public JAXBElement<ArrayOfDownloadFileInfo> createGetAllDownloadFileInfoResponseGetAllDownloadFileInfoResult(ArrayOfDownloadFileInfo value) {
        return new JAXBElement<ArrayOfDownloadFileInfo>(_GetAllDownloadFileInfoResponseGetAllDownloadFileInfoResult_QNAME, ArrayOfDownloadFileInfo.class, GetAllDownloadFileInfoResponse.class, value);
    }

}
