package com.suresh.mvc.service;

import com.suresh.mvc.entity.Invoice;
import com.suresh.mvc.exception.InvoiceNotFoundException;
import com.suresh.mvc.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements InvoiceService
{

    private final InvoiceRepository invoiceRepo;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepo)
    {
        this.invoiceRepo = invoiceRepo;
    }

    @Override
    public Invoice saveInvoice(Invoice invoice)
    {
        return invoiceRepo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices()
    {
        return invoiceRepo.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id)
    {
        return invoiceRepo.findById(id).orElseThrow(()-> new InvoiceNotFoundException("Invoice with Id : "+id+" Not Found"));
    }

    @Override
    public void deleteInvoiceById(Long id)
    {
        Optional<Invoice> invoiceRepoById = invoiceRepo.findById(id);
        if (invoiceRepoById.isPresent())
            invoiceRepo.deleteById(id);
        else
            throw new InvoiceNotFoundException("Invoice with Id : "+id+" Not Found");
    }

    @Override
    public Invoice updateInvoice(Invoice invoice)
    {
        return invoiceRepo.save(invoice);
    }
}
