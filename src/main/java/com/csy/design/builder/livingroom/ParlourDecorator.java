package com.csy.design.builder.livingroom;

import javax.swing.*;
import java.awt.*;

/**
 * 客厅装修
 */
public class ParlourDecorator {
    public static void main(String[] args) {
        try {
            BaseDecorator d = new ConcreteDecorator1();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

//产品：客厅
class Parlour {
    //墙
    private String wall;
    //电视
    private String tv;
    //沙发
    private String sofa;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show() {
        JFrame jf = new JFrame("建造者模式测试");
        Container contentPane = jf.getContentPane();
        JPanel p = new JPanel();
        JScrollPane sp = new JScrollPane(p);
        String parlour = wall + tv + sofa;
        JLabel l = new JLabel(new ImageIcon("src/" + parlour + ".jpg"));
        p.setLayout(new GridLayout(1, 1));
        p.setBorder(BorderFactory.createTitledBorder("客厅"));
        p.add(l);
        contentPane.add(sp, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//抽象建造者：装修工人
abstract class BaseDecorator {
    //创建产品对象
    protected Parlour product = new Parlour();

    public abstract void buildWall();

    public abstract void buildTv();

    public abstract void buildSofa();

    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}

//具体建造者：具体装修工人1
class ConcreteDecorator1 extends BaseDecorator {
    @Override
    public void buildWall() {
        product.setWall("w1");
    }

    @Override
    public void buildTv() {
        product.setTv("TV1");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf1");
    }
}

//具体建造者：具体装修工人2
class ConcreteDecorator2 extends BaseDecorator {
    @Override
    public void buildWall() {
        product.setWall("w2");
    }

    @Override
    public void buildTv() {
        product.setTv("TV2");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf2");
    }
}

//指挥者：项目经理
class ProjectManager {
    private final BaseDecorator builder;

    public ProjectManager(BaseDecorator builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTv();
        builder.buildSofa();
        return builder.getResult();
    }
}