package com.github.lorenzovicino.report_engine.report;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    
     @PostMapping("/create")
    public ResponseEntity<String> createReport(@RequestBody List<String> columns) {
        if (columns == null || columns.isEmpty()) {
            return ResponseEntity.badRequest().body("Column list cannot be empty.");
        }

        String reportDetails = "Report created with columns: " + String.join(", ", columns);
        return ResponseEntity.ok(reportDetails);
    }

}
