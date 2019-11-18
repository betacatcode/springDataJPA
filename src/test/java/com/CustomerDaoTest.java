package com;

import com.dao.CustomerDao;
import com.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ruin
 * @date 2019/11/18-21:27
 */

//声明spring提供的单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定spring容器的配置信息
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerDaoTest {

    @Autowired
    private CustomerDao customerDao;

    @Test
    public void testFindOne(){
        Customer customer = customerDao.findOne(1l);
        System.out.println(customer);
    }

    /**
     * save：保存或者更新
     *      根据传递的对象是否存在主键id 如果没id保存 有id更新
     */
    @Test
    public void testSave(){
        Customer customer=new Customer();
        customer.setCustName("小九");
        customer.setCustLevel("vip");
        customer.setCustIndustry("it");
        customerDao.save(customer);
    }

    @Test
    public void testUpdate(){
        Customer customer=new Customer();
        customer.setCustId(4l);
        customer.setCustLevel("svip");
        customerDao.save(customer);
    }

}
