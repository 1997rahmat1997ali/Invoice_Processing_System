package com.ali.server.services;

import com.ali.server.model.Invoice;

import java.util.List;


public interface InvoiceService {
    public Invoice addInvoice(Invoice invoice);

    public List<Invoice> getInvoice();

    public Invoice deleteInvoice(long id);
}
