# Fiat Chrysler Automobiles Vehicle-to-Cloud API
The FCA Uconnect Global API’s define a standard data communication protocol for the Telematics Unit in the vehicle to interface with the cloud based Service Delivery Platform (SDP). The in-vehicle unit consists of either a Telematics Box Module (TBM) or Head Unit (HU), while the SDP can be hosted in any one of many cloud based infrastructures including Amazon Web Services (AWS).

API are generally mapped to a specific service (e.g. IVH In Vehicle Help), therefore relative documentation for a service should be carefully descriptor in each API.

The primary objective of this API is to create interoperability between the FCA regions including APAC, EMEA, LATAM, and NAFTA which with proper adoption will result in efficiency improvements and cost reductions as platforms become more global. Additionally, the API will improve the FCA Connected Vehicle Platform design for performance, scalability, flexibility, security, maintainability, and cost effectiveness.

![Vehicle Schema](https://github.com/jdmconsulting/fca_global_api/blob/master/documents/API/images/Vehicle%20reference%20schema.PNG "Vehicle Schema")


The API is based on industry best-practices for the Internet of Things (IoT) including the use of the secure MQTT and HTTP communication protocols. The need to minimize costly wireless network traffic has also lead to the use of Protocol Buffers for efficiently formatting the data into messages between the client (TBM or HU) and the services (SDP).

To know more about the project:  

[SFS One Pagers](https://partners.chrysler.com/sites/ict-moparspcc/CVP/CVP%20Planning%20Assets/01.%20CVP%20Strategy%202017/01.%20GDSP%20RFP%20Restricted/13.%20Docs%20-%20Call%20Center%20Team/TBM%20SFS%20One_Pagers%20TK%207-26-17.pdf) is where you can find information for each service  
[R1 Feature Description](https://partners.chrysler.com/sites/ict-moparspcc/CVP/CVP%20Planning%20Assets/01.%20CVP%20Strategy%202017/01.%20GDSP%20RFP%20Restricted/13.%20Docs%20-%20Call%20Center%20Team/R1%20Feature%20Descriptions%208-8-17.pdf) is where you can find the Feature Detailed Description  

