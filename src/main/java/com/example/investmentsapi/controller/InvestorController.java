package com.example.investmentsapi.controller;

import com.example.investmentsapi.model.Investor;
import com.example.investmentsapi.model.Product;
import com.example.investmentsapi.service.InvestorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/investor")
public class InvestorController {

    private final InvestorService investorService;

    public InvestorController(InvestorService investorService) {
        this.investorService = investorService;
    }

    @PostMapping
    public ResponseEntity<Investor> createInvestor(@RequestBody Investor investor) {
        Investor createdInvestor = investorService.createInvestor(investor);
        return new ResponseEntity<>(createdInvestor, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Investor>> getAllInvestors() {
        List<Investor> investors = investorService.getAllInvestors();
        return new ResponseEntity<>(investors, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Investor> getInvestorById(@PathVariable Long id) {
        Optional<Investor> investor = investorService.getInvestorById(id);
        if (investor.isPresent()) {
            return new ResponseEntity<>(investor.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Investor> updateInvestor(@PathVariable Long id, @RequestBody Investor updatedInvestor) {
        Investor updated = investorService.updateInvestor(id, updatedInvestor);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInvestor(@PathVariable Long id) {
        investorService.deleteInvestor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}/products")
    public ResponseEntity<Set<Product>> getProductsForInvestor(@PathVariable Long id) {
        Optional<Investor> investor = investorService.getInvestorById(id);
        if (investor.isPresent()){
            Set<Product> products = investor.get().getProducts();
            return  new ResponseEntity<>(products, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
