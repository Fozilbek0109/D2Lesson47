package uz.coder.lesson47.service;

import java.util.ArrayList;
import java.util.List;

import uz.coder.lesson47.models.QuestionModel;



public class QuestionModelImpl implements QuestionModelService{
    private List<QuestionModel> list;
    @Override
    public void add() {
        list = new ArrayList<>();
        list.add(new QuestionModel("Artel nima","Kompyuter","ruchka","Televizor","Operatsion sistema","Televizor"));
        list.add(new QuestionModel("Android nima","Kompyuter","ruchka","Televizor","Operatsion sistema","Operatsion sistema"));
        list.add(new QuestionModel("IOS nima","Kompyuter","ruchka","Televizor","Operatsion sistema","Operatsion sistema"));
        list.add(new QuestionModel("Windows nima","Kompyuter","ruchka","Televizor","Operatsion sistema","Operatsion sistema"));
    }

    @Override
    public List<QuestionModel> getList() {
        return list;
    }

}
