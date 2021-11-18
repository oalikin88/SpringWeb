package ru.ibs.spring.test.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ibs.spring.test.Student;
import ru.ibs.spring.test.StudentStorage;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/rest", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
public class RestStudentsController {

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("show")
    public Map<String, Object> show() {
        Map<String, Object> model = new HashMap<>();
        model.put("studentList", StudentStorage.getStudentList());
        return model;
    }

    @PostMapping("post")
    public Integer postExample(@RequestParam Integer id) {

        return id;
    }

    @GetMapping("path/{id}")
    public String pathVariableExample(@PathVariable String id) {
        return "";
    }

    @PostMapping("postbody")
    public Map<String, Object> postBodyExample(@RequestBody  Map<String, Object> inputData) throws JsonProcessingException {

        String mapped = objectMapper.writeValueAsString(new Student("name", null));

        return inputData;
    }

}
