package org.example;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class BenchSchedulerCLI {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/EmployeeProjects");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        BenchSchedulerCLI main = new BenchSchedulerCLI(dataSource);
        main.run();
    }

    public BenchSchedulerCLI(DataSource dataSource) {

    }

    public void run() {

    }
}