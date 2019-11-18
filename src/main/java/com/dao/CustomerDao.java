package com.dao;

import com.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author ruin
 * @date 2019/11/18-21:20
 */

/**
 *  JpaRepository封装了基本CRUD操作
 *  JpaSpecificationExecutor封装了复杂查询
 */
public interface CustomerDao extends JpaRepository<Customer,Long>,JpaSpecificationExecutor<Customer> {
}
