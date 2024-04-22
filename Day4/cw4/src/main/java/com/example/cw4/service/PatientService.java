<<<<<<< HEAD
package com.example.cw4.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.cw4.model.Patient;
import com.example.cw4.repository.PatientRepo;
 
@Service
public class PatientService {
    @Autowired
    private PatientRepo PatientRepo;
 
    public Patient createPatient(Patient Patient) {
        return PatientRepo.save(Patient);
    }
    public List<Patient> getAllPatients() {
        return (List<Patient>) PatientRepo.findAll();
    }
    public Patient getPatientById(int PatientId) {
        return PatientRepo.findById(PatientId).orElse(null);
    }
=======
package com.example.cw4.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.cw4.model.Patient;
import com.example.cw4.repository.PatientRepo;
 
@Service
public class PatientService {
    @Autowired
    private PatientRepo PatientRepo;
 
    public Patient createPatient(Patient Patient) {
        return PatientRepo.save(Patient);
    }
    public List<Patient> getAllPatients() {
        return (List<Patient>) PatientRepo.findAll();
    }
    public Patient getPatientById(int PatientId) {
        return PatientRepo.findById(PatientId).orElse(null);
    }
>>>>>>> 31af81c26196f8455dee2e81a03742efec086004
}