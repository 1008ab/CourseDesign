package com.lottery.lottery;

import java.util.ArrayList;
import java.util.Scanner;

/*需求初始化抽奖人的信息
    初始化奖品的信息
 */
public class ToolsClass {
    //容器 初始化一个抽奖人的初始容器
    static ArrayList<Winner>list =new ArrayList<>();
    public static ArrayList<Winner>initParticipant(){
        System.out.println("请输入参与抽奖人信息，多个用，间隔：");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();//抽奖人信息
        //非空判断
        if(str!=null&&!str.equals("")&&!str.equals("null")){
            String [] person=str.split(",");
            for (int i = 0; i < person.length; i++) {
                //往list容器中添加中奖人
                list.add(new Winner((i+1),person[i]));
            }

        }else{//递归调用
            initParticipant();
        }
        //输出参赛人员
        //遍历list容器
        for (int i = 0; i < list.size(); i++) {
            System.out.println(""+list.get(i).getName()+"");
        }
        return list;
    }//初始化奖品信息
    public static ArrayList<Prize> initPrize(){
        ArrayList<Prize>prList=new ArrayList<>();
        prList.add(new Prize("华为Mate50","一等奖",1));
        prList.add(new Prize("华为运动手表","二等奖",3));
        prList.add(new Prize("充电宝","三等奖",5));
        return prList;
    }


}
