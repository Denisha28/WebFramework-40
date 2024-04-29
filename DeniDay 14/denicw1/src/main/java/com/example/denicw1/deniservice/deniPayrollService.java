package com.example.denicw1.deniservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.denicw1.denimodel.deniPayroll;
import com.example.denicw1.denirepository.deniPayrollRepo;

@Service
public class deniPayrollService {
    @Autowired
    deniPayrollRepo payrollRepo;

    public deniPayroll addPayroll(Long id,deniPayroll payroll)
    {
        deniPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else
        return null;
    }

    public Optional<deniPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
