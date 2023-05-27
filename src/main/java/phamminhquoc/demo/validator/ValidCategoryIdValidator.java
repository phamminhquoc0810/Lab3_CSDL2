package phamminhquoc.demo.validator;

import phamminhquoc.demo.entity.Category;
import phamminhquoc.demo.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category !=null && category.getId() !=null;
    }
}
