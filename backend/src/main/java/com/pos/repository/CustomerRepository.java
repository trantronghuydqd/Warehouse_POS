package com.pos.repository;

import com.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
	List<Customer> findByDeletedAtIsNull();

	java.util.Optional<Customer> findByIdAndDeletedAtIsNull(UUID id);
}
