package com.gasmonitor.utils;

import com.gasmonitor.service.protobuf.Sitewhere;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by 王萍 on 2017/5/22 0022.
 */
public class GasDataUtil {

    /**
     * 产生随机数据模拟
     *
     * @return
     * @throws IOException
     */
    public byte[] produceGasData() throws IOException {

        //随机数
        Random random = new Random();
        //模拟设备号
        long id=1;

        //构造数据容器
//        GasMsg.GasDataBox.Builder boxBuilder = GasMsg.GasDataBox.newBuilder();
//        GasMsg.GasData.Builder gasBuilder = null;

        Sitewhere.Model.DeviceMeasurements.Builder deviceBuilder = Sitewhere.Model.DeviceMeasurements.newBuilder();

        Sitewhere.Model.Measurement.Builder pressure = Sitewhere.Model.Measurement.newBuilder();
        pressure.setMeasurementId("pressure");

        Sitewhere.Model.Measurement.Builder temperature = Sitewhere.Model.Measurement.newBuilder();
        temperature.setMeasurementId("temper");

        Sitewhere.Model.Measurement.Builder sflow = Sitewhere.Model.Measurement.newBuilder();
        sflow.setMeasurementId("sflow");

        Sitewhere.Model.Measurement.Builder wflow = Sitewhere.Model.Measurement.newBuilder();
        wflow.setMeasurementId("wflow");

        Sitewhere.Model.Measurement.Builder aflow = Sitewhere.Model.Measurement.newBuilder();
        aflow.setMeasurementId("aflow");

        Sitewhere.Model.Measurement.Builder time = Sitewhere.Model.Measurement.newBuilder();
        time.setMeasurementId("time");

//        metadata的作用暂未定
        Sitewhere.Model.Metadata.Builder metadata = Sitewhere.Model.Metadata.newBuilder();
        metadata.setName("name");
        metadata.setValue("value");

        //生成随机数据
        deviceBuilder.setHardwareId(String.valueOf(id));
        pressure.setMeasurementValue(random.nextDouble() * 100);
        temperature.setMeasurementValue(random.nextDouble() * 100);
        sflow.setMeasurementValue(random.nextDouble() * 100);
        wflow.setMeasurementValue(random.nextDouble() * 100);
        aflow.setMeasurementValue(random.nextDouble() * 100);
        time.setMeasurementValue(System.currentTimeMillis());

        deviceBuilder.addMeasurement(pressure);
        deviceBuilder.addMeasurement(temperature);
        deviceBuilder.addMeasurement(sflow);
        deviceBuilder.addMeasurement(wflow);
        deviceBuilder.addMeasurement(aflow);
        deviceBuilder.addMeasurement(time);

        deviceBuilder.addMetadata(metadata);

        Sitewhere.Model.DeviceMeasurements deviceMeasurements = deviceBuilder.build();
        id++;

        //序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        deviceMeasurements.writeTo(bos);
        byte[] bytes = bos.toByteArray();

        return bytes;
    }

    /**
     * 反序列化
     *
     * @param bytes
     * @return
     */
    public Sitewhere.Model.DeviceMeasurements consume(byte[] bytes) {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        try {
            return Sitewhere.Model.DeviceMeasurements.parseFrom(bis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
