package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.api.IHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PatternHandler implements IHandler {

    private final Pattern seacher;

    public PatternHandler(String text){
        this.seacher = Pattern.compile(text);
    }

    @Override
    public final String handle(String example) {
        boolean isMatch = false;
        do{
            Matcher m = this.seacher.matcher(example);
            isMatch = m.find();
            if(isMatch) {
                double result = calc(m);
                do {
                    example = example.replace(m.group(), String.valueOf(result));
                } while (example.contains(m.group()));
            }
            }while (isMatch);
        return example;
    }
    protected abstract double calc(Matcher matcher);
}
