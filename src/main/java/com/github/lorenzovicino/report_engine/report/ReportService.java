package com.github.lorenzovicino.report_engine.report;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ReportService {

    public String createReport(List<String> columns) {

        Report report = Report.builder()
                .build();

        return "";

    }
}
