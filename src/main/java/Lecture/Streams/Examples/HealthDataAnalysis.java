package Lecture.Streams.Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HealthDataAnalysis {
    public static void main(String[] args) {
        List<HealthData> healthDataList = new ArrayList<>();
        healthDataList.add(new HealthData("Alice", "Blood Pressure", 120));
        healthDataList.add(new HealthData("Bob", "Blood Pressure", 130));
        healthDataList.add(new HealthData("Alice", "Body Temperature", 37.1));
        healthDataList.add(new HealthData("Bob", "Body Temperature", 36.9));
        healthDataList.add(new HealthData("Alice", "Heart Rate", 80));
        healthDataList.add(new HealthData("Bob", "Heart Rate", 75));

        Map<String, Double> averageValues = healthDataList.stream()
                .collect(Collectors.groupingBy(HealthData::getMeasurementType,
                        Collectors.averagingDouble(HealthData::getValue)));

        averageValues.forEach((measurementType, averageValue) ->
                System.out.println("Average " + measurementType + ": " + averageValue));
    }
}

class HealthData {
    private String patientName;
    private String measurementType;
    private double value;

    public HealthData(String patientName, String measurementType, double value) {
        this.patientName = patientName;
        this.measurementType = measurementType;
        this.value = value;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public double getValue() {
        return value;
    }
}

