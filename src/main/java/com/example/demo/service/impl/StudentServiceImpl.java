 public class StudentServiceImpl implements StudentService{

 }
 @Override
 public StudentEntity updatedata(int id,StudentEntity std){
    if(repo.existsById(id)){
        std.setId(id);
    }
 }