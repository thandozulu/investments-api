package com.example.investmentsapi.service;

import com.example.investmentsapi.model.Investor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface InvestorService {

    Investor createInvestor(Investor investor);

    List<Investor> getAllInvestors();

    Optional<Investor> getInvestorById(Long id);

    Investor updateInvestor(Long id, Investor updatedInvestor);

    void deleteInvestor(Long id);

}
