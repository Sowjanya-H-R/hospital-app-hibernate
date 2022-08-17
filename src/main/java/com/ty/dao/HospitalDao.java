package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Branch;
import com.ty.dto.Hospital;

public class HospitalDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		System.out.println("data stored");

	}

	public boolean removeHospitalbyId(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		} else {
			return false;

		}
	}

	public Hospital getHospitalById(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			return hospital;
		}
		return null;
	}

	public List<Branch> getAllOfBranchById(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			List<Branch> al = hospital.getBranch();

			return al;
		}
		return null;

	}

}
