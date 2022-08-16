package uz.pdp.bitcoin.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {
    private boolean isSuccess;
    private String message;
    private Object object;
    private String token;

    public ApiResponse(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }

    public ApiResponse(boolean isSuccess, String message, Object object) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.object = object;
    }
}
