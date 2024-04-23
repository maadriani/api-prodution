package marwahadriani.simplejavaAPIProjectModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ResponseWeb<T> {
    
    private T data; 

    private String errors;
}
