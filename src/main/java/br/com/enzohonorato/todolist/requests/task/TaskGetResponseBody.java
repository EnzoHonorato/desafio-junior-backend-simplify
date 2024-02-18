package br.com.enzohonorato.todolist.requests.task;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskGetResponseBody {
    private Long id;
    private String name;
    private String description;
    private TaskPriority priority;
    private Boolean done;
}
