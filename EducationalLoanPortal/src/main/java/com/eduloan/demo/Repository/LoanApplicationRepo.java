package com.eduloan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduloan.demo.Model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository <LoanApplicationModel,Integer>{

}
