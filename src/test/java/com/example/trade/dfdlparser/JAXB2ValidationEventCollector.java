package com.example.trade.dfdlparser;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.util.ValidationEventCollector;

public class JAXB2ValidationEventCollector extends ValidationEventCollector {

    @Override
    public boolean handleEvent(ValidationEvent event) {
        super.handleEvent(event);
        System.out.println(event.getMessage());
        return true;
    }
}
