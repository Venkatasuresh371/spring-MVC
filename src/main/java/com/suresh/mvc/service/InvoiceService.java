package com.suresh.mvc.service;

import com.suresh.mvc.entity.Invoice;

import java.util.List;

public interface InvoiceService
{
     Invoice saveInvoice(Invoice invoice);

     List<Invoice> getAllInvoices();

     Invoice getInvoiceById(Long id);

     void deleteInvoiceById(Long id);

     Invoice updateInvoice(Invoice invoice);
}
