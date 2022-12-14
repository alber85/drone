package com.musala.drone.dao.repo;

import com.musala.drone.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alber Rashad
 * @created 04/11/2022
 * @description
 */
@Repository
public interface MedicationRepo extends JpaRepository<Medication,Long> {
}
