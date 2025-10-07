package com.beta2.salud.config;

import com.beta2.salud.impl.Vista360OrquestadorImpl;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.Bus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    private final Bus bus;
    private final Vista360OrquestadorImpl vista360Service;

    public CxfConfig(Bus bus, Vista360OrquestadorImpl vista360Service) {
        this.bus = bus;
        this.vista360Service = vista360Service;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, vista360Service);
        endpoint.publish("/Vista360Service");
        return endpoint;
    }
}
