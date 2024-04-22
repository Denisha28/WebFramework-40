<<<<<<< HEAD
package com.example.cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw1.model.Medicine;
import com.example.cw1.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepo medicineRepo;

    public Medicine createMedicine(Medicine medicine) {
        return medicineRepo.save(medicine);
    }
    public List<Medicine> getAllMedicines() {
        return (List<Medicine>) medicineRepo.findAll();
    }
    public Medicine getMedicineById(int medicineId) {
        return medicineRepo.findById(medicineId).orElse(null);
    }
}
=======
package com.example.cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw1.model.Medicine;
import com.example.cw1.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepo medicineRepo;

    public Medicine createMedicine(Medicine medicine) {
        return medicineRepo.save(medicine);
    }
    public List<Medicine> getAllMedicines() {
        return (List<Medicine>) medicineRepo.findAll();
    }
    public Medicine getMedicineById(int medicineId) {
        return medicineRepo.findById(medicineId).orElse(null);
    }
}
>>>>>>> 31af81c26196f8455dee2e81a03742efec086004
