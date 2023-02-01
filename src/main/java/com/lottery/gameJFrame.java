package com.lottery;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gameJFrame extends JFrame implements ActionListener {
    public gameJFrame() {
        ArrayList<Winner> list = ToolsClass.initParticipant();
        ArrayList<Prize> prList = ToolsClass.initPrize();
        ArrayList<Result>results=new ArrayList<>();
        initJFrame();
        initImage();
        chouPrize();
        this.setVisible(true);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("晚会抽奖");
        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//很多种关闭模式
        //取消默认的居中放置
        this.setLayout(null);
        JButton jbu=new JButton("抽奖");
        this.getContentPane().add(jbu);
        jbu.addActionListener(this);
        this.setVisible(true);

    }
    private void initImage(){
        JLabel jl=new JLabel("抽奖");
        this.getContentPane().add(jl);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        //chouPrize();


    }
    public void chouPrize(){
        //初始化抽奖人的姓名
        //初始化奖品信息
        //拆分代码，将功能放入工具类当中
        //调用toolClass中的initParticipant方法
        ArrayList<Winner> list = ToolsClass.initParticipant();
        //调用ToolClass中的initPrize方法
        ArrayList<Prize> prList = ToolsClass.initPrize();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入Yes or No:");
        String str=sc.nextLine();
        if(str.equalsIgnoreCase("No")){
            System.out.println("此次抽奖失败");
            return;
        }else if(!str.equalsIgnoreCase("Yes")){
            System.out.println("输入的数据不符合要求");
            return;
        }else{
            //程序开始抽奖
            ArrayList<Result>results=new ArrayList<>();
            //循环 循环的次数 奖品的总数是8
            while(list.size()>0&&prList.size()>0){
                //开始抽奖 获取随机索引
                int index=(int)(Math.random()*list.size());
                //根据索引对应相应的抽奖者
                Winner wn=list.get(index);
                Prize pr=prList.get(prList.size()-1);//获取奖品
                results.add(new Result(wn.getId(),wn.getName(),pr.getName()));
                if(pr.getCount()==1){
                    prList.remove(pr);//删除对应奖品
                }else{
                    pr.setCount(pr.getCount()-1);//个数-1
                }
                //删除上一轮中奖人的信息
                list.remove(index);//根据索引来删除对应信息
                System.out.println("本次中奖人是："+wn.getName()+"本次中奖人的ID是"+wn.getId()+"奖品为" +
                        pr.getName());
                System.out.println("中奖信息为：");
                for (int i = 0; i < results.size(); i++) {
                    System.out.println(results.get(i).getId()+","+results.get(i).getParticipantName()
                            +"        "+results.get(i).getParticipantName());

                }
            }
        }
    }


    }

