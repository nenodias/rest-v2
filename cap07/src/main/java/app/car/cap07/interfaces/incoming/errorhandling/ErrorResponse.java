package app.car.cap07.interfaces.incoming.errorhandling;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class ErrorResponse {

    List<ErrorData> errors;

}
