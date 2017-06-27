package com.gasmonitor.dao;

import com.gasmonitor.entity.Device;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
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

        for (int i = 0; i < 10; i++) {
            Device device = new Device();
            device.setSiteId((long) 999);
            device.setLogic(1);
            device.setName("name");
            device.setCreated(new Date());
            device.setParent("name");
            device.setWatcher("watcher");
            device.setPhone("18081922618");
            device.setTokenId("tokendId");
            device.setStatus(1);
            deviceRepository.save(device);
        }

        deviceRepository.flush();
        List<Device> devices = deviceRepository.findBySiteId((long) 999);
        logger.info("查询到的所有的device:{}", devices);
//        assertThat(devices).extracting(device::getSiteId).containsOnly(device.getSiteId());
    }

    @Test
    public void testFindAll() {
        List<Device> devices = deviceRepository.findAll();
        logger.info("查询到的所有的device:{},{}", devices.size(), devices.toArray());
    }
}