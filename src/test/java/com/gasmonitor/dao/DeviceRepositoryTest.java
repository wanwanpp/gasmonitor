package com.gasmonitor.dao;

import com.gasmonitor.entity.Device;
import com.gasmonitor.utils.PageUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by saplmm on 2017/6/26.
 */

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class DeviceRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(DeviceRepositoryTest.class);

    @Autowired
    private DeviceRepository deviceRepository;

    @Test
    public void testFindByLastName() {
        Page<Device> list = deviceRepository.findBySiteId(1L, "", "", PageUtils.p(1));
        logger.info("得到的数据:{}", list.getContent());
    }

    @Test
    public void testFindAll() {
        List<Device> devices = deviceRepository.findAll();
        logger.info("查询到的所有的device:{},{}", devices.size(), devices.toArray());
    }
}