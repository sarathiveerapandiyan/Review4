package com.educationloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.model.LoanApplicationModel;

@Repository
public interface LoanApplicationRepo extends JpaRepository <LoanApplicationModel,Integer>{

}
