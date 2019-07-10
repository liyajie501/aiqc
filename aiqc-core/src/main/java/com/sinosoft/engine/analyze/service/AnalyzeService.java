package com.sinosoft.engine.analyze.service;

import com.sinosoft.engine.analyze.model.*;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public abstract class AnalyzeService {
    private static Logger logger = Logger.getLogger(AnalyzeService.class);


    public AnalyzeResult analyzeRule(RuleCore rule, AnalyzeResource res) {
        AnalyzeResult anRe = new AnalyzeResult();


        boolean result = false;


        boolean errorFlag = false;


        String errorContext = null;


        List<EleGroupResult> markList = new ArrayList<EleGroupResult>();
        String groupId = null;
        try {
            String ruleStr = rule.getContext();
            Pattern datePattern = Pattern.compile("\\w{1}\\d+");
            Matcher dateMatcher = datePattern.matcher(ruleStr);
            Boolean re = Boolean.valueOf(false);
            while (dateMatcher.find()) {


                EleGroupResult execResult = new EleGroupResult(dateMatcher.group());

                groupId = dateMatcher.group();

                re = Boolean.valueOf(analyzeEleGroup(rule, dateMatcher.group(), res, execResult));

                ruleStr = ruleStr.replaceFirst(dateMatcher.group(), re.toString());


                markList.add(execResult);

                groupId = null;
            }
            result = execJs(ruleStr);
        } catch (Exception e) {
            errorFlag = true;
            errorContext = e.getMessage();
            logger.error("分析规则" + ((groupId != null) ? ("[元素组=" + groupId + "]") : "") + "异常:" + JSONObject.fromObject(rule).toString(), e);
        }

        anRe.setResult(result);
        anRe.setErrorFlag(errorFlag);
        anRe.setErrorContext(errorContext);
        anRe.setMarkList(markList);

        return anRe;
    }


    public boolean execJs(String jsStr) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        Boolean d = (Boolean) engine.eval(jsStr);
        return d.booleanValue();
    }


    public List<StrPost> findStr(String str, String find) {
        List<StrPost> postList = null;
        int s = 0;
        int e = 0;
        int l = find.length();
        if (str.indexOf(find, s) > -1) postList = new ArrayList<StrPost>();
        while (str.indexOf(find, s) > -1) {
            s = str.indexOf(find, s);
            e = s + l;
            postList.add(new StrPost(s, e, find));

            s += e;
        }
        return postList;
    }


    public List<StrPost> findStrRegular(String str, String regex) {
        List<StrPost> postList = null;
        try {
            Pattern p = Pattern.compile("(" + regex + ")");
            Matcher m = p.matcher(str);
            while (m.find()) {
                if (postList == null) postList = new ArrayList<StrPost>();
                postList.add(new StrPost(m.start(), m.end(), m.group()));
            }
        } catch (Exception e) {
            logger.error("查找字符串出现次数与位置(正则方式查找)异常,请检查正则regex=" + regex, e);
        }
        return postList;
    }


    public String getEleValue(List<ProducerEleValueExt> eleList, String code) {
        if (eleList == null || StringUtils.isBlank(code)) return null;
        for (ProducerEleValueExt ele : eleList) {
            if (code.equals(ele.getCode())) return ele.getEleValue();
        }
        return null;
    }


    public abstract boolean analyzeEleGroup(RuleCore paramRuleCore, String paramString, AnalyzeResource paramAnalyzeResource, EleGroupResult paramEleGroupResult) throws Exception;


    public class StrPost {
        int start;

        int end;
        String text;

        public StrPost(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public StrPost(int start, int end, String text) {
            this(start, end);
            this.text = text;
        }


        public String getText() {
            return this.text;
        }


        public void setText(String text) {
            this.text = text;
        }


        public int getStart() {
            return this.start;
        }


        public void setStart(int start) {
            this.start = start;
        }


        public int getEnd() {
            return this.end;
        }


        public void setEnd(int end) {
            this.end = end;
        }
    }
}


