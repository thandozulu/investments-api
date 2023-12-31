package com.example.investmentsapi.service;

import com.example.investmentsapi.model.Investor;
import com.example.investmentsapi.model.Product;
import com.example.investmentsapi.repository.InvestorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestorServiceImpl implements InvestorService {

    private final InvestorRepository investorRepository;

    public InvestorServiceImpl(InvestorRepository investorRepository) {
        this.investorRepository = investorRepository;
    }

    @Override
    public Investor createInvestor(Investor investor) {
        return investorRepository.save(investor);
    }

    @Override
    public List<Investor> getAllInvestors() {
        return investorRepository.findAll();
    }

    @Override
    public Optional<Investor> getInvestorById(Long id) {
        return investorRepository.findById(id);
    }

    @Override
    public Investor updateInvestor(Long id, Investor updatedInvestor) {
        return investorRepository.save(updatedInvestor);
    }

    @Override
    public void deleteInvestor(Long id) {
        investorRepository.deleteById(id);
    }

    @Override
    public List<Product> getProductsForInvestor(Long id) {
        // TODO: 2023/11/08
        return null;
    }
}
