package org.subins.webmvc.service;

import org.subins.webmvc.dto.TillRecordDTO;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joe on 08/02/15.
 */
@Service
public class CSVProcessorImpl implements CSVProcessor {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    CSVFormat format;

    public void init() {
        format = CSVFormat.RFC4180.withDelimiter(',');
    }

    @Override
    public List<TillRecordDTO> process(String csv) {
        CSVParser parser = null;
        List<TillRecordDTO> dtoList = null;
        try {
            dtoList = new ArrayList<>();
            parser = CSVParser.parse(csv, format);
            for(CSVRecord row : parser.getRecords()) {
                dtoList.add(new TillRecordDTO(row.get(0), row.get(1), row.get(2), row.get(3), row.get(4), row.get(5)));
            }
        } catch (Exception e) {
            logger.error("csv processing failed");
            logger.error(csv);
        }
        return dtoList;
    }

}
