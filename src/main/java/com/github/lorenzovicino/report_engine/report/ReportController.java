package com.github.lorenzovicino.report_engine.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping("/create")
    public ResponseEntity<String> createReport(@RequestBody List<String> columns) {
        if (CollectionUtils.isEmpty(columns)) {
            return ResponseEntity.badRequest().body("Column list cannot be empty.");
        }

        String report = reportService.createReport(columns); 

        String reportDetails = "Report created : " + report;
        return ResponseEntity.ok(reportDetails);
    }

}
