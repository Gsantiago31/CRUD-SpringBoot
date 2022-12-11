package com.gsdesign.todoapp.mapper;

import com.gsdesign.todoapp.persistence.entity.Task;
import com.gsdesign.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;


@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task>{

    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();
        task.setHours(in.getHours());
        task.setCapacity(in.getCapacity());
        return task;
    }
}
